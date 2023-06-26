package ch07_inheritance.sec04_polymorphism;

public class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("멍멍~~");
	}
}
