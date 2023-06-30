package ch13_collection.sec04_exercise;

import java.util.Objects;

public class Student {
	private int studentNum;
	private String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
//		return Objects.hash(studentNum);		
		return this.studentNum;		
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof Student) ) return false;
		
		Student sd = (Student) obj;

		return this.studentNum == sd.studentNum;
	}

	@Override
	public String toString() {
		return studentNum + ": " + name;
	}

}
