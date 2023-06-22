package ch04;

import java.util.Scanner;

public class Ex03_Alarm {

	public static void main(String[] args) {
		// 설정한 시간 보다 45분 전에 알람 울리기(시간 표시)
		Scanner scan = new Scanner(System.in);
		System.out.print("알람 시간을 입력하세요> ");
		int nHour = scan.nextInt();

		System.out.print("알람 분을 입력하세요> ");
		int nMin = scan.nextInt();

		scan.close();

		nMin -= 45;
		if (nMin < 0) {
			nMin += 60;
			nHour -= 1;
		}

		if (nHour < 0)
			nHour = 24;

		System.out.printf("알람시간 : %d시 %02d분 입니다.", nHour, nMin);

	}

	private static void mycase1() {
		int hour, minute, newHour, newMin;

		Scanner scan = new Scanner(System.in);
		hour = scan.nextInt();
		minute = scan.nextInt();
		scan.close();

		if (minute >= 45) {
			newHour = hour;
			newMin = minute - 45;
		} else {
			newHour = (hour + 24 - 1) % 24;
			newMin = minute + 60 - 45;
		}

		System.out.printf("%02d:%02d", newHour, newMin);

	}

}
