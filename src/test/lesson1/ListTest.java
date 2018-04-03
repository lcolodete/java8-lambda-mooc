package test.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("twelve");
		list.add("one");
		list.add("three");
		list.add("four");
		
		System.out.println(list);
		
		list.sort((x, y) -> x.length() - y.length());
		
		System.out.println(list);
		
//		list.replaceAll(s -> s.toUpperCase());
		list.replaceAll(String::toUpperCase);
		
		System.out.println(list);
		
		Predicate<String> p = (String s) -> {
			return s.equalsIgnoreCase("one");
		};
		
		Predicate<String> p2 = s -> s.startsWith("T");

		list.removeIf(p);
		
		System.out.println(list);
		
		list.removeIf(p2);
		
		System.out.println(list);
	}
	
}
