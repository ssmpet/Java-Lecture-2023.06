package ch06_class;

public class MyUtil {
	// 객체를 생성해서 사용 (new 객체)
	public int getMinium(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int element: array) {
			if (min > element) 
				min = element;
		}
		
		return min;
	}
	
	// 객체를 생성해서 사용 (new 객체)
	public int getMaxium(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int element: array) {
			if (max < element)
				max = element;
		}
		return max;
	}
	
	// 객체를 생성하지 않고도 사용할 수 있다. ( static 으로 선언해 주면 ) 
	public static double getAverage(int[] array) {
		int sum = 0;
		for (int element: array) {
			sum += element;
		}
		
		return (double) sum / array.length;
	}
	
	private static void privateMethod() {
		
	}
}
