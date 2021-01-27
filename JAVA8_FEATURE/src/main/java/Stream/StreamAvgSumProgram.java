package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAvgSumProgram {

	public static void main(String[] args) {

		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		primes.stream().max(Comparator.comparing(i ->i)).ifPresent(max -> System.out.println(max));
		primes.stream().min(Comparator.comparing(i ->i)).ifPresent(min -> System.out.println(min));
		primes.stream().mapToInt(i ->i).average().ifPresent(avg ->  System.out.println(avg));
		int sum1 = primes.stream().mapToInt(i -> i).sum();
		System.out.println(sum1);
		
		
		
	}

}
