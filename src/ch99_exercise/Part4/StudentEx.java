package ch99_exercise.Part4;

class A {
	int value;
}

class B {
	int value;
	public B(int value) {
		this.value = value;
	}
}

public class StudentEx {

	public static void main(String[] args) {
		
		// 기본생성자 호출
		Student student = new Student();
//		System.out.println(student.getAge());
		System.out.println(student);
		
		// 매개변수가 있는 생성자 호출
		Student student2 = new Student("홍길동", 50);
		System.out.println(student2);
		
		A a = new A();
//		B b = new B(); // 생성자가 하나 있으면 기본적인 생성자를 만들어 주지 않는다.
	}

}
