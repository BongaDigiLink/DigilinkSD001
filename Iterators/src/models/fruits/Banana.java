package models.fruits;

public class Banana {
	private int price;
	private String store_name;
	private int barcode;
	
	
	public Banana() {
		this.price = 00;
	}
	
	public Banana(int price, String store_store_name) {
		this.price = price;
		this.store_name = store_store_name;
		this.price = 00;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStoreName() {
		return store_name;
	}
	public void setStoreName(String store_name) {
		this.store_name = store_name;
	}
}
