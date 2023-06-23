package ch06_class;

import java.time.LocalDate;

public class Board {
	private String title;
	private String content;
	private String writer;
	private String date;
	private int hitcount;
	
	public Board(String title, String content) {
		this(title, content, null, null, 0);
	}

	public Board(String title, String content, String writer) {
		this(title, content, writer, null, 0);
	}

	public Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
	}

	public Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		if (date == null) {
			LocalDate today = LocalDate.now();
			this.date = today.toString();
		} else
			this.date = date;
		this.hitcount = hitcount;
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + ", date=" + date
				+ ", hitcount=" + hitcount + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
		
	
}
