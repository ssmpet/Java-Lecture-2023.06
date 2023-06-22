package ch04;

import java.util.Scanner;

public class Ex14_Exercise {

	public static void main(String[] args) {
		
		// 확인문제 2
		int sum = 0;
		for (int i = 0; i <= 100; i+=3)
			sum += i;
		System.out.println("1~100까지 3의 배수의 총 합: " + sum);		// 1683
		
		// 확인문제 3
		while (true) {
			int dice1 = 1 + (int) (Math.random() * 6);
			int dice2 = 1 + (int) (Math.random() * 6);
			System.out.printf("(%d, %d) ", dice1, dice2);

			if ( dice1 + dice2 == 5) break;
 		}
		System.out.println();
		
		// 확인문제 4
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ( 4*x + 5*y == 60 ) 
					System.out.printf("(%d, %d) ", x, y);					
			}
		}
		System.out.println();
		
		// 확인문제 7
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.예금  |  2.출금  |  3.잔고  |  4.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int inSelect = Integer.parseInt(scanner.nextLine());
			if ( inSelect == 1 ) {
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
			}
			else if(inSelect == 2) {
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
			}
			else if(inSelect == 3) {
				System.out.printf("잔고> %d\n", balance);
			}
			else if(inSelect == 4) break;
		}
		scanner.close();
		System.out.println("프로그램 종료");
		
	}
	
	

}
