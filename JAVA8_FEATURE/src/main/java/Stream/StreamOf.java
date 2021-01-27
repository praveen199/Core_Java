package Stream;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1,2,3,4);
		stream.forEach(s -> System.out.println(s));
	}
}
