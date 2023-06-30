package ch14_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Ex10_File {

	public static void main(String[] args) throws Exception {
		File dir = new File("c:/temp/images");
		File file = new File("c:/temp/file.txt");
		
		if (!dir.exists()) 			// 디렉토리가 없으면
			dir.mkdirs();			// 디렉토리 생성 : 경로상에 없는 모든 폴더를 생성
		
		if (!file.exists())			// 파일이 없으면
			file.createNewFile();	// 파일 생성
		
		File f2 = new File("c:/temp/print.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		System.out.println(sdf.format(f2.lastModified()));
		
		File temp = new File("c:/temp");
		File[] contents = temp.listFiles();
		for (File f: contents) {
			System.out.printf("%-22s", sdf.format(f.lastModified()));
			if (f.isDirectory())
				System.out.printf("%-15s %-20s", "<DIR>", f.getName());
			else
				System.out.printf("%,15d %-20s", f.length(), f.getName());
			System.out.println();
		}
	}

}
