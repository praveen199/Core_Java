package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaximunOdd {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(); 
		list.add(11); 
		list.add(43); 
		list.add(56); 
		list.add(82); 
		list.add(51); 
		list.add(29); 
		list.add(10); 
		
		int maxOdd = list.stream().filter(n -> n%2 == 1).max(Comparator.comparing(n ->n)).orElse(0);
		System.out.println(maxOdd);

	}

}
