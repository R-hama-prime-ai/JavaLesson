package jp.co.aforce.sample;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください:");
		String number = scanner.nextLine();

		try {

			int num = Integer.parseInt(number);
			int herfNumber = num / 2;
			System.out.println(herfNumber);

			scanner.close();

		} catch (NumberFormatException e) {
			System.out.println("ヌルポが発生しました。" + e.getMessage());
		}

		System.out.println("プログラムは継続します");

		System.out.println(4 + 8);

	}

}
