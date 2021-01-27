package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MultipleFilterExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10,20,15,45,67,3,4,45);
		
		// Multiple filters
		List<Integer> size = list.stream().filter(x -> x > 5 && x < 30).collect(Collectors.toList());
		System.out.println(size);
		
	} 

}
