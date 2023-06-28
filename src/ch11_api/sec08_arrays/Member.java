package ch11_api.sec08_arrays;

public class Member implements Comparable{
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		
		Member m = (Member) o;
		
		// id를 기준
		return this.id - m.getId();

		// name을 기준
//		return this.name.compareTo(m.getName());

	}
	
	
	
	
	
}
