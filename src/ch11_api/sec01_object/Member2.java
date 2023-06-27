package ch11_api.sec01_object;

public class Member2 {
	String id;
	String name;
	
	public Member2(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member2) {
			Member2 m2 = (Member2) obj;
			return this.id.equals(m2.id) && this.name.equals(m2.name);
		}
		
		return false;
	}
}
