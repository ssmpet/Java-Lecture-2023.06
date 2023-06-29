package ch13_collection.sec04_exercise;

import java.util.HashSet;
import java.util.Set;

public class Ex08_HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		for ( Student sd: set)
			System.out.println(sd.getStudentNum() + ":" + sd.getName());

	}

}
