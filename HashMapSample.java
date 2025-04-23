package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
	public static void main(String args[]) {
		
		Map<String,Integer> nameMap = new HashMap<>();
		nameMap.put("Bob",1);  
		nameMap.put("Alice", 2);
		nameMap.put("John", 2);
		nameMap.put("Tom", 1);
		
		System.out.println(nameMap);
		
		
		Integer value = nameMap.get("Alice");
		System.out.println(value);
		
		Integer value1 = nameMap.get("Tarou");
		System.out.println(value1);
		
		
		nameMap.remove("John");
		System.out.println(nameMap);
		
	}
}
