package ch99_exercise.Part6_제어자와다형성.example03;

//조상클래스
public class Car {
	String color;
	int door;
	
	public void drive() {
		System.out.println("차가 달립니다.");
	}
	
	public void Stop() {
		System.out.println("차가 멈춤니다.");
	}
}
