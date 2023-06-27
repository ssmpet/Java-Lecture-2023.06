package ch10_exception;

public class Ex08_Throws {

	public static void main(String[] args) throws Exception {
		findClass();
	}

	static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
		System.out.println(clazz.getName());
	}
}
