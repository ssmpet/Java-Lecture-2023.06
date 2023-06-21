package ch04;

public class Ex05_Score {

	public static void main(String[] args) {
		
		int score = 60 + (int)(40 * Math.random());
		
		String grade;
		
		// 방법 1
		if (score >= 90) {
			if (score >= 97) grade = "A+";
			else if (score >= 93) grade = "A";
			else grade = "A-";			
		} else if (score >= 80) {
			if (score >= 87) grade = "B+";
			else if (score >= 83) grade = "B";
			else grade = "B-";			
		} else if (score >=70) {
			if (score >= 77) grade = "C+";
			else if (score >= 73) grade = "C";
			else grade = "C-";			
		} else if (score >=60) {
			if (score >= 67) grade = "D+";
			else if (score >= 63) grade = "D";
			else grade = "D-";			
		} else {
			grade = "F";			
		}
		
		System.out.printf("점수 : %d점으로 당신의 학점은 %s 입니다.\n", score, grade);
		
		// 방법 2
		int dScore = score % 10;
		switch(score / 10) {
		
		case 9:
			grade = "A" + GetGrade(dScore);
			break;
		case 8:
			grade = "B" + GetGrade(dScore);
			break;
		case 7:
			grade = "C" + GetGrade(dScore);
			break;
		case 6:
			grade = "D" + GetGrade(dScore);
			break;
		default:
			grade = "F";			
		}
		
		System.out.printf("점수 : %d점으로 당신의 학점은 %s 입니다.\n", score, grade);
		
	}
	
	private static String GetGrade(int dScore) {
		switch(dScore) {
		case 7: case 8: case 9: return "+";
		case 0: case 1: case 2: return "-";
		default : return "";				
		}
	}

}
