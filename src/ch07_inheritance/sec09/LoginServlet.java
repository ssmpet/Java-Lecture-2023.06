package ch07_inheritance.sec09;

public class LoginServlet extends HttpServlet{
	
	@Override
	public void service() {
		System.out.println("로그인합니다.");
	}

}
