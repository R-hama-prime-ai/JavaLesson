package jp.co.aforce.sample;

public class Human {
	String name;
	int age;
	
	public Human(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public void displayInfo() {
		System.out.println("Name:" + name + ",Age:" + age);
	}
	
	
	public static void main(String args[]) {
		Human human = new Human("濵遼介",22);
		human.displayInfo();
		
		
	}
	
	
	
	
	
	
}
