package FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Find all elements not start with ‘A’.
public class PredicateNegate {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		Predicate<String> startWithA = x-> x.startsWith("A");
		List<String> collect = list.stream().filter(startWithA.negate()).collect(Collectors.toList());
		System.out.println(collect);

	}

}
