package ch11_api.sec08_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01_PrimitiveSort {

	public static void main(String[] args) {
		int[] scores = {87, 73, 65, 98, 79};
		Arrays.sort(scores); 				// 오름차순 정렬, 자기 파괴적(scores의 내용이 바뀜)
		System.out.println(Arrays.toString(scores));
		Arrays.stream(scores).forEach(x -> System.out.println(x));

	
		String[] fruit = {"참외", "수박", "토마토"};
		Arrays.stream(fruit).forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		Arrays.sort(fruit);
		System.out.println(Arrays.toString(fruit));
		
		Arrays.sort(fruit, Comparator.reverseOrder());
		System.out.println(Arrays.toString(fruit));
		
		// 내림차순 정렬, int와 같은 primitive type은 Boxing을 해야 
		Integer[] descScore = Arrays.stream(scores).boxed().toArray(Integer[]::new);
		Arrays.sort(descScore, Comparator.reverseOrder());
		System.out.println(Arrays.toString(descScore));
	}

}
