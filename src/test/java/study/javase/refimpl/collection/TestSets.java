package study.javase.refimpl.collection;

import java.io.IOException;

import org.junit.Before;

import study.javase.collection.beans.Position;
import study.javase.refimpl.collection.beans.Employee;

public class TestSets extends study.javase.collection.TestSets {

	@Before
	public void init() throws IOException {
		sets = new Sets();
		prepareData();
	}

	protected Employee createEmployee(String name, double salary, Position position, String phone, String email) {
		Employee employee = new Employee(name, salary, position, phone,
				email == null || email.length() == 0 ? email : (email + "@myemail.com"));
		return employee;
	}
}
