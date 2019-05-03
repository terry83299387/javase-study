package study.javase.refimpl.functional;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda {

	/**
	 * array 是一个 T 类型的数组，operation 是一个 Consumer<T> 对象。
	 * 请遍历 array 数组，并对每个元素使用 operation 进行处理。
	 */
	public <T> void each(T[] array, Consumer<T> operation) {
		// TODO your code goes here
	}

	/**
	 * array 是一个 T 类型的数组，tester 是一个 Predicate<T> 对象。
	 * 请使用 tester 测试 array 中的元素，并根据测试情况返回结果：
	 * (1) 如果对数组中的每一项，tester 都返回 true，则方法返回 true
	 * (2) 否则，方法返回 false
	 */
	public <T> boolean all(T[] array, Predicate<T> tester) {
		// TODO your code goes here
		return false;
	}

	/**
	 * array 是一个 T 类型的数组，tester 是一个 Predicate<T> 对象。
	 * 请使用 tester 测试 array 中的元素，并根据测试情况返回结果：
	 * (1) 如果数组中有任何一项，tester 返回 true，则方法返回 true
	 * (2) 如果数组中的每一项，tester 都返回 false，则方法返回 false
	 */
	public <T> boolean any(T[] array, Predicate<T> tester) {
		// TODO your code goes here
		return false;
	}

	/**
	 * array 是一个 T 类型的数组，factory 是一个 Supplier<T> 对象。
	 * 请使用 factory 来生成元素值，并依次填充到数组中。
	 */
	public <T> T[] fill(T[] array, Supplier<T> factory) {
		// TODO your code goes here
		return null;
	}

	/**
	 * array 是一个 T 类型的数组，mapper 是一个 Function<T, U> 对象。
	 * 请使用 mapper 对 array 中的每一项做转换，转换结果放入另一个数组中并返回。
	 */
	public <T, U> U[] map(T[] array, Function<T, U> mapper) {
		// TODO your code goes here
		return null;
	}

	/**
	 * array 是一个 T 类型的数组，mapper 是一个 UnaryOperator<T> 对象。
	 * 请使用 mapper 对 array 中的每一项做转换，转换结果放入另一个数组中并返回。
	 */
	public <T> T[] mapAsSameType(T[] array, UnaryOperator<T> mapper) {
		// TODO your code goes here
		return null;
	}

	/**
	 * array1 和 array2 是两个类型分别为 T 和 U 的数组，且长度相同，testEqual 是一个
	 * BiPredicate<T, U> 对象。
	 * 请使用 testEqual 将 array1 中的每一项和 array2 中的对应项做比较（对应项是指索引相同的项），
	 * 找出 array1 中那些与 array2 中的对应项相等的项，将它们放到一个新的数组中并返回。
	 */
	public <T, U> U[] filter(T[] array1, U[] array2, BiPredicate<T, U> testEqual) {
		// TODO your code goes here
		return null;
	}

	/**
	 * 请使用 {@link java.util.Arrays#sort(Object[], java.util.Comparator)} 来对传入的数组 array
	 * 进行排序。其中 Comparator 参数为一个 Lambda 表达式，在表达式中通过调用 T 的 compareTo() 方法实现
	 * 元素的比较。
	 */
	public <T extends Comparable<T>> void sort(T[] array) {
		// TODO your code goes here
	}

	/**
	 * 请使用 {@link Lambda#each(Object[], Consumer)} 来打印一个 double 数组，
	 * 打印操作使用 {@link System#out} 完成，每个数字需要打印到单独的行上。
	 */
	public void printEachNumber(double[] numbers) {
		// TODO your code goes here
	}

	/**
	 * 请使用 {@link Lambda#map(Object[], Function)} 将 int 数组转换为 Integer 数组，
	 * 后者中的每一项都是前者的 Integer 包装对象。
	 */
	public Integer[] intsToIntegers(int[] ints) {
		// TODO your code goes here
		return null;
	}

	/**
	 * options 是传入某个程序的参数，请使用 {@link Lambda#all(Object[], Predicate)}
	 * 来对参数的格式进行检查，确保每个参数的格式都是正确的。
	 * 该程序要求参数的格式必须满足以下要求：
	 * 
	 * (1) 以“-”开头，后面加上一个字母（大小写均可）。如“-a”、“-D”
	 * (2) 以“--”开头，后面加上两个或以上字母（必须全小写）。如“--clean”、“--help”
	 * 
	 * 返回：如果参数格式都正确，返回 true；否则返回 false。
	 */
	public boolean validateOptions(String[] options) {
		// TODO your code goes here
		return false;
	}

	/**
	 * TODO Lambda 表达式的编写（通过回调传入 Lambda 表达式）
	 */

}
