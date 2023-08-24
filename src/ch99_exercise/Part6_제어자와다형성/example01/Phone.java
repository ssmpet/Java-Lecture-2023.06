package ch99_exercise.Part6_제어자와다형성.example01;

public class Phone {
	//필드(멤버변수), 외부로부터 접근 못하게 막는다.
	//protected접근 제어자 : 같은 패키지에서 다 접근 가능함. 
	//다른 패키지, 다른 패키지에서 상속 받은 클래서에도 접근 불가.
	protected String model;
	private String color;
	private String company;
	
	public Phone() {}
	//매개변수가 있는 생성자
	public Phone(String model, String color, String company) {
		super();
		this.model = model;
		this.color = color;
		this.company = company;
	}

	//getter() 제공
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Phone [모델=" + model + ", 색상=" + color + ", 제조회사=" + company + "]";
	}
	
	
	
	
}
