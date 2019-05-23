package study.javase.refimpl.collection.beans;

import study.javase.collection.beans.Position;

public class TestEmployee extends study.javase.collection.beans.TestEmployee {

	// -----------------------------------

	protected Employee createEmployee(String name, double salary, Position position, String phone, String email) {
		return new Employee(name, salary, position, phone, email);
	}
}
