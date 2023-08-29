package ch99_exercise.part7_추상클래스와인터페이스.example02;

public class FolderblePhone extends Phone{

	//생성자
	public FolderblePhone(int serialNo, String owner, String company) {
		super(serialNo, owner, company);
	}

	//추상메서드 2개 재정의
	@Override
	public void turnOn() {
		System.out.println("폴더블 폰이  켜졌습니다.!");
	}

	@Override
	public void turnOff() {
		System.out.println("폴더블 폰이  꺼졌습니다.!");		
	}

	//자체메서드2개
	public void foldOn() {
		System.out.println("폴드 기능이 사용됩니다.");
	}
	
	public void foldOff() {
		System.out.println("폴드 기능이 해제됩니다.");
	}
}
