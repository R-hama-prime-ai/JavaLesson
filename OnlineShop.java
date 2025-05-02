package jp.co.aforce.sample;

import java.util.Scanner;

public class OnlineShop {

	public static void main(String[] args) {
		//このプログラムでは、商品の単価と購入個数を入力すると、購入金額に応じた割引と購入個数に応じた割引が適用され、最終的な税込価格を計算してコンソールに出力します。

		
		double tax = 0.1;
		double tax2 = 0.05;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("商品の単価を入力してください");
		int price = scanner.nextInt();
		System.out.println("購入個数を入力してください");
		int number = scanner.nextInt();
		scanner.close();
		
		
		//追加割引を考えていないところ
		double sum = price * number;
		System.out.println("割引前の価格:" + sum + "円");
		
		
		
		//追加割引込み
		//購入金額
		
		double sum1 = sum;
		
		if(price >= 5000 && price < 10000) {
			 sum1 = sum - sum * tax2;
		} else if (price >= 10000) {
			 sum1 = sum - sum * tax;
		}
		
		double priceless = sum1 + sum1 * tax;
		
		
		System.out.println("購入金額割引後税込み価格" + priceless + "円");
		
		
		//購入個数
		
		double sum2 = sum;
		if(number >= 3 && number < 5) {
			sum2 = sum - number * 50;
		} else if (number >= 5) {
			sum2 = sum - number * 100;
		}
		
		double numberless = sum2 + sum2 * tax;
		
		System.out.println("購入個数割引後税込み価格" + numberless + "円");
		
		
//		2つの条件込み
//		double sum3 = sum;
//		if((price >= 5000 && price < 10000) && (number >= 3 && number < 5)) {
//			sum3 = sum - ((sum * tax2) + (number * 50));
//		} else if ((price >= 5000 && price < 10000) && (number >= 3 && number < 5))
		
		
		
		
		
		
	}

}
