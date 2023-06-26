package ch07_inheritance.sec06_abstrace2;

public class Pig extends Animal{
	
	public Pig() {
		this.kind = "돼지";
	}

	@Override
	public void sound() {
		System.out.println("꿀꿀~~");
	}
	

}
