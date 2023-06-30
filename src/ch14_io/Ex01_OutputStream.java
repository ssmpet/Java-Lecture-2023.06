package ch14_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_OutputStream {

	public static void main(String[] args)  {
		try {
			OutputStream os = new FileOutputStream("c:/temp/test.db");
			byte a = 10, b = 20;
			int c = 30;
			os.write(a);	// 1 byte
			os.write(b);	// 1 byte
			os.write(c);	// 1 byte
			
			byte[] array = {99, 98, 97, 96, 50};
			os.write(array);// 5 byte
			
			os.write(array, 1, 3); // 3 byte : 배열의 1번 인덱스부터 3개를 출력						
			
			os.flush();
			os.close();
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
