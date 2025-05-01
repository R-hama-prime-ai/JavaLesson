package jp.co.aforce.sample;

public class ExceptionPractice {

	public static void main(String[] args) {
		try {
			int age = 15;
			if (age < 18) {
				throw new IllegalArgumentException("18歳未満は登録できません");   // I(アイ)ll(エルエル)～
			}
			
			System.out.println("登録が完了しました」");
		}catch (IllegalArgumentException e) {
			System.out.println("例外が発生しました:" + e.getMessage());
		}
		

	}
}