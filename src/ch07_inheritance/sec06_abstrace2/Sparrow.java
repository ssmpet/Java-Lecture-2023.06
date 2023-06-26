package ch07_inheritance.sec06_abstrace2;

public class Sparrow extends Bird{
	public Sparrow() {
		this.kind = "참새";
	}

	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}
