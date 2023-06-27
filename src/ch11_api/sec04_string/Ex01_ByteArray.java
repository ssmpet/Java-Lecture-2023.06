package ch11_api.sec04_string;

import java.io.IOException;
import java.util.Arrays;

/**
 * byte array를 String으로 만들어주는 방법, 파일 I/O
 */
public class Ex01_ByteArray {

	public static void main(String[] args) throws Exception {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; 	// Hello Java
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		byte[] inputBytes = new byte[10];
		System.out.print("입력: ");
		int readBytes = System.in.read(inputBytes);			// 맨 끝에 \r\n 이 따라붙음
		
		String s3 = new String(inputBytes, 0, readBytes-2);	// \r\n을 제거하고 String으로 만듦
		System.out.printf("%d, %s\n", readBytes, s3);
		System.out.println(Arrays.toString(inputBytes));
	}

}
