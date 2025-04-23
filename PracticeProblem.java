package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticeProblem {
	public static void main(String args[]) {

		Map<String, Integer> fluitsList = new HashMap<>();
		fluitsList.put("りんご", 100);
		fluitsList.put("みかん", 80);
		fluitsList.put("バナナ", 120);
		fluitsList.put("いちご", 300);

		System.out.println(fluitsList);

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("ほしい商品を入力してください");
			String fluits = scanner.nextLine();

			Integer value = fluitsList.get(fluits);
			if (value != null) {
				System.out.println(fluits + ":" + value + "円");
			} else {
				System.out.println("申し訳ありませんが商品がございません");
			}
		}

		/*スキャナー
		Scanner scaner = new Scanner(System.in);
		System.out.println("ほしい商品を入力してください");
		String fluits = scanner.nextLine();
		scanner.close();
		*/

	}
}
