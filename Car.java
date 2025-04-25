package jp.co.aforce.sample;

public class Car {
	String Maker;
	Integer Year;
	
	
	public Car(String Maker,Integer Year) {
		this.Maker = Maker;
		this.Year = Year;
	
	}
	
	public void displayInfo() {
		System.out.println("メーカー:" + Maker + "年式:" + Year);
		
	}
	
	
	
	public static void main(String args[]) {
		
		Car CarA = new Car("TOYOTA",1998);
		Car CarB = new Car("NISSAN",2010);
		
		CarA.displayInfo();
		CarB.displayInfo();
		
	}
	
	
	
	
	
	
}
