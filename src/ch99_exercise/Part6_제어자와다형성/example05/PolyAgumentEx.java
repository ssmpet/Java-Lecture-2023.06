package ch99_exercise.Part6_제어자와다형성.example05;

public class PolyAgumentEx {

	public static void main(String[] args) {
		
		//필드의 다형성
//		Product p1 = new TV();
//		Product p2 = new Computer();
//		Product p3 = new Audio();
//		Product[] pArray = new Product[10];
		
		Buyer buyer = new Buyer();
		
		buyer.buy(new TV());
		buyer.buy(new Audio());
		buyer.buy(new Computer());
		//여기서 왜 컴파일 예외가 발생하는가? Apple클래스는 Product클래스의 자손이 아니기
		//때문에 그렇다.
//		buyer.buy(new Apple());		
		
		
		System.out.println("현재 남은 돈 : " + buyer.money + "만원입니다.");
		System.out.println("현재 보너스 포인트 : " + buyer.bonusPoint + "점입니다.");

	}

}
