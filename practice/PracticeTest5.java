package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest5 {
	public static void main(String args[]) {

		Random r = new Random();
		int fortune = r.nextInt(3);
		System.out.println(fortune);

		String message = null;
		switch (fortune) {
		case 1:
			message = "吉です";
			break;
		case 2:
			message = "中吉です";
			break;
		case 3:
			message = "大吉です";
			break;
		default:
			message = "凶です";
		}

		System.out.println(message);

		
		
		
		/*カンマ区切りがわからない*/
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		

		int m[][] = new int[9][9];

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				m[i - 1][j - 1] = i * j;
			}
		}
		
		

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {

				System.out.print(" ");

				if (10 > m[i - 1][j - 1])
					System.out.print(" ");

				System.out.print(m[i - 1][j - 1]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
