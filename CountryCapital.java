package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryCapital {
	public static void main(String args[]) {

		Map<String, String> strCountry = new HashMap<String, String>();

		strCountry.put("国名:日本", "首都:東京");
		strCountry.put("国名:アメリカ合衆国", "首都:ワシントンD.C.");
		strCountry.put("国名:フランス", "首都:パリ");
		strCountry.put("国名:中国", "首都:北京");
		
		
		System.out.println(strCountry);
		
		Set<String> strData = strCountry.keySet();
		
		System.out.println(strData);
		
		
		for(String Country: strData) {
			String strCapital = strCountry.get(strData);
			if(Country == "日") {
				System.out.println(Country );
			}
		}
		
		
		
		

	}
}
