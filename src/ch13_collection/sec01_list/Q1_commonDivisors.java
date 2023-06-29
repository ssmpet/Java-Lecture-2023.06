package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 두 개의 정수를 입력으로 받아서, 두 수의 공약수를 찾으세요.
 * 단, 두 수의 공약수를 리스트로 반환하는 메소드 getCommonDivisors()를 만들어 해결하세요.
 */
public class Q1_commonDivisors {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 2개 입력: ");
		String[] num = scan.nextLine().split(" ");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		CommonDivisor list = new CommonDivisor(a, b);
		List<Integer> comList = new ArrayList<Integer>();
		
		comList = list.getCommonDivisors();
		
		comList.forEach(x -> System.out.println(x));
	}

	
}

