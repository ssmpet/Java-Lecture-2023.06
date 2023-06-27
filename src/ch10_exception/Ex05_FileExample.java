package ch10_exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex05_FileExample {

	public static void main(String[] args) {
		String key = null;
		try {
			FileReader fr = new FileReader("c:/users/yonsai/downloads/test.txt");
			BufferedReader br = new BufferedReader(fr);
			key = br.readLine();
			br.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(key);
	}

}
