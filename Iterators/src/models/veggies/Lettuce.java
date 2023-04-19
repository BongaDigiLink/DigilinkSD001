package models.veggies;

public class Lettuce {
	private int price;
	private String store_name;
	private int barcode;
	
	
	public Lettuce() {
		this.price = 00;
	}
	
	public Lettuce(int price, String name) {
		super();
		this.price = price;
		this.store_name = name;
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
	public void setStoreName(String name) {
		this.store_name = name;
	}
	
	
}
