package test.lesson1;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "hello from Supplier";
		
		System.out.println(supplier.get());
	}
}
