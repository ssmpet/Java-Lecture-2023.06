package ch06_class.Example08;

class Data{
	int data;
}

public class ReferenceReturnClass {

	public static void main(String[] args) {

		Data ori = new Data();
		ori.data = 100;
		Data cloned = copy(ori);
		System.out.println(cloned.data);
		System.out.println("original 주소 :" + ori);
		System.out.println(cloned);
		System.out.println("cloned 주소 :" + cloned);
	
	}

	public static Data copy(Data data ) {
		
		System.out.println("copy data 주소 :" + data);
		Data cloned = new Data();
		cloned.data = data.data;

		return cloned; // Data클래스의 주소를 리턴값으로 넘기고 있다.
	}
}
