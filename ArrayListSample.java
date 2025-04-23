package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
	public static void main(String args[]) {
		
		List<String> fruitsList = new ArrayList<>();
		
		fruitsList.add("apple");
		fruitsList.add("peach");
		fruitsList.add("grape");
		fruitsList.add("potato");
		
		
		System.out.println(fruitsList);
		System.out.println(fruitsList.getFirst());
		System.out.println(fruitsList.get(2));
		
		String element1 = fruitsList.get(2);
		System.out.println("二番目の要素:" + element1);
		
		fruitsList.remove(3);
		System.out.println(fruitsList);
		
		fruitsList.remove("peach");
		System.out.println(fruitsList);
			
			
			
			
			
			
	}
}
