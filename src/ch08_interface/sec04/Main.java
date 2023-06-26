package ch08_interface.sec04;

public class Main {

	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());
		
	}
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
		
	}

}
