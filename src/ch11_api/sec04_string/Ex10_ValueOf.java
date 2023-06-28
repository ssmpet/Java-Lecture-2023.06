package ch11_api.sec04_string;

public class Ex10_ValueOf {

	public static void main(String[] args) {
		String num = String.valueOf(""+100+10.2+"test");
		String num2 = "" + 100;
		
		System.out.println(num);
		System.out.println(num.equals(num2));
	}

}
