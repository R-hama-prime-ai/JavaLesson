package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class PracticeTest4 {
	public static void main(String args[]) {
		
		
		//String[] animals = {"","",・・・""};で配列！
		
		
		
		List<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("ねこ");
		animals.add("うさぎ");
		animals.add("へび");
		
		String animal = "龍";
		if(animals.contains(animal)) {
			System.out.println(animal + "はリストに含まれています");
		} else {
			System.out.println(animal + "はリストに含まれていません");
		}
		
		
		Map<Integer,String> Calender = new HashMap<>();
		Calender.put(1, "冬物セール");
		Calender.put(2, "春物を売る");
		Calender.put(3, "春物を売る");
		Calender.put(4, "春物を売る");
		Calender.put(5, "春物セール");
		Calender.put(6, "夏物を売る");
		Calender.put(7, "夏物を売る");
		Calender.put(8, "夏物セール");
		Calender.put(9, "秋物を売る");
		Calender.put(10, "冬物を売る");
		Calender.put(11, "冬物を売る");
		Calender.put(12, "冬物を売る");
		Calender.put(null, "不正な月です");
		
		
		
		
		//まとめれるところはまとめちゃった方がいい
		
		Integer key = 1;
		String message = null;
		switch (key) {
		case 1:
			message = "冬物セール";
			break;
		case 2:
			message = "春物を売る";
			break;
		case 3:
			message = "春物を売る";
			break;
		case 4:
			message = "春物を売る";
			break;	
		case 5:
			message = "春物セール";
			break;	
		case 6:
			message = "夏物を売る";
			break;	
		case 7:
			message = "夏物を売る";
			break;	
		case 8:
			message = "夏物セール";
			break;	
		case 9:
			message = "秋物を売る";
			break;	
		case 10:
			message = "冬物を売る";
			break;	
		case 11:
			message = "冬物を売る";
			break;	
		case 12:
			message = "冬物を売る";
			break;	
			
		default:
			message = "不正な月です";
			
		
			
		}
		
		
		System.out.println(message);
		
		
		
		
		
		
	}
}
