package ch99_exercise.part7_추상클래스와인터페이스.example02;

public class SmartPhone extends Phone {

	public SmartPhone(int serialNo, String owner, String company) {
		super(serialNo, owner, company);
	}

	@Override
	public void turnOn() {
		System.out.println("스마트폰이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰이 꺼졌습니다.");		
	}
	
	//자체메서드
	public void internetSearch() {
		System.out.println("네이버를 실행합니다.!");
	}

}
