package test.lesson1;

import java.util.function.Consumer;

public class ArrayCollection {

	private String[] myArray;
	private int size;
	private int lastIndex = -1;
	
	public ArrayCollection(int size) {
		this.myArray = new String[size];
		this.size = size;
	}
	
	public boolean add(String s) {
		int newIndex = this.lastIndex + 1; 
		if (newIndex < this.size) {
			this.lastIndex++;
			this.myArray[this.lastIndex] = s;
			return true;
		}
		return false;
	}
	
	public void remove(int i) {
		this.myArray[i] = null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (String s : this.myArray) {
			if (sb.length() > 0) 
				sb.append(", ");
			sb.append(s);
		}
		
		return sb.toString();
	}

	public void forEach(Consumer<String> action) {
		for (String s : this.myArray) {
			action.accept(s);
		}
	}
}
