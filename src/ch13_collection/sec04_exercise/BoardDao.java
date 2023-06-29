package ch13_collection.sec04_exercise;


import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private List<Board> board;
	
	public BoardDao() {
		board = new ArrayList<Board>();
		
		for (int i = 1; i < 4; i++)
			this.board.add(new Board("제목"+i, "-내용"+i));
	}
	
	public List<Board> getBoardList() {
		return this.board;
	}
}
