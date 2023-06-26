package ch07_inheritance.sec06_abstrace2;

public class Cow extends Animal{
	
	public Cow() {
		this.kind = "소";
	}

	@Override
	public void sound() {
		System.out.println("음메~~");
	}
	

}
