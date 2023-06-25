package com.products;

public class Product {
	protected double price;
	protected String name;
	protected int quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(double price, String name, int quantity) {
		super();
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		this.name = s;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int x) {
		this.quantity = x;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
}
