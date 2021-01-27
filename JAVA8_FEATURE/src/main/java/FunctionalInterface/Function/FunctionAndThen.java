package FunctionalInterface.Function;

import java.util.function.Function;

public class FunctionAndThen {

	public static void main(String[] args) {

		Function<Integer, Double> half = a -> a / 2.0;
		half = half.andThen(a -> a * 3.);
		System.out.println(half.apply(10));
		
	}

}
