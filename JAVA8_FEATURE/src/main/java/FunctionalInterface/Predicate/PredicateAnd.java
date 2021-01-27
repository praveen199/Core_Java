package FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//https://mkyong.com/java8/java-8-predicate-examples/
public class PredicateAnd {

	public static void main(String[] args) {

		Predicate<Integer> greaterThanTen = (i) -> i > 10; 
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
		System.out.println(result); 

		//Predicate.and()
		List<Integer> list = Arrays.asList(10,20,15,45,67,3,4,45);
		Predicate<Integer> moreThenfive = x -> x>5;
		Predicate<Integer> lessThenThirty = x-> x<30;
		List<Integer> collect = list.stream().filter(moreThenfive.and(lessThenThirty)).collect(Collectors.toList());
		System.out.println(collect);

	}

}
