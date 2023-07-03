package ch06_class.Example06;

public class CardEx {

	
	public static void main(String[] args) {
		
		// ctrl + pageup : 이전파일 이동
		// csrl + pagedown : 다음파일 이동
		Card card1 = new Card();
		card1.setColor("red");
		card1.setCompany("국민카드");
		card1.show();
		
		System.out.println(card1);
		
		// static변수는 반듯이 클래스명.static명으로 접근하여야 함.
		// 웬만하면, 공유변수는 분석하는 단계에서는 바꾸지 않는 것이 바람직한 방법
		Card.width = 80;
		Card.height = 150;
		
		Card card2 = new Card();
		card2.setColor("yello");
		card2.setCompany("농협");
		System.out.println(card2);
	}

}
