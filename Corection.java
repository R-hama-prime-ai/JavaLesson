package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Corection {
	public static void main(String args[]) {
		
		
		/*コレクション*/
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(2);
		numList.add(8);
		numList.add(6);
		numList.add(12);
		numList.add(12);
		
		/*整数を並べる*/
		System.out.println(numList);
		
		
		/*Collections.sort(変数.Collections.reverseOrder());降順にする*/
		Collections.sort(numList,Collections.reverseOrder());
		System.out.println(numList);
		
		
		/*変換するときはそのまま書いて、さいごの()に変換したい変数を入れる*/
		HashSet<Integer> numList1 = new HashSet<Integer>(numList);
		System.out.println(numList1);
		
		
		List<String> fluitsList = new ArrayList<String>();
		fluitsList.add("リンゴ");
		fluitsList.add("バナナ");
		fluitsList.add("さくらんぼ");
		
		System.out.println(fluitsList);
		
	
		fluitsList.remove(1);
		System.out.println(fluitsList);
		
		
		fluitsList.add(2, "オレンジ");
		System.out.println(fluitsList);
		
		
		
		
		/*リスト*/
		List<String> nameList = new LinkedList<String>();
		nameList.add("田中");
		nameList.add("山本");
		nameList.add("佐藤");
		nameList.add("佐竹");
		
		System.out.println(nameList);
		
		String firstName = nameList.getFirst();
		String lastName = nameList.getLast();
		
		System.out.println("最初の要素" + firstName);
		System.out.println("最後の要素" + lastName);
		
		
		List<Integer> intList = new ArrayList <Integer>();
		intList.add(4);
		intList.add(83);
		intList.add(42);
		intList.add(3);
		
		for(int i = 0; i <= intList.size(); i++) {
			Integer NumList = intList.get(i);
			System.out.println("変数に入れた値" + NumList);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
