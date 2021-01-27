package FunctionalInterface.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FindSumUsingFunction {
	static Integer addList(List<Integer> list){  
		return list.stream().mapToInt( i -> i).sum();  
	}  
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();  
		list.add(10);  
		list.add(20);  
		list.add(30);  
		list.add(40);  
		Function<List<Integer>, Integer> fun = FindSumUsingFunction::addList; 
		int sum = fun.apply(list);
		System.out.println(sum);
	}
	
}
