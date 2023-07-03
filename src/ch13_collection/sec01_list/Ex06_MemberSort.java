package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex06_MemberSort {

	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<>();

		list.add(new Member(23,	"James"));
		list.add(new Member(28, "Maria"));
		list.add(new Member(28, "Brian"));
		list.add(new Member(23, "Emma"));

		// Comparator class를 만들어서 비교
		list.sort(new MemberComparator());
		list.forEach(x -> System.out.println(x));
		System.out.println();

		// Comparator class를 만들어서 비교 나이로 오름차순
		list.sort(new MemberAgeComparator());
		list.forEach(x -> System.out.println(x));
		System.out.println();

		// Comparator class를 만들어서 비교 이름으로 내림차순
		list.sort(new MemberNameComparator());
		list.forEach(x -> System.out.println(x));
		System.out.println();
		
	}

}
