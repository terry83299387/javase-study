package study.javase.collection;

import java.util.List;
import java.util.Set;

import study.javase.collection.beans.Employee;

public class Sets {

	/**
	 * file 是一个存放手机号的文件，每行一个号码，每个号码是一个 11 位的数字，例如 138xxxxxxxx。
	 * 整个文件大约有几千个号码，请将这些号码读出来，去掉重复号码并返回。
	 */
	public Set<String> readPhoneNumbers(String file) {
		// TODO your code goes here
		return null;
	}

	/**
	 * list 是一个列表，里面包含有重复元素，请编写程序去除其中的重复元素。
	 */
	public <T> void removeDuplicate(List<T> list) {
		// TODO your code goes here
	}

	/**
	 * list 是一个列表，里面包含有重复元素，请编写程序去除其中的重复元素。同时确保去重后的列表中
	 * 剩下的元素的相对顺序与原列表相同。
	 * 例如原列表为 1, 4, 1, 3, 4, 5，去重后的列表应该为 1, 4, 3, 5。
	 */
	public <T> void removeDuplicate2(List<T> list) {
		// TODO your code goes here
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
	 */
	public List<Employee> removeDuplicateAndArrangeOrder(List<Employee> employees) {
		// TODO your code goes here
		return null;
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
		// TODO your code goes here
		return null;
	}

	/**
	 * TODO NavigableSet、LinkedHashSet、EnumSet
	 */
}
