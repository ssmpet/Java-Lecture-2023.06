package ch99_exercise.Part4.bankApplication;

import java.util.Scanner;

public class BankApplication {

	// 배열 100개 정적멤버로 되어있고, 배열이므로 한계가 있다.(메모리 낭비, 정적이다.)
	private static Account[] accounts  = new Account[100];
	private static Scanner sc = new Scanner(System.in);			
 	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금하기 | 4.출금하기 | 5.종료하기");
			System.out.println("---------------------------------------------------------------");
			System.out.print("선택 > ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("계좌관리 프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("1 ~ 5 번을 입력해 주십시요.");
				break;
					
			}
		}
	}


	public static void createAccount() {
		System.out.println("--------------------------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("--------------------------------");
		
		System.out.print("계좌 번호: ");
		// next() : 공백까지만. 한단어를 입력받을 때 용이한 메서드(공백을 발견하면 그 앞까지만 String 리턴)
		// nextLine() : 한 문장이나 한 줄을 입력받을 때 용이한 메서드
		String ano = sc.next();
		
		System.out.print("계좌주: ");
		String owner = sc.next();
		
		System.out.print("초기 입금액: ");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for (int i=0; i<accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = newAccount;
				System.out.println("결과 : 계좌 생성 완료되었습니다.");
				System.out.println(accounts[i].getAno() + ", " +
									accounts[i].getOwner() + ", " +
									accounts[i].getBalance());
				break;
			}
		}
	}
	
	public static void accountList() {
		System.out.println("--------------------------------");
		System.out.println("계좌 목록입니다.");
		System.out.println("--------------------------------");	
		for ( Account acc: accounts) {
			if (acc == null) break;
			System.out.println(acc.getAno() + "\t" + acc.getOwner() + "\t" + acc.getBalance());
			
		}
	}
	
	public static void deposit() {
		System.out.println("--------------------------------");
		System.out.println("예금을 합니다.");
		System.out.println("--------------------------------");	
		
		System.out.print("계좌번호 입력: ");
		String ano = sc.next();
		System.out.println("예금액: ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		
		if (account == null) {
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
		}
		
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공했습니다. 현재 잔액 : " + account.getBalance());
		
	}

	public static Account findAccount(String ano) {
		Account account = null;
		for ( int i=0; i<accounts.length; i++) {
			if (accounts[i] != null) {
				// 매개변수로 넘어온 계좌번호와 동일하다면...
				if ( accounts[i].getAno().equals(ano)) {
					account = accounts[i];
					break;
				}
			}
 		}
		
		return account;
	}


	public static void withdraw() {
		System.out.println("--------------------------------");
		System.out.println("출금을 합니다.");
		System.out.println("--------------------------------");	
		
		System.out.print("계좌번호 입력: ");
		String ano = sc.next();
		System.out.println("예금액: ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		
		if (account == null) {
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공했습니다. 현재 잔액 : " + account.getBalance());
	}


	
}
