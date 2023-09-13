package sampl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaExample {

public void main (String[] args) {
	
	
	// sum of two integers using lambda expression
	LambdaExampleInterface  sum = (x,y)-> x+y;
	int result = sum.sum(4, 8);
	System.out.println("the result is: " +result);

	
	
	//Comparator using Lambda
	
	List<String> strList = new ArrayList<>(Arrays.asList("ewrfae","wedsc","efewf"));
	
	Map<String,Integer> srtstr = strList.stream().collect(Collectors.toMap(k->k, v->v.length())).entrySet().stream()
			.sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
			.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(k,v)->k,LinkedHashMap::new));

System.out.println("sorted list:" +srtstr);


//Runnable using Lambda
Runnable run = ()->System.out.println("Thread is running using Runnable");
new Thread(run).start();

}
}
