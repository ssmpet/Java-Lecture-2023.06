package ch11_api.sec04_string;

public class Ex07_Substring {

	public static void main(String[] args) {
		String ssn = "880815-1234567";

		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart); 			// 880815

		String seconPart = ssn.substring(7);
		System.out.println(seconPart); 			// 1234567

		// 생년월일을 "1988-08-23" 형태로 바꾸기
		String strYear="", strMonth, strDay;
		// if (ssn.charAt(7) == '1' || ssn.charAt(7) == '2' )  	// 방법2
		strYear = (ssn.charAt(7) == '1' || ssn.charAt(7) == '2') ? "19" : "20";
		
		strYear += ssn.substring(0, 2);
		strMonth = ssn.substring(2, 4);
		strDay = ssn.substring(4, 6);
		System.out.println(strYear + "-" + strMonth + "-" + strDay);

	}

}
