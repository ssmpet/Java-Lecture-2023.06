package ch11_api.sec04_string;

/**
 * 1 ~ 1000까지 숫자를 썼을 때, 0에서 9까지 숫자는 각각 몇번씩 사용되는가?
 */
public class Ex14_Exercise {

	public static void main(String[] args) {

		// 방법 1
		int[] numArr = new int[10];
		for (int i = 0; i < numArr.length; i++)
			numArr[i] = 0;

		for (int i = 1; i < 1001; i++) {
			String strNum = String.valueOf(i);
			for (int k = 0; k < strNum.length(); k++) {
				int num = Integer.parseInt(String.valueOf(strNum.charAt(k)));
				numArr[num] += 1;
			}
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.printf("숫자 %3d:\t%d번 쓰임\n", i, numArr[i]);
		}
		System.out.println();
		
		
		// 방법 2
		String numStr = "";
		for (int i = 0; i <= 1000; i++)
			numStr += i;

		for (int i = 1; i < 10; i++) {
			int count = Strings.count(numStr, "" + i);
			System.out.println(i + " : " + count);
		}

		
		
	}

}
