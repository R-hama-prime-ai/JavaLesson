package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class TestScore {
	public static void main(String[] args) {
		
		int score = 58;
		
		if (score >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		
		
		boolean submittedReport = true;
		if(score >= 60 || submittedReport) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		List <String> fruitsList = new ArrayList<>();
		fruitsList.add("りんご");
		fruitsList.add("みかん");
		fruitsList.add("ぶどう");
		
		
		for(int j = 0; j < fruitsList.size(); j++) {
			System.out.println(fruitsList.get(j));
		}
		
		int intNumber = 8;
		System.out.println(intNumber);
		double doubleNumber = (double)intNumber;
		System.out.println(doubleNumber);
		
		
		double temperature = 28.4;
		System.out.println(temperature);
		int intTemperature = (int)temperature;
		System.out.println(intTemperature);
		
		
		
		
		
		
	}
	
}
