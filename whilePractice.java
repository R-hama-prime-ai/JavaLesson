package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class whilePractice {

	public static void main(String args[]) {

		int i = 0;
		while (i < 5) {

			System.out.println("iの値:" + i);
			i++;

		}

		i = 8;
		do {

			System.out.println("iの値:" + i);
			i++;

		} while (i < 5);

		for (i = 1; i <= 6; i++) {
			System.out.println(i);
		}

		/*一個目のforループが繰り返されている分だけ、
		 * ２個目のfor文が条件の分表示する
		 */
		for (int j = 0; j < 20; j++) {

			for (int z = 0; z <= 5; z++) {
				System.out.println("jの値" + j);
			}

		}

		List<String> strName = new ArrayList<String>();
		strName.add("田中太郎");
		strName.add("山田花子");
		strName.add("ピース又吉");

		System.out.println(strName);

		for (String strEmployee : strName) {
			System.out.println(strEmployee);

		}

	}

}
