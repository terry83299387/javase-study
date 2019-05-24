package study.javase.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static study.javase.collection.beans.Position.BE;
import static study.javase.collection.beans.Position.FE;
import static study.javase.collection.beans.Position.MNG;
import static study.javase.collection.beans.Position.QA;
import static study.javase.collection.beans.Position.UI;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import study.javase.assist.SkippedRunner;
import study.javase.collection.beans.Employee;
import study.javase.collection.beans.Position;

@RunWith(SkippedRunner.class)
public class TestSets {

	protected String tempPhoneFileName;
	protected List<String> phoneNumbers;
	protected List<Employee> employees;
	protected Sets sets;

	@Before
	public void init() throws IOException {
		sets = new Sets();
		prepareData();
	}

	@Test
	public void testReadPhoneNumbers() {
		Set<String> expected = new HashSet<>(phoneNumbers);
		List<String> expectedList = new ArrayList<>(expected);
		Collections.sort(expectedList);

		Set<String> result = sets.readPhoneNumbers(tempPhoneFileName);
		List<String> resultList = new ArrayList<>(result);
		Collections.sort(resultList);

		assertTrue(expectedList.equals(resultList));
	}

	@Test
	public void testRemoveDuplicate() {
		Set<String> expected = new HashSet<>(phoneNumbers);
		List<String> expectedList = new ArrayList<>(expected);
		Collections.sort(expectedList);
		List<String> resultList = new ArrayList<>(phoneNumbers);
		sets.removeDuplicate(resultList);
		Collections.sort(resultList);
		assertTrue(expectedList.equals(resultList));

		Set<Employee> expected2 = new HashSet<>(employees);
		List<Employee> expectedList2 = new ArrayList<>(expected2);
		Collections.sort(expectedList2);
		List<Employee> resultList2 = new ArrayList<>(employees);
		sets.removeDuplicate(resultList2);
		Collections.sort(resultList2);
		assertTrue(expectedList2.equals(resultList2));
	}

	@Test
	public void testRemoveDuplicate2() {
		Set<String> expected = new LinkedHashSet<>(phoneNumbers);
		List<String> expectedList = new ArrayList<>(expected);
		List<String> resultList = new ArrayList<>(phoneNumbers);
		sets.removeDuplicate2(resultList);
		assertTrue(expectedList.equals(resultList));

		Set<Employee> expected2 = new LinkedHashSet<>(employees);
		List<Employee> expectedList2 = new ArrayList<>(expected2);
		List<Employee> resultList2 = new ArrayList<>(employees);
		sets.removeDuplicate2(resultList2);
		assertTrue(expectedList2.equals(resultList2));
	}

	@Test
	public void testRemoveDuplicateAndArrangeOrder() {
		Set<Employee> expected = new TreeSet<>(employees);
		List<Employee> expectedList = new ArrayList<>(expected);
		Collections.reverse(expectedList);

		List<Employee> tempList = new ArrayList<>(employees);
		List<Employee> resultList = sets.removeDuplicateAndArrangeOrder(tempList);

		assertTrue(expectedList.equals(resultList));
	}

	@Test
	public void testRemoveDuplicateAndArrangeOrder2() {
		Set<Employee> expected = new TreeSet<>((e1, e2) -> {
			int position = e1.getPosition().compareTo(e2.getPosition());
			if (position == 0) {
				return Double.compare(e2.getSalary(), e1.getSalary());
			}
			return position;
		});
		expected.addAll(employees);

		List<Employee> tempList = new ArrayList<>(employees);
		List<Employee> resultList = sets.removeDuplicateAndArrangeOrder2(tempList);

		assertEquals(expected.size(), resultList.size());

		Employee last = null;
		for (Employee e : resultList) {
			assertNotNull(e);
			if (last != null) {
				assertTrue(e.getPosition().compareTo(last.getPosition()) >= 0);
				if (e.getPosition() == last.getPosition()) {
					assertTrue(e.getSalary() <= last.getSalary());
				}
			}
			last = e;
		}
	}

	// -----------------------------------

	protected void prepareData() throws IOException {
		if (phoneNumbers == null) {
			generateRandomPhoneNumbers();
		}
		generateEmployees();
	}

	// 随机生成 3000 ~ 8000 个电话号码
	protected void generateRandomPhoneNumbers() throws IOException {
		File tempFile = File.createTempFile("phone", null);
		tempFile.deleteOnExit();
		tempPhoneFileName = tempFile.getAbsolutePath();

		int count = (int) (Math.random() * 5000) + 3000;
		List<String> tempPN = new ArrayList<>(count);
		try (PrintWriter writer = new PrintWriter(tempFile)) {
			for (int i = 0; i < count; i++) {
				String number = randomPhoneNumber();
				writer.println(number);
				tempPN.add(number);
			}
		}
		tempFile.setReadOnly();
		Collections.sort(tempPN);
		phoneNumbers = Collections.unmodifiableList(tempPN);
	}

	// 生成 Employee 列表
	protected void generateEmployees() {
		// 注释中的数字相同代表名字相同
		String[] names = {
			"李强"/*1*/,    "李强"/*1*/,  "李强"/*1*/,     "张杰"/*2*/,   "张杰"/*2*/,
			"张杰"/*2*/,    "张杰"/*2*/,   "李文丽"/*3*/,  "李文丽"/*3*/,  "王建军"/*4*/,
			"王建军"/*4*/,  "王建军"/*4*/,  "王文文"/*5*/,  "王文文"/*5*/,  "张敏"/*6*/,
			"张敏"/*6*/,    "秦飒"/*7*/,   "秦飒"/*7*/,    "钱小豪"/*8*/,  "欧阳坤"/*9*/,
			"刘博宇"/*10*/, "吴胜奇"/*11*/, "吴佩琪"/*12*/, "沈继鹏"/*13*/, "苏菲"/*14*/,
		};
		double[] salaries = {
			5780,    5780,    5315.3,   7218.8,   7218.8,
			5225,    5225,    6639.7,   4895.6,   6213.5,
			7395.4,  4258.97, 5813,     4587.8,   6312.5,
			6312.5,  7358.8,  6667,     7358.8,   4258.97,
			8475,    4857.9,  6675.8,   4757,     7868.7,
		};
		Position[] positions = {
			QA,   QA,   QA,   FE,   BE,
			UI,   MNG,  UI,   UI,   MNG,
			MNG,  FE,   BE,   BE,   FE,
			FE,   FE,   FE,   BE,   QA,
			BE,   BE,   BE,   BE,   BE,
		};
		String[] phones = {
			"13485621839", "",            "13485621839",  "13575834742", "13575834742",
			"13575834742", "13575834742", "13575834742",  "18347857357", "13447574641",
			null,          "13447574641", null,           null,          "13577946778",
			"13577946778", "15873584982", "15873584982",  "13577693247", "15772348744",
			"15772348744", "",            "",             null,             null,
		};
		// 注释中的数字代表名字，数字和字母都相同代表两个对象相等
		String[] emails = {
			"liqiang"/*1a*/,  "liqiang"/*1a*/, null/*1b*/,      "zhangjie"/*2a*/,    "zhangjie"/*2a*/,
			""/*2b*/,         null/*2b*/,      "liwenli"/*3a*/, "liwenli"/*3a*/,     ""/*4a*/,
			null/*4b*/,       ""/*4a*/,        ""/*5a*/,        null/*5a*/,          "zhangmin"/*6a*/,
			"zhangmin"/*6a*/, "qinlan"/*7a*/,  null/*7b*/,      "qianxiaohao"/*8a*/, ""/*9a*/,
			"liuboyu"/*10a*/, null/*11a*/,     null/*12a*/,     null/*13a*/,         "sufei"/*14a*/,
		};
		List<Employee> tempEmployees = new ArrayList<>();
		Employee employee;
		for (int i = 0; i < names.length; i++) {
			employee = createEmployee(names[i], salaries[i], positions[i], phones[i], emails[i]);
			tempEmployees.add(employee);
		}
		employees = Collections.unmodifiableList(tempEmployees);
	}

	protected Employee createEmployee(String name, double salary, Position position, String phone, String email) {
		Employee employee = new Employee(name, salary, position, phone,
				email == null || email.length() == 0 ? email : (email + "@myemail.com"));
		return employee;
	}

	protected String randomPhoneNumber() {
		char[] number = new char[11];
		number[0] = '1';
		number[1] = (char) (Math.random() * 6 + '3');
		for (int i = 2; i < 11; i++) {
			number[i] = (char) (Math.random() * 10 + '0');
		}
		return new String(number);
	}
}
