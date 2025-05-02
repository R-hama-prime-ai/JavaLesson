package jp.co.aforce.sample;


import java.util.Scanner;

public class Chiket {
	public static void main(String[] args) {
		
		
		//あなたは遊園地のチケット販売システムを担当しています。この遊園地では、年齢によって以下の料金システムが適用されます。
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("年齢を入力してください:");
		int age = scanner.nextInt();
		
		if(age <= 3) {
			System.out.println(age + "歳:無料");
		} else if (age >= 4 && age <= 12) {
			System.out.println(age +"歳:500円");
		} else if (age >= 13 && age <= 17) {
			System.out.println(age +"歳:800円");
		} else if (age >= 18 && age <= 59) {
			System.out.println(age +"歳:1200円");
		} else if (age >= 60 && age <=150) {
			System.out.println(age +"歳:700円");
		} else {
			System.out.println("不正な入力値です");
		}
		
		
		scanner.close();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
