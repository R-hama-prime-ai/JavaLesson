package jp.co.aforce.sample;

public class Book {
	String title;
	String author;
	int price;
	
	void shouInfo() {
		System.out.println("タイトル:" + title + "著者：" + author + "価格:" + price + "円");
	}
	
	
	public static void main(String args[]) {
		
		
		Book book1 = new Book();
		
		book1.title = "羅生門";
		book1.author = "芥川龍之介";
		book1.price = 1000;
		
		
		book1.shouInfo();
		
	}
	
}
