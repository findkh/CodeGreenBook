
public class Ex4_5 {

	public static void main(String[] args) {
		//﻿-5~5까지 수를 랜덤으로 나오게하려면
		int num = 0;
		
		for (int i = 1; i <=5; i++) {
			num = (int) (Math.random() * 10) -5;
			System.out.println(num);
		}

	}

}
