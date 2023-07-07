package mysql.Ex07_kpop;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class KpopService {

	private KpopDao kDao = new KpopDao();
	private Scanner scan = new Scanner(System.in);
	
	public void listSong() {
		List<Song> list = kDao.getSongList();
		for (Song song: list)
			System.out.println(song);
	}
	
	public void listGrilGroup() {
		
		List<GirlGroup> list = kDao.getGirlGroupList();
		for( GirlGroup g: list)
			System.out.println(g);
	}
	
	public void registerGrilGroup() {
		String uid = null;
		
		while (true) { 				
			System.out.print("UID 입력 (취소:q)> ");
			uid = scan.nextLine();
			if (uid.equals("q")) return;
			GirlGroup g = kDao.getGirlGroup(Integer.parseInt(uid));
			if ( g == null) break;
			System.out.println("중복된 ID입니다. 다시 입력하세요.");
		}
		System.out.print("이름> ");
		String uname = scan.nextLine();
		kDao.insertGirlGroup(new GirlGroup());  // 수정요망
		System.out.println("고객 등록을 마쳤습니다.");
		
	}
	
	public void updateCustomer() {
//		String uid = null;
//		GirGroup c = null;
//		
//		while (true) {
//			System.out.print("UID 입력(취소:q)>");
//			uid = scan.nextLine();
//			if (uid.equals("q")) return;
//
//			c = cDao.getCustomer(uid);
//			if ( c!= null) break;
//			System.out.println("잘못된 ID입니다. 다시 입력하세요.");
//		}
//		System.out.print("이름 (" + c.getUname() + ")> ");
//		String uname = scan.nextLine();
//		System.out.print("등록일 (" + c.getRegData().toString() + ")> ");
//		String regDate = scan.nextLine();
//		c = new Customer(uid, uname, LocalDate.parse(regDate), 0);
//		cDao.updateCustomer(c);
//		System.out.println("고객정보 수정을 마쳤습니다.");
		
	}
	
	public void deleteCustomer() {
//		String uid = null;
//		GirGroup c = null;
//		
//		while (true) {
//			System.out.print("UID 입력(취소:q)>");
//			uid = scan.nextLine();
//			if (uid.equals("q")) return;
//
//			c = cDao.getCustomer(uid);
//			if ( c!= null) break;
//			System.out.println("잘못된 ID입니다. 다시 입력하세요.");
//		}
//		
//		cDao.deleteCustomer(uid);
//		System.out.println("고객탈퇴를 마쳤습니다.");
	}
}
