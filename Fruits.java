package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Fruits {

	
	
	
	//ArrayListを作成し、以下の順に追加して、リストから「バナナ」を削除し、「オレンジ」を追加した結果をコンソールに出力してください。
	public static void main(String[] args) {
		List<String> fruitsList = new ArrayList<>();
		fruitsList.add("リンゴ");
		fruitsList.add("バナナ");
		fruitsList.add("さくらんぼ");
		
		
		fruitsList.remove(1);
		
		fruitsList.add("オレンジ");
		
		System.out.println(fruitsList);
		
		
		
		
		
		
		
		
		

	}

}
