package mysql.Ex07_kpop;

import java.util.Scanner;

import mysql.Ex06_customer.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		KpopService cs = new KpopService();
		Boolean run = true;

		while (run) {
			System.out.println("+-------------+--------------------+-----------------+");
			System.out.println("| 1.Song LIST | 2. Girl Group List |  3.종료         |");
			System.out.println("+-------------+--------------------+-----------------+");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());

			switch (selectNo) {
			case 1:
				cs.listSong(); break;
			case 2:
				cs.listGrilGroup(); break;
//			case 3:
//				cs.updateCustomer(); break;
//			case 4:
//				cs.deleteCustomer(); break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				run = false; break;
			default:
				System.out.println("Warning: 1에서 3까지의 숫자만 입력하세요.");
			}
		}

	}

}
