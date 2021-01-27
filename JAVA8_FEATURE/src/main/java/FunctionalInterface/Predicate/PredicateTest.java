package FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

		Predicate<Integer> pr = a -> (a > 18); 
		System.out.println(pr.test(10)); 
	}

}
