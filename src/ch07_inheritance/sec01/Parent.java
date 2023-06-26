package ch07_inheritance.sec01;

public class Parent {
	int parentInt;
	
	Parent() {	}

	Parent(int parentInt) {
		this.parentInt = parentInt;
	}
	
	void parentMethod() {
		System.out.println(this.parentInt);
	}
	
}
