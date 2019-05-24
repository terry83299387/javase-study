package study.javase.refimpl.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import study.javase.collection.beans.Employee;

public class Sets extends study.javase.collection.Sets {

	/**
	 * file 是一个存放手机号的文件，每行一个号码，每个号码是一个 11 位的数字，例如 138xxxxxxxx。
	 * 整个文件大约有几千个号码，请将这些号码读出来，去掉重复号码并返回。
	 */
	public Set<String> readPhoneNumbers(String file) {
		Set<String> set = new HashSet<>();
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			try (Scanner scanner = new Scanner(fileInputStream)) {
				while (scanner.hasNextLine()) {
					set.add(scanner.nextLine());
				}
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return set;
	}

	/**
	 * list 是一个列表，里面包含有重复元素，请编写程序去除其中的重复元素。
	 * （考察 Set.addAll(Collection) 或 Set(Collection) 构造方法的使用）
	 */
	public <T> void removeDuplicate(List<T> list) {
		Set<T> set = new HashSet<>(list);
		list.clear();
		list.addAll(set);
	}

	/**
	 * list 是一个列表，里面包含有重复元素，请编写程序去除其中的重复元素。同时确保去重后的列表中
	 * 剩下的元素的相对顺序与原列表相同。
	 * 例如原列表为 1, 4, 1, 3, 4, 5，去重后的列表应该为 1, 4, 3, 5。
	 * （考察 LinkedHashSet 的顺序保证特性）
	 */
	public <T> void removeDuplicate2(List<T> list) {
		Set<T> set = new LinkedHashSet<>(list);
		list.clear();
		list.addAll(set);
	}

	/**
	 * employees 是一个职员列表，里面包含有重复元素，请编写程序去除其中的重复元素，并对元素进行排序，
	 * 并返回去重后和排序后的列表。
	 * 请按照以下规则对列表中的职员进行降序排序：
	 * (1) 先按照 email 降序排序，没有 email 的职员排在有 email 的职员后面
	 * (2) 对于没有 email 的职员，按照 phone 降序排序，没有 phone 的职员排在有 phone 的职员后面
	 * (3) 如果既没有 email 也没有 phone，则先按照 name 降序然后按照 position 降序来排序
	 * （name 和 position 必然存在）
	 * (4) email、phone、name 按照字符串的自然顺序降序排序，position 则按照它们的
	 * 内置索引（即它们在 Position 中的声明顺序）降序排序。
	 * 注：可以直接对原列表进行修改，也可以维持不变，实现时可自由选择。
	 * （考察 TreeSet 的使用）
	 */
	public List<Employee> removeDuplicateAndArrangeOrder(List<Employee> employees) {
		Set<Employee> set = new TreeSet<>(Collections.reverseOrder());
		set.addAll(employees);
		List<Employee> list = new ArrayList<>(set);
		return list;

		// TODO 第二种实现方法
	}

	/**
	 * employees 是一个职员列表，里面包含有重复元素，请编写程序去除其中的重复元素，并对元素进行排序，
	 * 并返回去重后和排序后的列表。
	 * 请按照以下规则对列表中的职员排序：
	 * (1) 先按照职位的升序进行排序（按照在 Position 中的声明顺序）；
	 * (2) 职位相同的按照薪水降序排序；
	 * 注：可以直接对原列表进行修改，也可以维持不变，实现时可自由选择。
	 * （考察 TreeSet 的使用）
	 */
	public List<Employee> removeDuplicateAndArrangeOrder2(List<Employee> employees) {
		Set<Employee> set = new TreeSet<>((e1, e2) -> {
			int position = e1.getPosition().compareTo(e2.getPosition());
			if (position == 0) {
				return Double.compare(e2.getSalary(), e1.getSalary());
			}
			return position;
		});
		set.addAll(employees);
		List<Employee> ordered = new ArrayList<>(set);

		return ordered;
	}

	/**
	 * TODO NavigableSet、LinkedHashSet、EnumSet
	 */
}
