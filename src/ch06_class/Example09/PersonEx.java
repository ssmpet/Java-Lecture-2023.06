package ch06_class.Example09;

import java.time.LocalDate;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person(40);
		Person p2 = new Person(150);
		Person p3 = new Person(250);
		//final속성은 상수이므로 값을 변경 절대 못함.
//		p.nation = "USA";
//		p.age = 100;

		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		System.out.println(Person.MAX_NUMBER);

	}

}
