package study.javase.collection.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import study.javase.assist.SkippedRunner;

@RunWith(SkippedRunner.class)
public class TestEmployee {

	private List<Employee> employees;

	@Before
	public void init() {
		List<Employee> tempList = new ArrayList<>();

		tempList.add(createEmployee("liqiang", 5230, Position.UI, "13485621839", "liqiang"));
		tempList.add(createEmployee("liqiang", 5230, Position.UI, "18347857357", "zhangyong"));
		tempList.add(createEmployee("zhangyong", 4890.5, Position.QA, "18347857357", "liqiang")); // 2
		tempList.add(createEmployee("liqiang", 5230, Position.UI, "18347857357", ""));
		tempList.add(createEmployee("zhangyong", 6637.34, Position.MNG, "18347857357", null));
		tempList.add(createEmployee("wanggang", 6125, Position.QA, "18347857357", null)); // 5
		tempList.add(createEmployee("wanggang", 6125, Position.QA, "13577946778", null));
		tempList.add(createEmployee("wanggang", 6125, Position.QA, "", null));
		tempList.add(createEmployee("wanggang", 5378.4, Position.QA, null, null)); // 8
		tempList.add(createEmployee("wanggang", 6125, Position.BE, null, null));
		tempList.add(createEmployee("liqiang",  6125, Position.QA, null, null)); // 10

		employees = Collections.unmodifiableList(tempList);
	}

	@Test
	@SuppressWarnings("unlikely-arg-type")
	public void testEquals() {
		Employee[] a = new Employee[employees.size()];
		employees.toArray(a);
		Employee[][] t = {
			{a[0], a[1]}, {a[0], a[2]},  {a[0], a[3]},  {a[0], a[4]}, {a[3], a[4]},
			{a[4], a[5]}, {a[5], a[6]},  {a[6], a[7]},  {a[6], a[8]}, {a[7], a[8]},
			{a[7], a[9]}, {a[7], a[10]}, {a[9], a[10]},
		};
		boolean[] results = {
			false,        true,          false,         false,        true,
			true,         false,         false,         false,        true,
			false,        false,         false,
		};

		boolean expected, result;
		for (int i = 0; i < t.length; i++) {
			expected = results[i];
			result = t[i][0].equals(t[i][1]);
			assertEquals(expected, result);
		}

		// compare to null
		for (Employee e : employees) {
			result = e.equals(null);
			assertFalse(result);
		}

		// compare to other types
		result = employees.get(0).equals("string");
		assertFalse(result);
	}

	@Test
	public void testHashCode() {
		Employee[] a = new Employee[employees.size()];
		employees.toArray(a);
		Employee[][] t = {
			{a[0], a[2]},  {a[3], a[4]}, {a[4], a[5]}, {a[7], a[8]},
		};

		int hash1, hash2;
		for (int i = 0; i < t.length; i++) {
			hash1 = t[i][0].hashCode();
			hash2 = t[i][1].hashCode();
			assertEquals(hash1, hash2);
		}
	}

	@Test
	public void testCompareTo() {
		assertTrue(employees.get(0).compareTo(employees.get(1)) < 0);
		assertTrue(employees.get(1).compareTo(employees.get(0)) > 0);
		assertTrue(employees.get(0).compareTo(employees.get(2)) == 0);
		assertTrue(employees.get(0).compareTo(employees.get(3)) > 0);
		assertTrue(employees.get(3).compareTo(employees.get(0)) < 0);
		assertTrue(employees.get(3).compareTo(employees.get(4)) == 0);
		assertTrue(employees.get(4).compareTo(employees.get(5)) == 0);
		assertTrue(employees.get(5).compareTo(employees.get(6)) > 0);
		assertTrue(employees.get(6).compareTo(employees.get(5)) < 0);
		assertTrue(employees.get(6).compareTo(employees.get(7)) > 0);
		assertTrue(employees.get(7).compareTo(employees.get(6)) < 0);
		assertTrue(employees.get(7).compareTo(employees.get(8)) == 0);
		assertTrue(employees.get(7).compareTo(employees.get(9)) > 0);
		assertTrue(employees.get(9).compareTo(employees.get(7)) < 0);
		assertTrue(employees.get(7).compareTo(employees.get(10)) > 0);
		assertTrue(employees.get(10).compareTo(employees.get(7)) < 0);
	}

	// -----------------------------------

	protected Employee createEmployee(String name, double salary, Position position, String phone, String email) {
		return new Employee(name, salary, position, phone, email);
	}
}
