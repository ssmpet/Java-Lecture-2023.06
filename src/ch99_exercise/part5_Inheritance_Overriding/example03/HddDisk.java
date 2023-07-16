package ch99_exercise.part5_Inheritance_Overriding.example03;

public class HddDisk extends Object{
	
	// 멤버변수
	int capacity; 	// 용량
	int rpm;		// 속도
	
	public HddDisk() {	}

	public HddDisk(int capacity, int rpm) {
		this.capacity = capacity;
		this.rpm = rpm;
	}
	
	// HddDisk의 사용자 정의 메서드
	public String status() {
		String str = "하드디스크 용량 : " + this.capacity + "\n" + 
					 "하드디스크 속도 : " + this.rpm + "(rpm)";
		return str;
	}
	
	
}