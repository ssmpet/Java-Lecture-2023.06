package ch99_exercise.Part6_제어자와다형성.example05;

public class TV extends Product{

	//조상클래스의 매개변수가 있는 생성자 Product(int price)를 호출
	public TV() {
		super(300);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}
