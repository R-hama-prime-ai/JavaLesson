package jp.co.aforce.sample;

public class PersonTest {
	String name;
	int age;
	
	public PersonTest(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void displayInfo() {
		System.out.println(name + "は" + age + "歳です");
	}
	
	
	
	
	public static void main(String args[]) {
		PersonTest PersonA = new PersonTest("小林",23);
		PersonTest PersonB = new PersonTest("高橋",18);
		
		
		
		PersonA.displayInfo();
		PersonB.displayInfo();
		
		
	}
	
	
	
}
