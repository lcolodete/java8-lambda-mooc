package test.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLesson2 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student(55, 2015), 
				new Student(100, 2014), 
				new Student(60, 2015), 
				new Student(67, 2015) 
		);
		
		
		System.out.println(
		list.stream()
//			.peek(s -> System.out.println(s))
			.peek(System.out::println)
//			.collect(Collectors.toList());
			.toArray()
		);
		
		list.stream()
			.forEach(System.out::println);
				
		Stream.of("one", "two", "three", "four")
        .filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Filtered value: " + e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());

		//OptionalInt highScore = 
				list.stream()
				.filter(s -> s.getGraduationYear() == 2015)
//				.mapToInt(s -> s.getScore())
				.mapToInt(Student::getScore)
				.max()
				.ifPresent(System.out::println);
	
//		OptionalInt maxEvenDigit = 
		Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10})
			.limit(5)
			.filter(i -> i % 2 == 0)
			.max()
			.ifPresent(System.out::println);
	}
	
	
}

class Student {
	int graduationYear;
	
	int score;
	
	public Student(int score, int graduationYear) {
		super();
		this.score = score;
		this.graduationYear = graduationYear;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getGraduationYear() {
		return graduationYear;
	}
	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}
	
	@Override
	public String toString() {
		return this.score + ", " + this.graduationYear;
	}
}
