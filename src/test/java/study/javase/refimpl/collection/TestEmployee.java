package study.javase.refimpl.collection;

import study.javase.collection.beans.Employee;
import study.javase.collection.beans.Position;

public class TestEmployee extends study.javase.collection.TestEmployee {

	protected Employee createEmployee(String name, double salary, Position position, String phone, String email) {
		return new study.javase.refimpl.collection.beans.Employee(name, salary, position, phone, email);
	}
}
