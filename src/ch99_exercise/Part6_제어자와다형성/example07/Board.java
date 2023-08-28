package ch99_exercise.Part6_제어자와다형성.example07;

public class Board {
	private String subject;
	private String content;
	private String writer;
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	
	public void show() {
		System.out.println("[제목=" + subject + ", 내용=" + content + ", 글쓴이=" + writer + "]");
	}
	

	
}
