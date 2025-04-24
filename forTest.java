package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class forTest {
	public static void main(String args[]) {
		
		List<Integer> intResult = new ArrayList<Integer>();
		
		intResult.add(85);
		intResult.add(92);
		intResult.add(78);
		intResult.add(65);
		intResult.add(98);
		intResult.add(70);
		
		System.out.println(intResult);
		
		
		
		
		Integer element = 0;
		
		for(Integer intScore: intResult) {
			if(intScore >= 70) {
				element++;
			}
		}
		System.out.println("70点以上の得点の数は" + element + "個です。");
			
		
		
		
		
		
		
		
		
		
		
	}
}
