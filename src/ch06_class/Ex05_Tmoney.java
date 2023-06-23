package ch06_class;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05_Tmoney {

	public static void main(String[] args) {

		Tmoney tmoney = new Tmoney(15, 10000);
		Tmoney tm2 = new Tmoney(25, 10000);
		DecimalFormat dc = new DecimalFormat("###,###,###,###,###");

		// 15세 청소년 사례
		int nCount = 0;
		while (true) {
		
			if( tmoney.ride() ) {
				System.out.printf("%2d번 타셨습니다. 남은 잔액은 %s원 입니다.\n", nCount++, dc.format(tmoney.getCash()));
				
			} else {
				System.out.printf("잔액이 %s원으로 부족합니다. 충전해주세요.\n", dc.format(tmoney.getCash()));
				break;
			}
		
		}
		
		System.out.println("===============================================");
		// 25세 청년 사례
		while (true) {
			if (tm2.ride()) {
				System.out.println(tm2);
			} else
				break;			
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이> ");
		int age = scan.nextInt();
		System.out.print("금액> ");
		int cash = scan.nextInt();
		scan.close();
		Tmoney tm = new Tmoney(age, cash);
		System.out.println(tm);
		for (int i=0; i<Integer.MAX_VALUE; i++) {
			if (tm.ride()) {
				System.out.print(i + 1 + "회 탑승후 ");
				System.out.println(tm);
			} else break;
			
		}

	}

}
