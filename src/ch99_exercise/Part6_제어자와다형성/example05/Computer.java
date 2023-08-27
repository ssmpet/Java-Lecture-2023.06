package ch99_exercise.Part6_제어자와다형성.example05;

public class Computer extends Product{
	
	public Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}
