package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Performance {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// ArrayList 앞에 추가
		startTime = System.nanoTime();
		for (int i=0; i< 10000; i++)
			list1.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("ArrayList 앞에 걸린시간: " + (endTime-startTime) + " ns");
		
		// LinkedList 앞에 추가
		startTime = System.nanoTime();
		for (int i=0; i< 10000; i++)
			list2.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 앞에 걸린시간: " + (endTime-startTime) + " ns");
		
		// ArrayList 뒤에 추가
		startTime = System.nanoTime();
		for (int i=0; i< 100000; i++)
			list1.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("ArrayList 뒤에 걸린시간: " + (endTime-startTime) + " ns");
		
		// LinkedList 뒤에 추가
		startTime = System.nanoTime();
		for (int i=0; i< 100000; i++)
			list2.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 뒤에 걸린시간: " + (endTime-startTime) + " ns");

	}

}
