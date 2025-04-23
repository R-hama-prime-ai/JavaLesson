package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ChecknumberList {
	public static void main(String args[]) {
		
		
		List<String> Checknumber = new ArrayList<String>();
		int number = 23;
		String size = "large";
		String size1 = "small";
		
		
		
		if(number >= 10) {
			Checknumber.add(size);
		} else {
			Checknumber.add(size1);
		}
			
		System.out.println(Checknumber);
		
		
		
		
		
		
		
		
		

	}
}
