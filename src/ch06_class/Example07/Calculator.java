package ch06_class.Example07;

public class Calculator {
	
	// 인스턴스 메서드
	// 인스턴스 특징 : new연산자로 인스턴스를 생성해야지만, 참조변수명.인스턴스메서드명 접근가능
	public int add(int x, int y) {
		int result = x + y;
		Calculator.divide(10.5,  11.7);
		return  result;
	}
	
	public int substract(int x, int y) {
		return x - y;
	}
	
	// static (정적)메서드
	// static의 특성 : 인스턴스 생성 없이 클래스명.정적메서드명으로 바로 접근 가능하다.
	public static long multiply(long x, long y) {
		return x * y;
	}
	
	// static (정적)메서드
	public static double divide(double x, double y) {
		return x / y;
	}
}
