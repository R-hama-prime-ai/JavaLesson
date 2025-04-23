package jp.co.aforce.sample;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample {
	public static void main(String args[]) {
		
		Set<Integer> numList = new HashSet<>();
		numList.add(2);
		numList.add(1);
		numList.add(1);
		numList.add(3);
		
		System.out.println(numList);
		
	}
	
	
}
