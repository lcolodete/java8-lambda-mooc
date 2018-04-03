package test.lesson3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class TestLesson3 {

	public static void main(String[] args) throws IOException {
		System.out.println("TestLesson3");
		
		//find the length of the longest line in a file
		Path input = Paths.get("SonnetI.txt");
		
		int longestLineLength = Files.lines(input)
			.mapToInt(String::length)
			.max()
			.getAsInt();
		
		System.out.println("longestLineLength="+longestLineLength);

		//INEFFICIENT
//		String longestLine = Files.lines(input)
//			.sorted((x, y) -> y.length() - x.length())
//			.findFirst()
//			.get();
		
		//MORE EFFICIENT : using reduce
		
		String longestLine = Files.lines(input)
			.reduce((x, y) -> {
				if (x.length() > y.length())
					return x;
				return y;
			})
			.get();
		
		System.out.println("longestLine="+longestLine);
		
		int x = new Random().ints()
		.peek(System.out::println)
		.filter(i -> i > 655399730)
		.findFirst()
		.getAsInt();
		
		System.out.println("x="+x);
		
	    List<String> list = Arrays.asList(
	            "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

	    Map<Integer, List<String>> m = list.stream()
	    	.collect(Collectors.groupingBy(String::length));
	    
	    System.out.println(m);
	    
	    Map<Integer, Long> m2 = list.stream()
		    	.collect(Collectors.groupingBy(String::length, Collectors.counting()));
	    
	    System.out.println(m2);
	    
	    Map<Boolean, List<String>> m3 = list.stream()
		    	.collect(Collectors.partitioningBy(s -> s.length() > 3));
	    
	    System.out.println(m3);


	}
}
