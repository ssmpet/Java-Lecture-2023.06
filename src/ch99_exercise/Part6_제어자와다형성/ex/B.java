package ch99_exercise.Part6_제어자와다형성.ex;

import ch99_exercise.Part6_제어자와다형성.example01.Phone;

public class B extends Phone{
	Phone phone = new Phone("aa", "yellow", "LG");

	public B(String model, String color, String company, Phone phone) {
		super(model, color, company);
		this.phone = phone;
		System.out.println(phone.getModel());
		System.out.println(phone.getCompany());
		System.out.println(phone.getColor());
	}

	
}
