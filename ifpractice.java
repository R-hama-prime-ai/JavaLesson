package jp.co.aforce.sample;

public class ifpractice {
	public static void main(String args[]) {
		
		int a = 50;
		int b = 50;
		
		
		if (a == b) {
			System.out.println("aはbの値と同じ");
		}
		
		
		boolean isSunny = false;
		
		
		if(isSunny) {
			System.out.println("傘は必要ないでしょう");
		} else {
			System.out.println("傘を持っていきましょう");
		}
		
		
		
		int temperature = 25;
		if(temperature >= 30) {
			System.out.println("真夏日です");
		} else {
			System.out.println("真夏日ではありません");
		}
		
		
		int score = 75;
		if(score >= 80) {
			System.out.println("優");
		} else if(score >= 70){
			System.out.println("良");
		} else if(score >= 60){
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
		
		
		int time = 14;
		boolean isHoliday = false;
		
		
		if(time >= 9 && time <=18 && !isHoliday) {
			System.out.println("勤務時間内です");
		} else {
			System.out.println("勤務時間外です");
		}
		
		
		if(time < 9 || time >18 || isHoliday) {
			System.out.println("勤務時間外です");
		} else {
			System.out.println("勤務時間内です");
		}
		
		
		
		boolean hasLicense = true;
		boolean hasCar = true;
		
		
		if(hasLicense) {
			System.out.println("運転免許を持っています。");
			if(hasCar){
				System.out.println("車を持っています。");
			} else {				
				System.out.println("しかし、車は持っていません。");
			} 			
		} else {
			System.out.println("運転免許を持っていません。");
		}
		
		
		boolean hasTeeth = false;
		boolean hasHair = true;
		
		
		if(hasTeeth) {
			System.out.println("歯があります");
			if(hasHair) {
				System.out.println("髪があります");
			} else {
				System.out.println("禿げてしまっています");
			}
		} else {
			System.out.println("歯がありません");
		}
		
		
		
		
		
		
		String color = "yellow";
		String message;
		switch(color) {
				case "red":
					message = "停止してください";
					break;
				
				case "yellow":
					message = "注意してください";
					break;
					
				case "green":
					message = "進んでください";
					break;
					
				default:
					message = "不正な信号の色です";
			}
		System.out.println("現在の信号:" + color + "-" + message);
		
		
		
		String week = "Saturday";
		String message1 = null;
		switch(week) {
				case "Sunday":
					message1 = "今日は日曜日です";
					break;
					
				case "Monday":
					message1= "今日は月曜日です";
					break;
					
				case "Tuseday":
					message1 = "今日は火曜日です";
					break;
					
				case "Wedensday":
					message1 = "今日は水曜日です";
					break;
					
				case "Thursday":
					message1 = "今日は木曜日です";
					break;
					
				case "Friday":
					message1 = "今日は金曜日です";
					break;
					
				case "Saturday":
					message1 = "今日は土曜日です";	
		}
		System.out.println(week + message1);
		
		
		
		
		
		
		
		
		
	
	}
}
