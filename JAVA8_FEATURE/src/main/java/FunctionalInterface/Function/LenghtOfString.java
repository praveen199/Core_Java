package FunctionalInterface.Function;

import java.util.function.Function;

public class LenghtOfString {

	public static void main(String[] args) {

		Function<String, Integer> func  = x -> x.length();
		System.out.println(func.apply("praveen"));

	}

}
