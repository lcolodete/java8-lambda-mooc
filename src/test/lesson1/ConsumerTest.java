package test.lesson1;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> consumer1 = (String s) -> {
			System.out.println("consumer1 : "+s);
		};
		
		Consumer<String> consumer2 = x -> System.out.println("consumer2 : "+x);;
		
		Consumer<String> consumer3 = consumer2.andThen(consumer1);
		consumer3.accept("Hello!");
		
//		consumer1.accept("Hello World!");
	}
}
