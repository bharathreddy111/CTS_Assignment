package sampl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckEven {

	public static void main(String[] args) {
		List<Integer> Values = Arrays.asList(1,2,3,4,5,6,7,8,9);
		condition(Values, (n)->n%2==0);
	}
	
	public static void condition(List<Integer> values,Predicate<Integer> predicate) {
		for(Integer n: values) {
			if(predicate.test(n)) {
				System.out.println(n+" ");
			}
		}
	}

}
