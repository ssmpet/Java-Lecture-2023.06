package ch10_exception;

public class Ex04_ClassCast {

	public static void main(String[] args) {
		
		Animal a2 = new Dog();
		Animal a1 = new Cat();
		
		Cat cat;
		Dog dog;
//		Cat cat = (Cat) a1;		// 좋은 방법이 아님
//		Dog dog = (Dog) a2;
		

		if (a1 instanceof Cat) {
			cat = (Cat) a1;
		}
		if (a2 instanceof Dog) {
			dog = (Dog) a2;
		}

	}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

}
