package FunctionalInterface.Consumer;

import java.util.function.Consumer;

public class ConsumerAccept {

	public static void main(String[] args) {

		Consumer<Integer> display = a -> System.out.println(a); 
		display.accept(10); 
		
		
	}

}
