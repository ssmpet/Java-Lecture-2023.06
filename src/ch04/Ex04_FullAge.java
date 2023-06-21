package ch04;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex04_FullAge {

	public static void main(String[] args) {
		String[] birth = "1977-12-21".split("-");
		int year = Integer.parseInt(birth[0]);
		int month = Integer.parseInt(birth[1]);
		int day = Integer.parseInt(birth[2]);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("생년 > ");
//		year = scan.nextInt();
//		System.out.print("월 > ");
//		month = scan.nextInt();
//		System.out.print("일 > ");
//		day = scan.nextInt();
//		scan.close();
//		System.out.printf("%d-02%d-%02d\n", year, month, day);

		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		int nowMon = today.getMonthValue();
		int nowDay = today.getDayOfMonth();
		System.out.printf("현재날짜 : %d-%02d-%02d\n", nowYear, nowMon, nowDay);
		
		int age = nowYear - year;

		if ( month > nowMon || ( month<=nowMon && day >= nowDay) )
			age -= 1;

		System.out.printf("만나이 : %d세 입니다.", age);
		
	}

}
