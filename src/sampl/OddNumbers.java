package sampl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers {
	public static void main(String[] args) {
		List<Integer> Values = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> oddList = Values.stream().filter(a->a%2!=0).collect(Collectors.toList());
		System.out.println(oddList);

	}

}
