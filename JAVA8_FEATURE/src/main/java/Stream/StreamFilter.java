package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
	public static void main(String[] args) {
		
	    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> itr = list.stream().filter(p -> p > 40).collect(Collectors.toList());
		System.out.println(itr);
		
	}
}
