package ch06_class.Example02;

public class Student {

	String name;
	int age;

	@Override
	public String toString() {
		
		// this: 클래스의 주소(new라 연산자가 인스턴스를 생성하면 비로소 활성화)
		// this는 static메서드나 클래스안에 사용할 수 없다.
		return "이름 : " + this.name + ", 나이: " + this.age;
	}
}
