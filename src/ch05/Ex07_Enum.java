package ch05;

import java.time.LocalDate;
import java.util.Calendar;

public class Ex07_Enum {

	public enum Week { MON, TUE, WED, THU, FRI, SAT, SUN };
	
	public static void main(String[] args) {
		Week date = Week.THU;
		System.out.println(date.name());
		System.out.println(date.ordinal());
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getDayOfWeek());
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));  	// 1 ~ 7 일 월 화 수 목 금 토
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
	}

}
