package ch06_class.Example;

public class FieldInit extends Object{
	
	// 기본형 변수
	byte byteField;		// 1
	short shortField;	// 2
	int intField;		// 4(디폴트 타입)
	long longFiled;		// 8
	
	boolean boolFiled;	// 1
	char charFiled;		// 2
	
	float floatFiled;	// 4
	double doublefiled;	// 8
	
	// 참조형 변수(동일하게 4byte)
	int[] arrFiled;		// 4
	String[] strFiled;	// 4
	
	// annotation : 컴파일러에게 강한 컴파일 요구
	// toString() : 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할때나
	//              원하는 포맷으로 멤버변수들을 출력하고자 할 때 사용을 많이 한다.
	@Override
	public String toString() {
		
		String str = "byteField: " + byteField + " shortField: " + shortField +
				" intField: " + intField +
				" boolFiled: " + boolFiled + " strFiled: " + strFiled;
		
		return str;
	}
	
}
