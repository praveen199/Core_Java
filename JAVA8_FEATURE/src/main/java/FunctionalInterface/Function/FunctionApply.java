package FunctionalInterface.Function;

import java.util.function.Function;

//https://www.geeksforgeeks.org/function-interface-in-java-with-examples/

public class FunctionApply {

	public static void main(String[] args) {
		Function<Integer, Double> half = a -> a / 2.0; 
		System.out.println(half.apply(10)); 
	}
}
