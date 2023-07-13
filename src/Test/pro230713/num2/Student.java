package Test.pro230713.num2;

import java.util.Objects;

public class Student {
	private int sid;
	private String name;
	
	public Student() {}
	public Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(sid);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Student))  return false;
		
		Student st = (Student) obj;
		
		return this.sid == st.getSid();
	}
	
}
