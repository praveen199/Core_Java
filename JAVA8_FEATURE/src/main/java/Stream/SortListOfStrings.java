package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStrings {

	public static void main(String[] args) {
		
		List<String> listOfLanguages = Arrays.asList(new String[] { "Python", "C++", "Java", "PHP" });
		 
        List<String> sortedListOfLanguages = listOfLanguages.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedListOfLanguages);
 
        List<String> sortedListOfLanguagesRev = listOfLanguages.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedListOfLanguagesRev);  
	}

}
