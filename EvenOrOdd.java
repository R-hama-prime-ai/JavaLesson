package jp.co.aforce.sample;

public class EvenOrOdd {
	public static void main(String args[]) {
		
		/*3   変数 num に整数 7 を代入し、その整数が偶数か奇数かを判定するプログラムを作成してください。*/
		int num = 7;
		if (num % 2 == 0) {
			System.out.println("偶数");
		}
		else {
			System.out.println("奇数");
		}
		
		
		
		/*4   変数 num に小数 4.5 を代入し、その値を半分にして表示するプログラムを作成してください。*/
		double num1 = 4.5;
		System.out.println(num1 / 2);
		
		
		/*5   変数 num に小数 7.8 を代入し、その値を整数部分と小数部分に分けて表示するプログラムを作成してください。*/
		
		
		
		
		
		
		
		/*6   変数 num に小数 3.2 を代入し、その値を10倍にして表示するプログラムを作成してください。*/
		double num3 = 3.2;
		System.out.println(num3 * 10);
		
		
		/*7   変数 num に整数 0 を代入し、その値が0かどうかを判定するプログラムを作成してください。*/
		int num4 = 0;
		if (num4 == 0) {
			System.out.println("True");
		
		}else {
			System.out.println("False");
			
		}
		
		/*8   変数 num に整数 -5 を代入し、その値が負の数かどうかを判定するプログラムを作成してください。*/
		int num5 = -5;
		if (num5 < 0) {
			System.out.println("True");
				
			}else {
				System.out.println("False");
				
			}
			
		/*9   変数 num に整数 15 を代入し、その値が5の倍数かどうかを判定するプログラムを作成してください。*/
		int num6 = 15;
		if (num6 % 5 == 0) {
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
		
		
		/*10   変数 num7 に整数 8 を、num8 に整数 3 を代入し、それらの和を計算して表示するプログラムを作成してください。*/
		int num7 = 8;
		int num8 = 3;
		System.out.println(num7 + num8);
		
		/*11   変数 num9 に整数 10 を、num10 に整数 4 を代入し、それらの差を計算して表示するプログラムを作成してください。*/
		int num9 = 10;
		int num10 = 4;
		System.out.println(num9 - num10);
		
		/*12   変数 num11 に整数 6 を、num12 に整数 7 を代入し、それらの積を計算して表示するプログラムを作成してください。*/
		int num11 = 6;
		int num12 = 7;
		System.out.println(num11 * num12);
		
		/*13*/
		String name = "濵遼介";
		int age = 22;
		age += 1;
		System.out.println(name + "は次の誕生日で" + age + "歳です。");
		
		/*14*/
		int num13 = 8;
		int num14 = 3;
		System.out.println(num13 + num14);
		System.out.println(num13 - num14);
		System.out.println(num13 * num14);
		System.out.println(num13 / num14);
		
		/*15*/
		int test1 = 75;
		int test2 = 88;
		int test3 = 92;
		System.out.println((test1 + test2 + test3) / 3);
		
		
		/*16*/
		double price = 12000;
		double discountRate = 30;
		
		double discount = price * (discountRate/100); /*割り引いた価格*/
		double discountPrice = price - discount; /*割引後の価格*/
		
		System.out.println((int)discountPrice);
		
		
		/*17*/
		boolean a = true;
		boolean b = false;                   /*  True or FalseはTrueが出る*/
		boolean c = (a && b) || (!a && !b);  /*  &&かつのほうが最初 */
		System.out.println(c);
		
		/*18*/
		boolean x = true;
		boolean y = false;
		boolean z = x || y && !x;
		System.out.println(z);
		
		
		/*19*/
		boolean p = false;
		boolean q = true;
		boolean r = !(p || q) && (p && !q);
		System.out.println(r);
		
		/*20*/
		int age1 = 20;
		boolean hasStudentID = false;
		
		if ((age1 < 25 && hasStudentID) || age1 == 20) {
		
		System.out.println("割引対象です");/*正解こっち*/
			} else {
		
		System.out.println("通常料金です");
			}
	}
}
