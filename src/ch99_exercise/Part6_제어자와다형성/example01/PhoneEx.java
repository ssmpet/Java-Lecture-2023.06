package ch99_exercise.Part6_제어자와다형성.example01;

import ch99_exercise.Part6_제어자와다형성.ex.B;

public class PhoneEx {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		Phone p = new Phone();
		B b = new B("bb", "b bb", "SK", p);
		
	}

}
