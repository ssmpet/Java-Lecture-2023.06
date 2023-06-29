package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;

public class CommonDivisor {
	private int num1;
	private int num2;
	
	public CommonDivisor() {}
	public CommonDivisor(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "CommonDivisor [number1=" + num1 + ", number2=" + num2 + "]";
	}
	
	public List<Integer> getCommonDivisors( ) {
		
		List<Integer> list = new ArrayList<>();

		int min = Math.min(this.num1, this.num2);
				
		for (int i = 1; i <= min; i++) {
			if (this.num1 % i == 0 && this.num2 % i == 0) {
				list.add(i);
			}
		}

		return list;
	}

}
