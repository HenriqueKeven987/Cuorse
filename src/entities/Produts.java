package entities;

public class Produts {
	
	private String name;
	private double price;
	
	
	public Produts(String name, double price) {		
		this.name = name;
		this.price = price;
	}
	
	public String getname() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
