package test.lesson1;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer, Integer> exp = x -> x * x;
		System.out.println(exp.apply(8));
		
		Function<Integer, Integer> times2 = x -> 2 * x;
		System.out.println(times2.apply(13));
		
		Function<Integer, Integer> add6 = x -> x + 6;
		System.out.println(add6.apply(10));
		
		Function<Integer, Integer> adder = FunctionTest.addN(10);
		System.out.println(adder.apply(1));
		
		adder = FunctionTest.addN(5);
		System.out.println(adder.apply(1));
	}
	
	static Function<Integer, Integer> addN(Integer n) {
		return x -> n + x;
	}
}
