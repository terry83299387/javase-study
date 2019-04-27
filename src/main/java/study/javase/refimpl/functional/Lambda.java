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
	 * 
	 */

//	public static <T extends Comparable<T>> void arraySort(T[] data) {
//		Arrays.sort(data, (a, b) -> a.compareTo(b)); 
//	}
//
//	public static <T> void each(T[] array, Consumer<T> operation) {
//		for (T e : array) {
//			operation.accept(e);
//		}
//	}

//	public static void main(String[] args) {
//		Integer[] data = new Integer[100];
//		Arrays.setAll(data, (i) -> (int) (Math.random() * 1000));
//
//		each(data, (e) -> System.out.printf("%3d ", e));
//		System.out.println();
//
//		arraySort(data);
//
//		each(data, (e) -> System.out.printf("%3d ", e));
//		System.out.println();
//		System.out.println();
//	}
}
