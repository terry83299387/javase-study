package study.javase.collection;

import java.util.List;
import java.util.function.Predicate;

import study.javase.collection.beans.Employee;

public class Lists {

	/**
	 * file 是一个存放手机号的文件，每行一个号码，每个号码是一个 11 位的数字，例如 138xxxxxxxx。
	 * 整个文件大约有几千个号码，请将这些号码读出来并返回。
	 * 注：没有特别要求，只需将所有号码读到一个 List 中即可。
	 */
	public List<String> readPhoneNumbers(String file) {
		// TODO your code goes here
		return null;
	}

	/**
	 * file 是一个存放手机号的文件，每行一个号码，每个号码是一个 11 位的数字，例如 138xxxxxxxx。
	 * 整个文件大约有几千个号码，请将这些号码读到一个 List 中。
	 * 由于后面要频繁查找号码，因此接下来需要将这些号码按照自然顺序升序排序，从而使得后续可以用
	 * 二分法来加速查找。
	 * 注：不需要手动实现排序操作，可以借助 {@link java.util.Collections#sort(List)} 等工具。
	 */
	public List<String> readAndSortPhoneNumbers(String file) {
		// TODO your code goes here
		return null;
	}

	/**
	 * file 是一个存放手机号的文件，每行一个号码，每个号码是一个 11 位的数字，例如 138xxxx5819。
	 * 整个文件大约有几千个号码，请将这些号码读到一个 List 中。
	 * 后续可能会经常对返回的 List 做以下操作：
	 * 
	 * (1) 可能会经常向其中添加号码，一次可能会添加多条，但每次添加的都是同一个号码段的号码
	 * （号码的前 3 位决定其所属号码段）
	 * (2) 可能会经常从其中删除号码，一次可能会删除多条，但每次只会删除同一个号码段的号码
	 * (3) 相比较之下，单纯的查找操作倒不太多
	 * 
	 * 根据以上三点，为了提高操作效率，需要选择合适的 List 实现来存放号码，并且要对号码进行排序，
	 * （排序时仅需按照前 3 位来排序即可）。
	 */
	public List<String> readPhoneNumbers2(String file) {
		// TODO your code goes here
		return null;
	}

	/**
	 * 请从职员列表中移除「所有」与指定 Employee 相等的职员。
	 * 注：本题和后面的一些题目需要先完成 Employee 类中的 equals 和 hashCode 方法。
	 */
	public void removeEmployees(List<Employee> employees, Employee employee) {
		// TODO your code goes here
	}

	/**
	 * employees 是职员列表，请从中移除所有满足 tester 条件的职员。
	 */
	public void removeEmployees2(List<Employee> employees, Predicate<Employee> tester) {
		// TODO your code goes here
	}

	/**
	 * employees 是职员列表，请找出所有满足 tester 条件的职员，将他们从原列表中移除，
	 * 并添加到新列表，然后返回新列表
	 */
	public List<Employee> findEmployees(List<Employee> employees, Predicate<Employee> tester) {
		// TODO your code goes here
		return null;
	}

	/**
	 * 对一个 Employee 列表按薪水（salary）升序排序。
	 */
	public void sortEmployeesBySalary(List<Employee> employees) {
		// TODO your code goes here
	}

	/**
	 * 有时候既希望对列表排序，又不想改变原列表，因此在排序前需要将原列表复制一份，然后对
	 * 复制的列表进行排序，最后返回排序后的列表，这样原列表可以维持不变。
	 * 请按照以上要求对 employees 列表按照薪水（salary）升序排序，并返回排序后的列表。
	 */
	public List<Employee> sortEmployees(List<Employee> employees) {
		// TODO your code goes here
		return null;
	}

	/**
	 * list1 与 list2 是两个职员列表，请将 list2 添加到 list1 的最后
	 * （即将 list2 合并到 list1）。
	 * （并集）
	 */
	public void union(List<Employee> list1, List<Employee> list2) {
		// TODO your code goes here
	}

	/**
	 * list1 与 list2 是两个职员列表，请从 list1 中移除那些不存在于 list2 的职员。
	 * （即仅保留 list1 中同时也存在于 list2 中那些的职员）
	 * （交集）
	 */
	public void intersection(List<Employee> list1, List<Employee> list2) {
		// TODO your code goes here
	}

	/**
	 * list1 与 list2 是两个职员列表，请从 lis1 中移除所有存在于 list2 中的职员。
	 * （即仅保留 list1 中那些不存在于 list2 中的职员）
	 * （补集）
	 */
	public void supplementary(List<Employee> list1, List<Employee> list2) {
		// TODO your code goes here
	}

	/**
	 * TODO ListIterator
	 */
}
