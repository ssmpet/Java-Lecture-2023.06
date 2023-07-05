package ch06_class.Example08;

public class ReferenceParamEx {

	public static void main(String[] args) {
		
		A a = new A();
		a.data = 77;
		System.out.println("메서드 호출전 main()내의 값 : " + a.data);
		// 동생한테 
		// Call by reference(주소에 의한 호출)
		ReferenceParamEx.dataChange(a);
		System.out.println("메서드 호출후 main()내의 값 : " + a.data);
	}
	
	public static void dataChange(A a) {
		// 지역변수 data라는 값은 값복사가 이루어졌기 때문에
		// 호출한 곳에서 아무런 영향을 받지 않는다.
		a.data = 44;
		System.out.println("dataChange 메서드 내의 값 : " + a.data);
		
		return;
	}
}
