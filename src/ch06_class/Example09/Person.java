package ch06_class.Example09;

public class Person {
	
	// 불변의 정적상수
	// 무조건 선언과 동시에 초기화가 반드시 이루어져야 한다.
	// 공용데이터로써 사용되어진다.
	static final int MAX_NUMBER = 1000;
	
	// final초기화 방법
	// 1.선언과 동시에 초기화
	// 2. 생성자에서 단 한번 초기화
	final String nation = "KOREA";	// 상수선언
	final int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "nation: " + this.nation + ", age : " + this.age;
	}
}
