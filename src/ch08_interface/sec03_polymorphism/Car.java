package ch08_interface.sec03_polymorphism;

public class Car{
	// 필드의 다형성
	Rollable frontLeftTire = new HankookTire();
	Rollable frontRightTire = new HankookTire();
	Rollable backLeftTire = new KumhoTire();
	Rollable backRightTire = new KumhoTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	void changeFrontTire(Rollable tire) {
		
		this.frontLeftTire = tire;
		this.frontRightTire = tire;
	}
	
	void changeBackTire(Rollable tire) {
		this.backLeftTire = tire;
		this.backRightTire = tire;
	}
}
