package mysql.Ex08_bbs;

import java.util.List;

import mysql.Ex08_bbs.dao.UserDao;
import mysql.Ex08_bbs.entity.User;

public class UserTest {

	public static void main(String[] args) {
		UserDao uDao = new UserDao();
		
		uDao.registerUser(new User("James", "James", "제임스","james@goole.com"));
		uDao.registerUser(new User("maria", "maria", "마리아","maria@goole.com"));
		
		List<User> list = uDao.getUserList(10, 0);
		for (User u: list)
			System.out.println(u);
		
	}

}
