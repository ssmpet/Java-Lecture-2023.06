package ch08_interface.sec04_example;

public class OracleDaoImpl implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("ORACLE DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("ORACLE DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("ORACLE DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("ORACLE DB에서 삭제");
	}

}
