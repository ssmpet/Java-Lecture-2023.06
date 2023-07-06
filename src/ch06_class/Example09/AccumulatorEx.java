package ch06_class.Example09;

import java.awt.Adjustable;

class A {
	int data1 = 10;
	int data2 = 30;
}

public class AccumulatorEx {

	public static void main(String[] args) {
	
		Accumulator ac = new Accumulator();
		int iresult = ac.add(10, 50);
		System.out.println("iresult : " + iresult);
		
		// 접미사 반드시 붙이도록 하자.
		long lresult = ac.add(100, 7500L);
		System.out.println("lresult : " + lresult);
		
		double dresult = ac.add(107.88, 11.55);
		System.out.println("dresult : " + dresult);
		
		long arrResult = ac.add(new int[] {1, 2, 3, 4, 5});
		System.out.println("addResult : " + arrResult);
		
		iresult = ac.add(new A());
		System.out.println("iresult : " + iresult);
	}

}
