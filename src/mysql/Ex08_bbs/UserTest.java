package mysql.Ex08_bbs;

import java.util.List;

import org.mindrot.bcrypt.BCrypt;
import org.w3c.dom.UserDataHandler;

import mysql.Ex08_bbs.dao.UserDao;
import mysql.Ex08_bbs.entity.User;

public class UserTest {

	public static void main(String[] args) {
		UserDao uDao = new UserDao();

		User james = new User("James", "James", "제임스", "james@goole.com");
		User maria = new User("maria", "maria", "마리아", "maria@goole.com");
		
		uDao.registerUser(james);
		uDao.registerUser(maria);
		
		List<User> list = uDao.getUserList(10, 0);
		for (User u: list)
			System.out.println(u);
		System.out.println("===========================================");
		
		james = uDao.getUser("james");
		maria = uDao.getUser("maria");
		
		// 패스워드 변경
		String jamesPwd = BCrypt.hashpw(james.getPassword(), BCrypt.gensalt());
		String mariaPwd = BCrypt.hashpw(maria.getPassword(), BCrypt.gensalt());
		
		james.setPassword(jamesPwd);
		maria.setPassword(mariaPwd);
		
		uDao.updateUser(james);
		uDao.updateUser(maria);
		
		list = uDao.getUserList(10, 0);
		for (User u: list)
			System.out.println(u);


	}

}
