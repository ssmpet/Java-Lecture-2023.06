package ch06_class;

public class Member2 {
	private String name;
	private String id;
	private String password;
	private int age;
	

	
	public Member2(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Member2(String name, String id, String password) {
		this(name, id, password, 0);
	}

	public Member2(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		if (age >=0 && age <= 150)
			this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member2 [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
}
