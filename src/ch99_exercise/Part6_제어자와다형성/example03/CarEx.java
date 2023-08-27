package ch99_exercise.Part6_제어자와다형성.example03;

public class CarEx {

	public static void main(String[] args) {

		Car car = null;
		SportCar sportCar1 = new SportCar();
		SportCar sportCar2 = null;
		PoliceCar policeCar = new PoliceCar();
		
		sportCar1.speedUp();
		
		car = sportCar1;	//업캐스팅(자손->조상), 조작할 수 있는 멤버가 줄어든다.
//		car.speedUp();	//여기서 컴파일예외가 발생 이유
						//car의 근본 클래스는 Car이므로 speedUp()메소드가 없다.
		//다운캐스팅을 할 때, 반드시 명시적으로 형변환 코드를 작성해야 한다.
		sportCar2 = (SportCar) car;//다운캐스팅(조상->자손), 조작할 수 있는 멤버가 늘어난다.
		sportCar2.speedUp();

		//아래코드는 서로 상속관계가 아니기 때문에 형변환이 절대 이루어질 수 없음.
//		sportCar1 = (SportCar)policeCar;

		
	
	}

}
