package ch05;

import java.util.Scanner;

public class Ex08_Exercise {

	public static void main(String[] args) {
		
		// 확인문제 4
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
		System.out.println("max : " + max);

		// 확인문제 5
		int[][] array1 = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;

		for (int[] row : array1) {
			for (int col : row) {
				sum += col;
			}
		}

		avg = (double) sum / (array1[0].length + array1[1].length + array1[2].length);

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

		// 확인문제 6
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {

			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.학생수  |  2.점수입력  |  3.점수리스트  |  4.분석  |  5. 종료");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				System.out.println(studentNum);
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {
				
				for (int i=0; i< scores.length; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = Integer.parseInt(scanner.nextLine());
				}

			} else if (selectNo == 3) {
				
				for (int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}

			} else if (selectNo == 4) {
				
				int nMax = 0;
				int total = 0;
				for (int score: scores) {
					total += score;
					if (score > nMax ) nMax = score;
				}
				System.out.println("최고 점수: " + nMax);
				System.out.println("평균 점수: " + (double)total/scores.length);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
	}

}
