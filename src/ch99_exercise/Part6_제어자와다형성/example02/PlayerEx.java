package ch99_exercise.Part6_제어자와다형성.example02;

public class PlayerEx {

	public static void main(String[] args) {
		
		//다형성 미적용 코드
		Player player1 = new Player("이동국", 40, 20, 60);
		player1.info();
		System.out.println();
		
		//다형성이 적용된 코드(필드의 다형성)
		//하지만, 근본은 벗어나지 못한다. 하여, Striker클래스에 있는 getShoot()메서드는
		//player2참조변수가 접근이 안된다.
		Player player2 = new Striker("손흥민", 25, 10, 90, 50);
		//메서드에서 상속관계에 있다면, 자손클래스 오버라이딩을 하게 되면, 현재 참조하고
		//있는 인스턴스의 메서드를 호출한다.
		player2.info();
		
		System.out.println();
		Player player3 = new MidFielder("이강인", 30, 18, 80, 120);
		player3.info();
		
		System.out.println();
		Player player4 = new Defender("김영권", 35, 20, 60, 60);
		player4.info();
	}

}
