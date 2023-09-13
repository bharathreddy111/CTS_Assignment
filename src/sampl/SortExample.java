package sampl;

import java.util.Arrays;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("asaa","hvhvh","nknk");
		list.stream().sorted().forEach(System.out::println);


	}

}
