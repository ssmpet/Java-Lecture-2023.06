package ch06_class.Example05;

public class SamsungPhoneEx {

	public static void main(String[] args) {

		
		SamsungPhone sam = new SamsungPhone();
		
		sam.setCompany("삼성");
		sam.setModel("갤럭시s20");
		sam.setRelease(2018);
		sam.setColor("검정");
		System.out.println(sam);
		
		sam.setCompany("LG");
		sam.setModel("G6");
		sam.setRelease(2017);
		sam.setColor("빨강");
		System.out.println(sam);
	

	}

}
