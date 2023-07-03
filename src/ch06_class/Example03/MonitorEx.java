package ch06_class.Example03;

public class MonitorEx {

	public static void main(String[] args) {

		// monitor 참조변수는 리모컨과 같은 것이라고 생각하자.
		Monitor monitor = new Monitor();
		
		
		monitor.power();

		System.out.println(monitor);
		
		monitor.channel = 5;
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelDown();		
		
		monitor.volumeUp();
		monitor.volumeUp();
		monitor.volumeUp();
		
		System.out.println(monitor);
		
		monitor.power();
	}

}
