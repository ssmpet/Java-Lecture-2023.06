package ch06_class.Example04;

public class TimeEx {

	public static void main(String[] args) {
		Time t1 = new Time();
		
		System.out.println(t1);
		
		// 시, 분, 초 설정
		t1.setHour(23);
		t1.setMinute(49);
		t1.setSecond(30);
		
		System.out.println(t1);
		
	}

}
