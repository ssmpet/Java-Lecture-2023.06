package ch11_api.sec04_string;

/**
 * 3자리 숫자 두개를 곱해서 만든 숫자중 가장 큰 대칭수(팔린드롬)와 그때의 두 수는
 */
public class Ex15_Palindrome {

	public static void main(String[] args) {
		
		System.out.println(Strings.isPalidrome("우영우"));
		
		int maxPal = 0, x = 0, y = 0;
		for (int a = 100; a < 1000; a++) {
			for (int b = 100; b < 1000; b++) {
				int mul = a * b;
				if (Strings.isPalidrome(String.valueOf(mul))) {
					if ( mul > maxPal ) {
						maxPal = mul;
						x = a;
						y = b;
					}
				}
			}
		}

		System.out.printf("%d x % d = %d\n", x, y, maxPal);

	}

}
