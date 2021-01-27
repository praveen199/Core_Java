package FunctionalInterface.Function;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		Function<String, Integer> str = x -> x.length();
		Function<Integer, Integer> itr = x -> x*3;
		
		int result = str.andThen(itr).apply("praveen");
		System.out.println(result);
	}

}
