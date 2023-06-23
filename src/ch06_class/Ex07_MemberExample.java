package ch06_class;

public class Ex07_MemberExample {

	public static void main(String[] args) {
		Member2 member = new Member2("김아무개", "kimhy", "1234", 45);
		
		System.out.println(member);
		member.setName("최하얀");
		member.setAge(23);
		System.out.println(member);
		
		Board board1 = new Board("title1", "content1");
		System.out.println(board1.getWriter());
		if (board1.getWriter() == null) 
			System.out.println("null 값입니다.");
		
		board1.setWriter("KIMHY");
		if (board1.getWriter() != null) 
			System.out.println("null 값이 아닙니다.");
		System.out.println(board1);
		
		Board board2 = new Board("title2", "content2", "id2");
		System.out.println(board2);
		
		Board board3 = new Board("title3", "content3", "id3", "2023-05-30");
		System.out.println(board3);

		Board board4 = new Board("title4", "content4", "id4", "2023-07-01", 1000);
		System.out.println(board4);

	}
}
