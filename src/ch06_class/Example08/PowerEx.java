package ch06_class.Example08;

import java.util.Scanner;

public class PowerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int n = 0;
		long result = 0L;
		System.out.println("제곱까지의 합을 계산합니다.!");
		System.out.println("ex) 2의 3승: 2의 1승 + 2의 2승 + 2의 3승은 14입니다.!");
		System.out.print("제곱하고 싶은 수를 입력 : ");
		x = sc.nextInt();
		System.out.print("몇승을 더할까요 : ");
		n = sc.nextInt();

		sc.close();
		
	}

	public static long power(int x, int n) {
		
		if (n==1) {
			return x;
		}
		else {
			return x * power(x,  n-1);
		}
	
	}
}
