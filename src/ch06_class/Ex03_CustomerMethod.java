package ch06_class;

import java.time.LocalDate;

public class Ex03_CustomerMethod {

	public static void main(String[] args) {
		Customer customer = getCustomer(); 		// main이 static 이라서 static 메소드로 만들어서 사용해야 한다.
		printCustomer(customer);
	}

	static Customer getCustomer() {
		int cid = 1001;
		String name = "James";
		int age = 23;
		LocalDate today = LocalDate.now();
		boolean adult = true;
		Customer customer = new Customer(cid, name, age, today);
		customer.setAdult(adult);
		return customer;
	}
	
	static void printCustomer(Customer c) {
		System.out.println(c);
	}
}
