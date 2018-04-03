package test.lesson1;

import java.util.function.BiFunction;

public class MethodAsLambda {

	static BiFunction<String, Integer, String> subString;
	
	public static void main(String[] args) {
		
//		subString = (String s, Integer i) -> s.substring(i);
		subString = String::substring;
		
		System.out.println( do_subString("ABCDEFGHIJ", 5) );
	}
	
	static String do_subString(String s, int i) {
		return subString.apply(s, i);
	}
}
