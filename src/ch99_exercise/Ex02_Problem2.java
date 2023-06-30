package ch99_exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Grep 찾을_문자열(대소문자 구분 없음) 찾을_파일
 */
public class Ex02_Problem2 {

	public static void main(String[] args) {
		grep("사번", "c:/temp/자바(230630)심화문제.txt");
	}
	
	static void grep(String word, String filePath) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			int lineNo = 0;
			while (true) {
				String line = br.readLine();
				if (line == null) break;
				lineNo++;
				String  newLine = line.toLowerCase();
				if (newLine.contains(word.toLowerCase()))
					System.out.printf("%4d:\t%s\n", lineNo, line);
			}
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
