package ch10_exception;

public class Ex07_MultiCatch {

	public static void main(String[] args) {
		String str = null;
		int value = 0;
		
		try {
			str = args[0];
			value = Integer.parseInt(str);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("사용법: 매개변수를 입력하세요.");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("잘못된 숫자형식입니다.");
		}

		System.out.println(value);
	}

}
