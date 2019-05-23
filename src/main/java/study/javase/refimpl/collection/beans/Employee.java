package study.javase.refimpl.collection.beans;

import study.javase.collection.beans.Position;

/**
 * 请实现 Employee 类，该类将主要作为集合中的元素，因此需要支持
 * 集合的查找、比较（见 {@link #equals(Object)} 方法）。
 */
public class Employee extends study.javase.collection.beans.Employee {

	public Employee() {
	}

	public Employee(String name, double salary, Position position, String phone, String email) {
		super(name, salary, position, phone, email);
	}

	/**
	 * 首先需要保证另一个对象是一个 Employee，然后根据以下描述来实现 equals() 方法：
	 * 
	 * (1) 如果两者中有一个的 email 存在（不为 null，也不为空字符串），并且 email
	 * 相同，则两者相等，不相同则不相等；
	 * (2) 两个 Employee 对象的 email 都不存在，则根据与 email 相同的规则来判断
	 * phone 是否相等；
	 * (3) 如果 phone 也都不存在，则根据 name 和 position 的组合来判断它们是否相等。
	 * （name 和 position 必然存在）
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o instanceof Employee) {
			// TODO
			return false;
		}

		return false;
	}

	@Override
	public int hashCode() {
		// TODO your code goes here
		return super.hashCode();
	}

	/**
	 * (1) 如果两个 Employee 的 email 都存在（不为 null，也不为空字符串），则根据 email 比较大小；
	 * (2) 如果有且只有一个 email 存在，那么存在 email 的 Employee 较大；
	 * (3) 如果两个对象的 email 都不存在，则根据与 email 相同的规则来比较 phone 的大小；
	 * (4) 如果 phone 也都不存在，则先根据 name 比较大小；如果 name 也相等，则根据 position 来比较大小。
	 * （name 和 position 必然存在，position 的大小以它们的索引值大小来比较）
	 */
	@Override
	public int compareTo(study.javase.collection.beans.Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}
}
