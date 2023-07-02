package ch99_exercise;

import java.util.Comparator;
import java.util.Objects;

import ch13_collection.sec01_list.Member;

public class MySet implements Comparator<MySet>{
	private String word;
	private int count;
	
	public MySet(String word) {
		this.word = word;
		this.count = 1;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count += count;
	}

	@Override
	public String toString() {
		return word + ": " + count;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(word);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof MySet)) return false;
		
		MySet set = (MySet) obj;
		
		if ( this.word.equals(set.getWord())) {
			set.setCount(1);
		}		

		return this.word.equals(set.getWord());
	}

	@Override
	public int compare(MySet o1, MySet o2) {
		
		return -(o1.getCount() - o2.getCount());
	}

	
}
