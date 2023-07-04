package ch06_class.Example07;

public class MemberEx {

	public static void main(String[] args) {
		
		// static은 static만 호출이 가능하다.
		Member.smethod();
		Member.cv = 500;
		Member.smethod();
		System.out.println();
		
		// 인스턴스 멤버들을 사용하기 위해서는 반드시 new라는 연산자가 힙에다가
		// 인스턴스를 만들어야 사용이 가능하다.
		Member m = new Member();
		m.imethod();
		m.iv = 999;
		m.imethod();
	}

}
