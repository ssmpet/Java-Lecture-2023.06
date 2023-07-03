package ch06_class.Example04;

public class Time {
	
//	접근제어자(Access Modifier)의 종류
//	private : 같은 클래스내에서만 접근 가능함.
//	protected : 같은 패키지, 자손 클래스에서만 접근 가능함.
//	default : 같은 패키지에서만 접근 가능함.
//	public : 누구나 다 접근가능함.
	
	private int hour;
	private int minute;
	private int second;
	
	// Source탭 -> Generate getter and setter를 클릭 후
	// 원하는 멤버변수를 체크를 하셔서 getter, setter메서드를
	// 자동 완성을 하면 된다.
	// getter() : 멤버변수의 값을 읽어가는 메서드
	// setter() : 멤버변수의 값을 수정하는 메서드
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		// 시에 대한 예외처리 코드를 작성
		if ( hour < 0 || hour > 24 ) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		
		return minute;
	}
	public void setMinute(int minute) {
		// 분에 대한 예외처리 코드를 작성
		if ( minute < 0 || minute > 59 ) {
			System.out.println("분을 잘못 입력하셨습니다.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		// 초에 대한 예외처리 코드를 작성
		if ( second < 0 || second > 59 ) {
			System.out.println("초를 잘못 입력하셨습니다.");
			return;
		}
		this.second = second;
	}

	@Override
	public String toString() {
		return this.getHour() + "시 " + this.getMinute() + "분 " + 
				this.getSecond() + "초";
	}
	
}
