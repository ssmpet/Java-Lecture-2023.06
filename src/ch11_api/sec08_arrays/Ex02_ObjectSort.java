package ch11_api.sec08_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02_ObjectSort {

	public static void main(String[] args) {
		Member m1 = new Member(123, "James");
		Member m2 = new Member(45, "Maria");
		Member m3 = new Member(235, "Brian");
		Member[] members = {m1, m2, m3};
		
		for (Member m: members) {
			System.out.println(m);
		}
		
		System.out.println("================================");
		
		// Member 오름차순 정렬, Member의 id 값에  따른 정렬
		Arrays.sort(members);
		for (Member m: members) 
			System.out.println(m);
		
		System.out.println("================================");		
		
		// Member 오름차순 정렬, Member의 name 값에  따른 정렬		
		Arrays.sort(members);
		for (Member m: members) 
			System.out.println(m);
	}

}
