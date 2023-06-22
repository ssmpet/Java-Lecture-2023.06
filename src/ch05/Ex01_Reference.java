package ch05;

import java.util.Scanner;

public class Ex01_Reference {

	public static void main(String[] args) {
		int a = 10, b = 10;
		System.out.println(a == b);
		String ref1 = "자바";
		String ref2 = "자바";
		
		// String의 내용이 같은지를 물어보는 것이 아니고, 참조하는 기억장소가 같은지를 물어보는 것
		System.out.println(ref1 == ref2);		// true
		
		String ref3 = new String("자바");
		System.out.println(ref1 == ref3);		// false
		System.out.println(ref1.equals(ref3));	// true
		
		String s = null;
		String[] strArr = null;
		Scanner scan = null;
		System.out.println(s == null); 			// true
		
		String t = "";
		System.out.println(t.length());
		

	}

}
