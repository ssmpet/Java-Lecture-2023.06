package Test.pro230713.num2;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "학생1");
		Student s2 = new Student(2, "학생2");
		Student s3 = new Student(1, "학생3");
		
		Set<Student> set = new HashSet<>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		for ( Student st: set) {
			System.out.println(st);
		}
	}
}
