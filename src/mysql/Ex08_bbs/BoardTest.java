package mysql.Ex08_bbs;

import java.time.LocalDateTime;
import java.util.List;

import mysql.Ex08_bbs.dao.BoardDao;
import mysql.Ex08_bbs.entity.Board;

public class BoardTest {

	public static void main(String[] args) {
		
		
//		Board b1 = new Board("세번째 글", "세번째 글입니다.", "james");
//		Board b2 = new Board("네번째 글", "세번째 글입니다.", "maria");
//		
		BoardDao bDao = new BoardDao();
//		bDao.insertBoard(b1);
//		bDao.insertBoard(b2);
		
		List<Board> list = bDao.getBoardList(null, null, 10, 0);
		for (Board b: list)
			System.out.println(b);
		System.out.println();
		
//		Board b = bDao.getBoard(1);
//		System.out.println(b);
//		
//		System.out.println();
//		b.setTitle("첫 번째 글 제목 수정2");
//		b.setContent("첫 번째 내용 수정했습니다.222");
//		b.setModTime(LocalDateTime.now());
//		bDao.updateBoard(b);
//
//		b = bDao.getBoard(1);
//		System.out.println(b);
		
	}

}
