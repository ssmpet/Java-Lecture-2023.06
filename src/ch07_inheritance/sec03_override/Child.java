package ch07_inheritance.sec03_override;

/**
 * Method override(재정의)
 */
public class Child extends Parent {
	int childInt;
	
	void childMethod() {
		System.out.println(this.childInt);
	}
	
	@Override
	void parentMethod() {
		super.parentMethod();
		System.out.println(this.parentInt + ", " + this.childInt);
	}

}
