package mysql.Ex08_bbs;

import java.util.ArrayList;
import java.util.List;

import mysql.Ex08_bbs.dao.ReplyDao;
import mysql.Ex08_bbs.entity.Reply;

public class ReplyTest {

	public static void main(String[] args) {
		
		Reply r1 = new Reply("처음으로 등록했어요.", "test", 1);
//		Reply r2 = new Reply("좋아요.~~!~", "maria", 3);
		
		ReplyDao rDao = new ReplyDao();
		
		rDao.insertReply(r1);
//		rDao.insertReply(r2);
		
		List<Reply> list = rDao.getReplyList(1);
		for (Reply r: list)
			System.out.println(r);

//		r1 = rDao.getReply(1);
//		r1.setComment("정말 좋아요. 수정했습니다");
//		rDao.updateReply(r1);
		

	}

}
