package com.products;

public class Women extends Clothing{
	private String color;
	public Women() {
		// TODO Auto-generated constructor stub
	}
	
	public Women(String color) {
		super();
		this.color = color;
	}
	
	public Women(double price, String name, int quantity)
	{
		super(price, name, quantity);
	}
	
	public Women(double price, String name, int quantity, int size, String color) {
		super(price, name, quantity, size);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name)
	{
		this.name = getColor()+" "+name;
	}

	@Override
	public String toString() {
		return "Women [color=" + color + ", size=" + size + ", price=" + price + ", name=" + name + ", quantity="
				+ quantity + "]";
	}
	
	
	
}
