package ch04;

import java.util.Iterator;
import java.util.Random;

public class Ex05_Score {

	public static void main(String[] args) {

		int score = 60 + (int) (40 * Math.random());

		String grade, aux;

		int dScore = score % 10;
		aux = GetGrade(dScore);

		switch (score / 10) {

		case 9:
			grade = "A" + aux;
			break;
		case 8:
			grade = "B" + aux;
			break;
		case 7:
			grade = "C" + aux;
			break;
		case 6:
			grade = "D" + aux;
			break;
		default:
			grade = "F";
		}

		System.out.printf("점수 : %d점으로 당신의 학점은 %s 입니다.\n", score, grade);

	}

	private static String GetGrade(int dScore) {
		if (dScore >= 7)
			return "+";
		else if (dScore >= 4)
			return "";
		else
			return "-";

//		switch(dScore) {
//		case 7: case 8: case 9: return "+";
//		case 0: case 1: case 2: return "-";
//		default : return "";				
//		}
	}

}
