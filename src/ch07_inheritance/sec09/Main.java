package ch07_inheritance.sec09;


public class Main {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
		
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
