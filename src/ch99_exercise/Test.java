package ch99_exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 65);
        map.put("C", 67);
        map.put("D", 68);
        map.put("B", 66);

        List<String> keySet = new ArrayList<>(map.keySet());

        // Value 기준으로 내림차순 정렬.
        keySet.sort((o1, o2) -> map.get(o2) - map.get(o1));
        System.out.println("==내림차순 정렬==");
        for (String key : keySet) {
            System.out.println(String.format("Key : %s, Value : %s", key, map.get(key)));
        }

        // Value 기준으로 오름차순 정렬.
        System.out.println("==오름차순 정렬==");
        keySet.sort((o1, o2) -> map.get(o1) - map.get(o2));
        for (String key : keySet) {
            System.out.println(String.format("Key : %s, Value : %s", key, map.get(key)));
        }
	}

}
