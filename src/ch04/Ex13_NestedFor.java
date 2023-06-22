package ch04;

public class Ex13_NestedFor {

	public static void main(String[] args) {

		int n = 5;

		// Diamond 1사분면 그리기
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		// Diamond 2사분면 그리기
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - 1 - i; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		// Diamond 3사분면 그리기
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// Diamond 4사분면 그리기
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		// 완성된 다이아몬드
		for (int i = 0; i < n; i++) {

			for (int k = 0; k < n - 1 - i; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n - i; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < n - i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		// 홀수
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i - 1; k++) {
				System.out.print(" ");				
			}
			for (int k = 0; k < 2*i + 1; k++) {
				System.out.print("*");				
			}
			
			System.out.println();
		}

		
		for (int i = n - 1; i >= 0; i--) {

			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		

	}
}
