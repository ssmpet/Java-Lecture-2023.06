package ch06_class;

public class Ex04_Excercise {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int x = 100, y = 11;

	    System.out.println(((Integer) x).getClass().getSimpleName()); // Integer : 타입 알아보기
	    
		System.out.printf("x + y = %d\n", cal.add(x, y));
		System.out.printf("x * y = %d\n", cal.mul(x, y));
		System.out.printf("x - y = %d\n", cal.sub(x, y));
		System.out.printf("x / y = %.3f\n", cal.div(x, y));
		System.out.printf("x %% y = %d\n", cal.rest(x, y));		
	}

}
