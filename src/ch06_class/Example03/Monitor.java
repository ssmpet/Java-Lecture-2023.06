package ch06_class.Example03;

public class Monitor {
	
	// 멤버변수(필드)
	String color;	// 모니터의 색상
	int channel;	// 채널
	int volume;
	boolean power;	// 전원(on/off)
	
	// 멤버메서드
	public void power() {
		if (!this.power) {
			System.out.println("모니터가 켜졌습니다.");
			this.power = !power;
		}else {
			System.out.println("모니커가 꺼졌습니다.");
			this.power = !power;
		}
	}
	
	public void channelUp() {
		System.out.println("현재 채널: " + (++this.channel));
	}
	
	public void channelDown() {
		System.out.println("현재 채널: " + (--this.channel));
	}
	
	public void volumeUp() {
		System.out.println("현재 볼륨: " + (++this.volume));
	}
	
	public void volumeDown() {
		System.out.println("현재 볼륨: " + (--this.volume));
	}

	
	@Override
	public String toString() {
		return "현재 채널 : " + this.channel + ", 현재 볼륨: " + this.volume;
	}
}
