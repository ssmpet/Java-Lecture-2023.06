package ch99_exercise.part7_추상클래스와인터페이스.example02;

//추상클래스
public abstract class Phone {
	private int serialNo;
	private String company;
	private String owner;
	
	public Phone(int serialNo, String owner, String company) {
		super();
		this.serialNo = serialNo;
		this.owner = owner;
		this.company = company;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public String getOwner() {
		return owner;
	}

	public String getCompany() {
		return company;
	}
	
	//추상메서드 선언
	public abstract void turnOn();
	public abstract void turnOff();
	
	//폰의 정보 표시 메서드
	public void showInfo() {
		System.out.println("시리얼넘버 : " + this.getSerialNo());
		System.out.println("제조회사 : " + this.getCompany());
		System.out.println("소유자 : " + this.getOwner());
	}
	
}
