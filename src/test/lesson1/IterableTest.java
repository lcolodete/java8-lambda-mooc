package test.lesson1;

import java.util.ArrayList;
import java.util.List;

public class IterableTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("java");
		names.add("sun");
		names.add("oracle");
		
//		names.forEach(name -> System.out.println(name));
		names.forEach(System.out::println);
		
		names.forEach(s -> {
			String newS = s.toUpperCase();
			System.out.println(newS);
		});
	}
}
