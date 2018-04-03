package test.lesson1;

public class ArrayCollectionTest {

	public static void main(String[] args) {
		ArrayCollection arrayCol = new ArrayCollection(5);
		System.out.println(arrayCol.add("red"));
		System.out.println(arrayCol.add("green"));
		System.out.println(arrayCol.add("blue"));
		
		//System.out.println(arrayCol);
		
		arrayCol.forEach(s -> System.out.println("> "+s));
//		arrayCol.forEach(System.out::println);
	}
}
