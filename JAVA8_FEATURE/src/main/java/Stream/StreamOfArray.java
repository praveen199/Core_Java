package Stream;

import java.util.stream.Stream;

public class StreamOfArray {

	public static void main(String[] args) {

		Integer[] itr = new Integer[] {1,2,3,4,5,6,7,8,9} ;
		Stream<Integer> stream = Stream.of(itr);
		stream.forEach(s -> System.out.println(s));
	}
}
