package ch04;

public class Ex06_Exercise {

	public static void main(String[] args) {
		int score = 85;
		System.out.print("등급은 ");
		if (score < 70) System.out.print("D");
		else if (score < 80) System.out.printf("C");
		else if (score < 90) System.out.print("B");
		else System.out.print("A");
		System.out.println("입니다."); 		// 등급은 B입니다.
		
		
		System.out.println("어떤 혜택을 원하세요?");
		char grade = 'C';
		switch(grade) {
		case 'A': System.out.println("VVIP 혜택을 받으실 수 있습니다.");
		case 'B': System.out.println("VIP 혜택을 받으실 수 있습니다.");	break;
		case 'C': System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
		case 'D': System.out.println("일반 회원 혜택을 받으실 수 있습니다."); break;
		default: System.out.println("혜택이 없습니다.");
		}
		System.out.println("감사합니다.");
		// 어떤 혜택을 원하세요?
		// 우수 회원 혜택을 받으실 수 있습니다.
		// 일반 회원 혜택을 받으실 수 있습니다. 
		// 감사합니다.

	}
	
	

}
