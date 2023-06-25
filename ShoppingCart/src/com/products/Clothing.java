package com.products;

public class Clothing extends Product{
	protected int size;
	public Clothing() {
		// TODO Auto-generated constructor stub
	}
	
	public Clothing(int size) {
		super();
		this.size = size;
	}
	
	public Clothing(double price, String name, int quantity)
	{
		super(price, name, quantity);
	}
	
	public Clothing(double price, String name, int quantity, int size) {
		super(price, name, quantity);
		// TODO Auto-generated constructor stub
		this.size = size;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public void setName(String name)
	{
		super.setName(name);
	}
	@Override
	public String getName()
	{
		return name;
	}
	

	@Override
	public String toString() {
		return "Clothing [size=" + size + ", price=" + price + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
	
}
