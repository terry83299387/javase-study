package study.javase.collection;

import static org.junit.Assert.assertTrue;
import static study.javase.collection.beans.Position.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import study.javase.assist.SkippedRunner;
import study.javase.collection.beans.Employee;
import study.javase.collection.beans.Position;

@RunWith(SkippedRunner.class)
public class TestLists {

	protected static String tempPhoneFileName;
	protected static List<String> phoneNumbers;
	protected static List<Employee> employees;

	protected Lists lists;

	@BeforeClass
	public static void prepare() throws IOException {
		generateRandomPhoneNumbers();
		generateEmployees();
	}

	@Before
	public void init() {
		lists = new Lists();
	}

	@Test
	public void testReadPhoneNumbers() {
		List<String> result = lists.readPhoneNumbers(tempPhoneFileName);
		List<String> resultArrayList = new ArrayList<>(result);
		Collections.sort(resultArrayList);
		assertTrue(phoneNumbers.equals(resultArrayList));
	}

	@Test
	public void testReadAndSortPhoneNumbers() {
		List<String> result = lists.readAndSortPhoneNumbers(tempPhoneFileName);
		assertTrue(result.getClass().equals(ArrayList.class));
		assertTrue(phoneNumbers.equals(result));
	}

	@Test
	public void testReadPhoneNumbers2() {
		List<String> result = lists.readPhoneNumbers2(tempPhoneFileName);
		assertTrue(result.getClass().equals(LinkedList.class));
		List<String> resultArrayList = new ArrayList<>(result);
		Collections.sort(resultArrayList);
		assertTrue(phoneNumbers.equals(resultArrayList));

		String last = null;
		String tmp;
		for (String number : result) {
			tmp = number.substring(0, 3);
			if (last != null) {
				assertTrue("排序结果错误。", tmp.compareTo(last) >= 0);
			}
			last = tmp;
		}
	}

	@Test
	public void testRemoveEmployees() {
//		// 移除某个 Employee 之后，列表中哪些元素会被移除
//		// 注意：需要移除的元素索引应该从大到小降序书写，以保证按照索引移除时不会出现问题。
//		// 例如需要移除 7、8 两个元素，应写为 {8, 7}，而不是 {7, 8}。
//		int[][] removedEmployees = {
//			{1, 0},   {1, 0},  {2},      {4, 3},   {4, 3},
//			{6, 5},   {6, 5},  {8, 7},   {8, 7},   {11, 9},
//			{10},     {11, 9}, {13, 12}, {13, 12}, {15, 14},
//			{15, 14}, {16},    {17},     {18},     {19},
//			{20},     {21},    {22},     {23},     {24}, 
//		};

		for (int i = 0; i < employees.size(); i++) {
//			int[] removedIndexes = removedEmployees[i];
//			List<Employee> tempList = new ArrayList<>(employees);
//			List<Employee> expected = new ArrayList<>(employees);
//			for (int idx : removedIndexes) {
//				expected.remove(idx);
//			}
			List<Employee> tempList = new ArrayList<>(employees);
			List<Employee> expected = new ArrayList<>(employees);
			expected.remove(employees.get(i));

			lists.removeEmployees(tempList, employees.get(i));
			boolean equal = identityEquals(expected, tempList);
			assertTrue(equal);
		}
	}

	@Test
	public void testRemoveEmployees2() {
		List<Predicate<Employee>> testers = generateTesters();
		for (Predicate<Employee> tester : testers) {
			List<Employee> tempList = new ArrayList<>(employees);
			List<Employee> expected = new ArrayList<>(employees);
			expected.removeIf(tester);
			lists.removeEmployees2(tempList, tester);
			boolean equal = identityEquals(expected, tempList);
			assertTrue(equal);
		}
	}

	@Test
	public void testFindEmployees() {
		List<Predicate<Employee>> testers = generateTesters();
		for (Predicate<Employee> tester : testers) {
			List<Employee> tempList1 = new ArrayList<>(employees);
			List<Employee> tempList2 = new ArrayList<>(employees);
			List<Employee> expected = new ArrayList<>();
			for (Iterator<Employee> i = tempList2.iterator(); i.hasNext(); ) {
				Employee e = i.next();
				if (tester.test(e)) {
					i.remove();
					expected.add(e);
				}
			}
			List<Employee> result = lists.findEmployees(tempList1, tester);
			boolean equal = identityEquals(expected, result);
			Collections.reverse(expected);
			boolean equalReverse = identityEquals(expected, result);
			assertTrue(equal || equalReverse);
			equal = identityEquals(tempList2, tempList1);
			assertTrue(equal);
		}
	}

	@Test
	public void testSortEmployeesBySalary() {
		List<Employee> tempList = new ArrayList<>(employees);
		lists.sortEmployeesBySalary(tempList);

		assertTrue(tempList.size() == employees.size());

		Employee last = null;
		for (Employee e : tempList) {
			if (last != null) {
				assertTrue(last.getSalary() <= e.getSalary());
			}
			last = e;
		}
	}

	@Test
	public void testSortEmployees() {
		List<Employee> tempList = new ArrayList<>(employees);
		List<Employee> result = lists.sortEmployees(tempList);

		boolean equal = identityEquals(employees, tempList);
		assertTrue(equal);

		assertTrue(employees.size() == result.size());
		Employee last = null;
		for (Employee e : result) {
			if (last != null) {
				assertTrue(last.getSalary() <= e.getSalary());
			}
			last = e;
		}
	}

	@Test
	public void testUnion() {
		List<Employee> tempList = new ArrayList<>(employees);
		Collections.shuffle(tempList);
		int pos = (int) (tempList.size() * (Math.random() * 0.6 + 0.2));
		List<Employee> list1 = new ArrayList<>(tempList.subList(0, pos));
		List<Employee> list2 = new ArrayList<>(tempList.subList(pos, tempList.size()));

		lists.union(list1, list2);
		boolean equal = identityEquals(tempList, list1);
		assertTrue(equal);
		equal = identityEquals(tempList.subList(pos, tempList.size()), list2);
		assertTrue(equal);
	}
	

	// -----------------------------------

	// 随机生成 3000 ~ 8000 个电话号码
	protected static void generateRandomPhoneNumbers() throws IOException {
		File tempFile = File.createTempFile("phone", null);
		tempFile.deleteOnExit();
		tempFile.setReadOnly();
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
		Collections.sort(tempPN);
		phoneNumbers = Collections.unmodifiableList(tempPN);
	}

	// 生成 Employee 列表
	protected static void generateEmployees() {
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
			employee = new Employee(names[i], salaries[i], positions[i], phones[i],
					emails[i] == null || emails[i].length() == 0 ? emails[i] : (emails[i] + "@daxing.com"));
			tempEmployees.add(employee);
		}
		employees = Collections.unmodifiableList(tempEmployees);
	}

	protected static String randomPhoneNumber() {
		char[] number = new char[11];
		number[0] = '1';
		number[1] = (char) (Math.random() * 6 + '3');
		for (int i = 2; i < 11; i++) {
			number[i] = (char) (Math.random() * 10 + '0');
		}
		return new String(number);
	}

	// 比较两个 List 中的元素是否是全等的。如果两个 List 中包含相同的元素，并且顺序也相同，
	// 它们就是全等的。
	private boolean identityEquals(List<Employee> list1, List<Employee> list2) {
		if (list1.size() != list2.size()) return false;
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) != list2.get(i)) return false;
		}
		return true;
	}

	private List<Predicate<Employee>> generateTesters() {
		List<Predicate<Employee>> testers = new ArrayList<>();
		testers.add((e) -> e.getPosition() == QA);
		testers.add((e) -> e.getPosition() == BE);
		testers.add((e) -> e.getPosition() == MNG);
		testers.add((e) -> e.getPhone() == null || e.getPhone().length() == 0);
		testers.add((e) -> e.getPhone() != null && e.getPhone().length() > 0);
		testers.add((e) -> e.getPhone() != null && e.getPhone().startsWith("135"));
		testers.add((e) -> e.getPhone() != null && e.getPhone().endsWith("2"));
		testers.add((e) -> e.getEmail() == null);
		testers.add((e) -> e.getEmail() != null && e.getEmail().length() == 0);
		testers.add((e) -> e.getEmail() != null && (e.getEmail().equals("zhangjie") || e.getEmail().equals("qianxiaohao")));
		testers.add((e) -> e.getSalary() < 5000);
		testers.add((e) -> e.getSalary() > 7000);
		testers.add((e) -> e.getSalary() < 5000 || e.getSalary() > 7000);
		testers.add((e) -> e.getName().equals("李强"));
		testers.add((e) -> !e.getName().equals("李强"));
		testers.add((e) -> e.getSalary() > 5000 && !e.getName().equals("张杰") && (e.getEmail() == null || e.getEmail().length() == 0));
		testers.add((e) -> (e.getPosition() == BE || e.getPosition() == FE) && e.getSalary() < 6000);

		return testers;
	}
}
