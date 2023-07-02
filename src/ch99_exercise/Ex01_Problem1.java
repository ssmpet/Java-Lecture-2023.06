package ch99_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch13_collection.sec02_set.Member;

/**
 * 1. 다음과 같은 영어 대소문자, 공백과 구둣점(,.?)으로 이루어진 문자열이 주어진다. 
 *    이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 *    단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 *    먼저 전처리부터 하세요.(, ? . 제거)  
 */
public class Ex01_Problem1 {

	public static void main(String[] args) {
		
		
		String text = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?";
		
		System.out.println(text.length());		
		text = text.replace(",", "").replace("?", "").replace(".", "").toLowerCase();
		// text = text.replaceAll("[,|?|.]", "");
		System.out.println(text.length());
		
		String[] arr = text.split(" ");
		System.out.println("단어 갯수: " + arr.length);
		
		text2(arr);
		
		
//		// 고유 단어의 갯수
//		Set<MySet> set = new HashSet<>();
//
//		for (String word : arr) {
//			set.add(new MySet(word));
//		}
//		
		

		

//		for (MySet s: set)
//			System.out.println(s);

	}
	
	private static void text2(String[] arr) {
		
		Set<String> set = new HashSet<>();
		for (String word: arr)
			set.add(word.toLowerCase());
		System.out.println("고유 단어 갯수: " + arr.length);
		
		// 고유 단어가 몇번 사용되었는지
		HashMap<String, Integer> map = new HashMap<>();
		for (String word: arr) {
			String newWord = word.toLowerCase();
			if (map.containsKey(newWord)) 
				map.put(newWord, map.get(newWord) + 1);
			else
				map.put(newWord, 1);
		}

		// Key 로 sort
//		System.out.println((Object[])map.keySet().toArray());
//		Object[] arrKeys = map.keySet().toArray();
//		Arrays.sort(arrKeys);
//		for( Object key : arrKeys)
//			System.out.println(key + ": " + map.get(key));
//		
		// Value 로 sort
		List<String> keySets = new ArrayList<>(map.keySet());
		keySets.sort((o1, o2)-> map.get(o2)-map.get(o1));
		for (String key: keySets) {
			System.out.println(key + " : " + map.get(key));
		}

	}

}
