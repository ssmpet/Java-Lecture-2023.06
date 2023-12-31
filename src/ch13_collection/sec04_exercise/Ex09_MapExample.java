package ch13_collection.sec04_exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex09_MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		map.put("blue", 80);
		System.out.println(map.size());
		map.forEach((k, v) -> System.out.println(k + " : " + v));

		String nameString = null;
		int maxScore = 0;
		int totalScore = 0;

		for (String key : map.keySet()) {
			int score = map.get(key);
			if (score > maxScore) {
				maxScore = score;
				nameString = key;
			}
			totalScore += score;			
		}

		System.out.printf("평균점수: %d\n", totalScore / map.size());
		System.out.printf("최고점수: %d\n", maxScore);
		System.out.println("최고점수를 받은 아이디: " + nameString);

	}

}
