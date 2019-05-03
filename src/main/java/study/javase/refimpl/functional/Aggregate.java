package study.javase.refimpl.functional;

import java.util.stream.DoubleStream;

public class Aggregate {

	/**
	 * temperatures 为去年一年的每日平均温度（摄氏度）。请使用聚合操作从其中找出那些让人感觉
	 * 舒适的日子的温度，即平均温度范围在 18 ~ 26 摄氏度之间。
	 * 返回的数组的元素顺序需要与原数组的顺序保持一致。
	 */
	public int[] comfortableDays(int[] temperatures) {
		// TODO your code goes here
		return null;
	}

	/**
	 * amounts 为去年一年平台上的所有交易的交易额组成的 Stream（交易笔数可能很大）。
	 * 请使用聚合操作计算全年的交易总额。
	 */
	public double totalAmount(DoubleStream amounts) {
		// TODO your code goes here
		return 0.0d;
	}

	/**
	 * TODO Collector
	 */

	/**
	 * TODO parallel
	 */

	/**
	 * 请使用串行方式的聚合操作（非并行）来计算一个 int 数组的平均值。
	 */
	public double average(int[] ints) {
		// TODO your code goes here
		return 0.0d;
	}

	/**
	 * 请使用并行方式的聚合操作来计算一个 int 数组的平均值。
	 */
	public double averageParallel(int[] ints) {
		// TODO your code goes here
		return 0.0d;
	}

}
