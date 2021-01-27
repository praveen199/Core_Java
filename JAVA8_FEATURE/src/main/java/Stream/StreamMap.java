package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");
		List<String> answer = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(answer);
	}

}
