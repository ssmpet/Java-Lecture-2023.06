package ch07_inheritance.sec09;

public class FileDownloadServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("파일 다운로드합니다.");
	}

}
