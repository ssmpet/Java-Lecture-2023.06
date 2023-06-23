package ch06_class;

public class Ex01_Interaction {

	public static void main(String[] args) {
		int[] scores = {67, 89, 87, 92, 72};
		MyUtil myUtil = new MyUtil(); 			// 객체 생성
		int min = myUtil.getMinium(scores);		// 인스턴스 메소드 호출
		int max = myUtil.getMaxium(scores);
		double avg = MyUtil.getAverage(scores);	// 정적(static) 메소드 호출
		System.out.printf("min = %d, max = %d, avg = %.1f\n", min, max, avg);
		
		// myUtil.privateMethod();				// 접근 제한자가 private이라서 외부에서 사용 불가				
	}

}
