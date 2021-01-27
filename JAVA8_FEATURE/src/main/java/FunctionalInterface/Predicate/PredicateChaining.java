package FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//https://mkyong.com/java8/java-8-predicate-examples/
public class PredicateChaining {

	public static void main(String[] args) {

		Predicate<String> startWithA = x -> x.startsWith("a");
		Predicate<String> startWithM = x -> x.startsWith("m");
		
		boolean result = startWithA.or(startWithM).test("mkyong");
		
	}

}
