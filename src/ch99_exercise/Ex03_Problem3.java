package ch99_exercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 어느 회사 사원의 직급체계는 다음과 같다.
 *   부장(1), 차장(2), 과장(3), 대리(4), 사원(5)
 *   이 회사 종업원을 사번(id), 이름(name), 직급(position), 입사일자(joinDate) 4개의 필드로
 *   모델링을 하되, 다음의 조건을 만족해야 한다.
 *   1. 사번과 이름이 같으면 동일한 사람이다.
 *   2. 출력을 할 경우에는 직급, 입사일자 순으로 출력이 되어야 한다.
 *   10명의 테스트 데이터를 만들어 그 결과를 확인해 보세요.
 */
public class Ex03_Problem3 {

	public static void main(String[] args) {

		// 1. 사번과 이름이 같으면 동일한 사람이다. -> HashSet
		Set<Employee> hs = new HashSet<>();  		// => hashcode, equals 를 비교
		hs.add(new Employee(123, "김다나", Position.부장, LocalDate.of(1998, 4, 5)));
		hs.add(new Employee(124, "김다sk", Position.부장, LocalDate.of(1998, 5, 5)));
		hs.add(new Employee(125, "나다나", Position.차장, LocalDate.of(2000, 4, 5)));
		hs.add(new Employee(126, "다다나", Position.사원, LocalDate.of(2005, 4, 5)));
		
		// 결과는?
		// 추가 2개
		
		for (Employee emp: hs )
			System.out.println(emp);
		System.out.println();
		
		// 2. 
		Set<Employee> ts = new TreeSet<Employee>();	// => compareTo 비교
		ts.add(new Employee(123, "김다나", Position.부장, LocalDate.of(1998, 4, 5)));
		ts.add(new Employee(124, "김다sk", Position.부장, LocalDate.of(1998, 5, 5)));
		ts.add(new Employee(125, "나다나", Position.차장, LocalDate.of(2000, 4, 5)));
		ts.add(new Employee(126, "다다나", Position.사원, LocalDate.of(2005, 4, 5)));
		for (Employee emp: ts )
			System.out.println(emp);
		
		
	}

}
