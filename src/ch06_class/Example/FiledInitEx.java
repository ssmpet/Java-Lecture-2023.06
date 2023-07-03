package ch06_class.Example;

public class FiledInitEx {

	public static void main(String[] args) {
		
		// 붕어빵을 찍고 있다.
		// 제품을 생산하고 있다.
		// new연사자가 클래스에 있는 멤버들의 바이트 크기만큼
		// 힙에다가 메모리 할당을 하며 동시에 초기화를 시켜주는 
		// 역할을 한다.
		FieldInit fi = new FieldInit();
		System.out.println(fi.byteField);
		System.out.println(fi.boolFiled);
		System.out.println(fi.floatFiled);
		System.out.println(fi.arrFiled);
		
		// 
		System.out.println(fi.toString());

		
	}

}
