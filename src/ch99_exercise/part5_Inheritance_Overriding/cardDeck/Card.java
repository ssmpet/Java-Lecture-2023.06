package ch99_exercise.part5_Inheritance_Overriding.cardDeck;

public class Card {
	
	// 클래스별로 관리됨. 클래스영역에 클래스로딩됨과 동시에 올라감, 공용데이터로 활용
	static final int KIND_MAX = 4;	// 카드 무늬의 개수
	static final int NUM_MAX = 13;	// 무늬별 카드 수

	// 무늬를 상수로 지정
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	public Card(int kind, int number) {
		super();	// Object의 기본 생성자를 호출
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		// 지역변수는 반드시 초기화 
		String kind = "";
		String number = "";
		
		// 무늬 설정
		switch(this.kind) {
		case SPADE:
			kind = "스페이드";
			break;
		case DIAMOND:
			kind = "다이아몬드";
			break;
		case HEART:
			kind = "하트";
			break;
		case CLOVER:
			kind = "클로버";
			break;
		}
		
		// 숫자설정
		switch(this.number) {
		case 13:
			number = "K";
			break;
		case 12:
			number = "Q";
			break;
		case 11:
			number = "J";
			break;
		default:
			number = this.number + "";
			break;
		}
		
		return "무늬 : " + kind + ",  숫자 : " + number;
	}
	
	
	
}
