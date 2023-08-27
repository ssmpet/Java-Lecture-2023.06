package ch99_exercise.Part6_제어자와다형성.example04;

public class Child extends Parent{

	int x = 200;
	
	@Override
	public void method() {
		System.out.println("자손메서드 호출");
	}
	
}
