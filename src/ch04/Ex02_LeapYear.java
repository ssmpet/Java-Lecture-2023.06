package ch04;

import java.util.Scanner;

public class Ex02_LeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력해 주세요 > ");
		
	
		int nYear = Integer.parseInt(scan.nextLine());
		scan.close();
		
		if ( (nYear % 4 == 0 && nYear % 100 != 0) || nYear%400 == 0  )
			System.out.println(nYear + "년은 윤년입니다. ");
		else
			System.out.println(nYear + "년은 평년입니다. ");
		
		// 방법 2
		String result;
		if (nYear % 400 == 0)
			result = "윤년";
		else if (nYear % 100 == 0)
			result = "평년";
		else if (nYear % 4 == 0)
			result = "윤년";
		else
			result = "평년";
		System.out.println(nYear + "년은 " + result + "입니다.");
		
		// 방법 3
		if (nYear % 400 == 0)
			result = "윤년";
		else if (nYear % 4 == 0 && nYear % 100 != 0)
			result = "윤년";
		else
			result = "평년";
		System.out.println(nYear + "년은 " + result + "입니다.");
		
		
		System.out.println(nYear + "년은 " + leapYear(nYear) + "입니다.");
			
	}
	
	private static String leapYear(int year) {
		if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0  )
			return "윤년";
		else
			return "평년";
		
	}
	

}
