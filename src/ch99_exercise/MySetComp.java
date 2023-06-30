package ch99_exercise;

import java.util.Comparator;

public class MySetComp implements Comparator<MySet>{
	
	@Override
	public int compare(MySet my1, MySet my2) {
		return my1.getWord().compareTo(my2.getWord());
	}

}
