package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;



public class Turist {
	public static void main(String[] args) {
		
		Map<String,Map<String, Integer>> touristData = new HashMap<>();
		
		
		Map<String,Integer> tokyoData = new HashMap<>();
		tokyoData.put("日本人", 150);
		tokyoData.put("外国人", 250);
		touristData.put("東京",tokyoData);
		
		Map<String,Integer> oosakaData = new HashMap<>();
		oosakaData.put("日本人", 120);
		oosakaData.put("外国人", 180);
		touristData.put("大阪",oosakaData);
		
		
		Map<String,Integer> kyotoData = new HashMap<>();
		kyotoData.put("日本人", 80);
		kyotoData.put("外国人", 120);
		touristData.put("京都",kyotoData);
		
		
		Map<String,Integer> fukuokaData = new HashMap<>();
		fukuokaData.put("日本人", 50);
		fukuokaData.put("外国人", 80);
		touristData.put("福岡",fukuokaData);
		
		Map<String,Integer> sapporoData = new HashMap<>();
		sapporoData.put("日本人", 40);
		sapporoData.put("外国人", 60);
		touristData.put("札幌",sapporoData);
		
		
		for(String city : touristData.keySet()) {
			Map<String, Integer> cityData = touristData.get(city);
			System.out.println(city + "の観光客数");
			System.out.println("日本人:" + cityData.get("日本人") + "万人");
			System.out.println("外国人:" + cityData.get("外国人") + "万人");
			
			int japanese = cityData.get("日本人");
			int foreign = cityData.get("外国人");
			int total = japanese + foreign;
			
			System.out.println("総観光客数:" + total + "万人");
			
			if(total >= 100) {
				System.out.println(city + "は100万人を超えています");
			}
			
			
			
			
		}
		
		
		int Japanese = 0;
		int Foreign = 0;
		
		for(Map<String,Integer> cityData : touristData.values()) {
			Japanese = Japanese + cityData.get("日本人");
			Foreign = Foreign + cityData.get("外国人");
		}
		
		int all = Japanese + Foreign;
		System.out.println("全都市合計観光客数" + all + "万人");
		
		
		
		
	}
}
