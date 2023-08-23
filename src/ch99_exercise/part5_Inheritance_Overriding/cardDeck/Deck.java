package ch99_exercise.part5_Inheritance_Overriding.cardDeck;

public class Deck {
	
	final int CARD_NUM = 52;	// 카드의 개수
	
	// 객체배열(2차원 배열 타입)
	Card[] c = new Card[CARD_NUM];
	int i = 0;
	// 인스턴스 초기화 블럭
	{
		// 52번을 돌면서 카드를 초기화
		for (int k = Card.KIND_MAX; k > 0; k--) {
			for (int n = 1; n < Card.NUM_MAX + 1; n++ ) {
				c[i++] = new Card(k, n);
			}
			
		}
		// 제대로 초기화가 이루어졌는지 내용을 직접 출력해봄
		for (int j = 0; j < c.length; j++) {
			System.out.printf("c[%d]의 무늬 : %d, c[%d]의 숫자 : %d\n",  
					j, c[j].kind, j, c[j].number);
		}
	}
	
	// 지정된 위치(index)에 있는 카드 하나를 선택
	public Card pick(int index) {
		if(index >= 0 && index < CARD_NUM) {
			return c[index];
		} else {
			return pick();
		}
	}
	
	// Deck에서 카드 하나를 임의로 선택
	public Card pick() {
		int index = (int) (Math.random()*CARD_NUM);
		System.out.print("\n임의로 뽑은 카드 => ");
		System.out.printf("%d ", index);
		return pick(index);
	}
	
	public Deck() {
		super();
		System.out.println("Dect 생성자 호출");
	}
	
	//단순히 섞는 메서드
	public void shuffle() {
		for(int n=0; n<1000; n++) {
			int i = (int)(Math.random()*CARD_NUM);
			Card temp = c[0];
			c[0] = c[i];
			c[i] = temp;
		}
		System.out.println("\n");
		System.out.println("카드 섞은 후 결과");
		for (int j = 0; j < c.length; j++) {
			System.out.printf("c[%d]의 무늬 : %d, c[%d]의 숫자 : %d\n",  
					j, c[j].kind, j, c[j].number);
		}
	}
}
