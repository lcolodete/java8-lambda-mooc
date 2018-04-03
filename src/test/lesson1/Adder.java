package test.lesson1;

@FunctionalInterface
public interface Adder {

	int addN(int a);
	
	static Adder getAdder(int n) {
		return x -> n + x;
		
	}
}
