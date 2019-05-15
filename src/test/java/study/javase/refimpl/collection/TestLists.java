package study.javase.refimpl.collection;

import static study.javase.collection.beans.Position.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;

import study.javase.collection.beans.Position;
import study.javase.refimpl.collection.beans.Employee;

public class TestLists extends study.javase.collection.TestLists {

	@BeforeClass
	public static void prepare() throws IOException {
		generateRandomPhoneNumbers();
		generateEmployees();
	}

	@Before
	public void init() {
		lists = new Lists();
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
}
