package ch06_class.Example08;

public class CallStackEx {

	public static void main(String[] args) {

		// 콜스택(LIFO)은 후입선출이다.
		// 콜스택은 후입선출이다.(ex.택시기사 아저씨의 동전통<->큐(Queue, FIFO, 파이프, 수도호스)
		System.out.println("main()실행됨");
		
		// static은 static호출할 수 있다.
		CallStackEx.first();
		System.out.println("main()종료됨");
	}
	
	public static void first() {
		System.out.println("first()실행됨");
		second();	// 같은 클래스내에 메서드라면 클래스면은 생략해도 무방하다.
		System.out.println("first()종료됨");	
	}
	
	public static void second() {
		System.out.println("second()실행됨");
		third();
		System.out.println("second()종료됨");
	}

	public static void third() {
		System.out.println("third()실행됨");
		System.out.println("third()종료됨");

	}

}
