package ch99_exercise.Part4;

import java.util.Calendar;
import java.util.Date;


public class UserEx {

	public static void main(String[] args) {

//		User user1 = new User();
		User user1 = User.getInstance();
		User user2 = User.getInstance();

		// 싱글톤 패턴을 사용하는 실제적인 예
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		System.out.println(d);
		
		System.out.println(user1);
		System.out.println(user2);
		user1.add();
		
		// Object 클래스의 equals()주소 비교
		// 객체의 == 연산은 주소값 비교연산 user1 == user2
		if (user1.equals(user2)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		// 싱글톤 패턴을 사용하는 이유
		// 단, 하나의 인스턴스를 생성해서 서로 공유를 원하고자 할때 사용
		// ex)사용자 환경설정, 커넥션풀, 스레드풀, OS의 시간이나 날짜
	}

}
