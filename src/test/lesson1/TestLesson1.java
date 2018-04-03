package test.lesson1;

import java.util.Arrays;
import java.util.Comparator;

public class TestLesson1 {

	public static void main(String[] args) {
		System.out.println("Hello Java 8!");
		
		
		Integer[] list = {5,4,3,2,1};

		System.out.println(Arrays.asList(list));
		
//		Comparator<Integer> comparator = (x, y) -> {
//			return x - y; 
//		};
		
		Arrays.sort(list, (x, y) -> {
				return x - y; 
		});
		
		System.out.println(Arrays.asList(list));

		Adder adder = Adder.getAdder(5);
		System.out.println(adder.addN(0));
		System.out.println(adder.addN(1));
		System.out.println(adder.addN(2));
		System.out.println(adder.addN(3));
		
		adder = Adder.getAdder(10);
//		adder = x -> 10 + x;
		System.out.println(adder.addN(20));
		System.out.println(adder.addN(30));
		System.out.println(adder.addN(40));
		
		new Thread(() -> {
			for (int i = 0; i < 10; i++) { 
				System.out.println("iterating from a lambda in a thread: "+i);
				try {
					Thread.sleep (1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		System.out.println("main is over");
	}
}
