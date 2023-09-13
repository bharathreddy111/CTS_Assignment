package sampl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Part3Task {
		public static void main(String[] args) {
			
			//Check if number is even 
			List<Integer> Values = Arrays.asList(1,2,3,4,5,6,7,8,9);
			condition(Values, (n)->n%2==0);
			
			
	//Check if string length is greater than 5	
		Predicate<String> hasGreaterLen = s-> s.length()>5;
		boolean res = hasGreaterLen.test("hello world");
		System.out.println("String length is greater than 5" +res);
	
		
	//check the length of a string 
		Function<String,Integer> function = s->s.length();
		System.out.println("the length of the string is : " + function.apply("hello java"));
		
		
		
	// convert given string to lowercase
		Function<String,String> function1 = s->s.toLowerCase();
		System.out.println("the result lowercase string is : " + function1.apply("ADEDHBEY"));
		
		
}
		
		
		
		
		
		//Check if number is even Condition
		public static void condition(List<Integer> values,Predicate<Integer> predicate) {
			for(Integer n: values) {
				if(predicate.test(n)) {
					System.out.println(n+" ");
				}
			}
			
			
			
		}


}
