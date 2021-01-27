package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfIntegers {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(new Integer[] {40,34,21,37,20});
		 
        List<Integer> result = listOfIntegers.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
 
        List<Integer> reverseOrder = listOfIntegers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder);

	}

}
