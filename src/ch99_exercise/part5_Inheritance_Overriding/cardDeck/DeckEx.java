package ch99_exercise.part5_Inheritance_Overriding.cardDeck;

public class DeckEx {

	public static void main(String[] args) {

		//Deck의 생성자를 호출하면 항상, 포함된 클래스부터 생성을 먼저함.(중요)
		Deck d = new Deck();
		Card c = d.pick(51);
		
		System.out.print("카드 섞기 전에 제일 밑에 있는 카드 => " +  c);
		d.shuffle();
		c = d.pick(51);
		System.out.print("카드 섞은 후에 제일 밑에 있는 카드 => " +  c);
		System.out.print(d.pick());
	}
}
