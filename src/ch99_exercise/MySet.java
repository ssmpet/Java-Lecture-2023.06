package ch99_exercise;

import java.util.Objects;

public class MySet{
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

	
}
