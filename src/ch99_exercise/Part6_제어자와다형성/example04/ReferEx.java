package ch99_exercise.Part6_제어자와다형성.example04;

import ch11_api.sec03_class.Car;

public class ReferEx {

	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		
		//멤버변수는 근본을 벗어나지 못함
		System.out.println(parent.x);
		System.out.println(child.x);
		//멤버메서드는 현재참조하고 있는 인스턴스에 영향을 받음
		parent.method();
		child.method();
		
		parent.type(new Car());

	}

}
