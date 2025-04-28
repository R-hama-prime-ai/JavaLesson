package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PracticeTest3 {
	public static void main(String args[]) {
		
		
		// String[] 変数名 = {"","",""・・・・・""};
		//配列はこの形式
		
		
		List <String> itemList = new ArrayList<>();
		itemList.add("シャープペンシル");
		itemList.add("ボールペン");
		itemList.add("リングノート");
		itemList.add("クリップ");
		itemList.add("消しゴム");
		
		String item = itemList.get(1);
		System.out.println(item);
		
		
		LinkedList<String> employees = new LinkedList<>();
		employees.add("山田太郎");
		employees.add("鈴木花子");
		employees.add("佐藤次郎");
		employees.add("山田太郎");
		employees.add("高橋三郎");
		
		System.out.println(employees);
		
		String employee = employees.get(2);
		System.out.println(employee);
		
		
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);
		
		System.out.println(list1);
		
		
		ArrayList <Integer> list2 = new ArrayList<>(list1);
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);
		
		System.out.println(list2);
		
		/*???????????????????*/
		
		
		
	}
}
