package study.javase.functional;

import java.util.ArrayList;
import java.util.List;

public class Aggregate {
	// TODO

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			numbers.add((int) (Math.random() * 100));
		}

		numbers.stream().forEach(n -> System.out.print(n + " "));
		System.out.println();

		System.out.println(numbers.stream().findFirst().get());
		numbers.stream().filter(n -> n > 50).forEach(n -> System.out.print(n + " "));
		System.out.println();
		System.out.println(numbers.stream().filter(n -> n <= 50).reduce((m, n) -> m + n).get());
		numbers.stream().sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();
	}
}
