package FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateOr {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		
		Predicate<String> lengthIsMoreThenThree = x -> x.length() == 3;
		Predicate<String> startWithA = x-> x.startsWith("A");
		
		List<String> collect = list.stream().filter(lengthIsMoreThenThree.or(startWithA)).collect(Collectors.toList());
		System.out.println(collect);
	}
}
