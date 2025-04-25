package jp.co.aforce.sample;

public class CarDefolt {
	String Maker;
	Integer Year;
	
	public void displayInfo() {
		System.out.println("メーカー:" + Maker + "年式:" + Year);
		
	}
	
	
	public static void main(String args[]) {
		CarDefolt Car1 = new CarDefolt();
		
		Car1.Maker = "Toyota";
		Car1.Year = 2003;
		
		Car1.displayInfo();
		
	}
	
	
	
	
}
