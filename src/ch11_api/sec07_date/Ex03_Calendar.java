package ch11_api.sec07_date;

import java.util.Calendar;

public class Ex03_Calendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;		// 월은 1을 더해주어야 함
		int day = now.get(Calendar.DAY_OF_MONTH);
		int date = now.get(Calendar.DAY_OF_WEEK);		// 요일
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("%d-%02d-%02d %d %2d(%02d):%02d:%02d(%d)\n", year, month, day, amPm, hour, hour24, minute, second, date);
		
	}

}
