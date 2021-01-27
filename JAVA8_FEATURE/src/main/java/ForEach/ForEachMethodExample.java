package ForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();  
        list.add("Maths");  
        list.add("English");  
        list.add("French");  
        list.add("Sanskrit");
        list.add("Abacus");
        System.out.println("------------Subject List--------------");  
        
        //list.forEach(sub -> System.out.println(sub));  
        
        list.forEach(System.out :: println);
		
	}
}
