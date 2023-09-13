package sampl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringExample {
	
	public String lowerCaseString(String s) {
		return s.toLowerCase();
	}

	public static void main(String[] args) {
		
		
		
		// Strings to UpperCase
		List<String> list = Arrays.asList("asaa","asdsad","asda");
		list.stream().map(String::toUpperCase).forEach(System.out::println);
	
		// filter strings that are less than 4 characters long and concaenate the remaining
		
	String result =	list.stream().map(String::toUpperCase).filter(s->s.length()>4).reduce("",(a,b)->a+b);
		
	System.out.println("Concatenated Reduced String :" +result);


	//Function Composition
	
	Function<Integer,Integer> f1=n->n*2;
	Function<Integer,Integer> f2=n->n+3;
	Function<Integer,Integer> res=f1.compose(f2);
	int finres = res.apply(4);
	System.out.println("the result is : "+finres);
	
	
	
	
	}

}
