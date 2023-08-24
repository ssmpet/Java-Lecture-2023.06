package ch99_exercise.Part6_제어자와다형성.example01;

public class A extends Phone{
	
	Phone phone = new Phone("aa", "yellow", "LG");
	
	public A() {
		super("aa 생성자", "yellow", "LG");
	}
	
	public void method() {
	
		System.out.println(phone.model);
	
	}
	
}
