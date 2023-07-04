package ch06_class.Example07;

public class Member {
	
	int iv = 100;		// 인스턴스 멤버변수
	static int cv = 200;// static 멤버변수
	
	
	// 인스턴스 메서드
	public void imethod() {
		
		System.out.println("iv : " + this.iv);
		System.out.println("cv : " + Member.cv);
	}
	
	// static 메서드
	public static void smethod() {
//		System.out.println("iv : " + this.iv); 	// 안된다.
		System.out.println("cv: " + Member.cv);
	}	
	
}
