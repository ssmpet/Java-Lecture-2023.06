package ch07_inheritance.sec01;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		parent.parentInt = 1000;
		parent.parentMethod();
		
		child.childInt = 300;
		child.childMethod();
		
		// child가 상속받은 parent의 속성/메소드 이용
		child.parentInt = 2000;
		child.parentMethod();
		
		// child가 상속받은 Parent instance와 parent instance는 다른 객체이다.
		parent.parentMethod();
		
		
	}

}
