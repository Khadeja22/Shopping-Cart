package com.products;

public class Media extends Product{
	private String type;
	public Media() {
		// TODO Auto-generated constructor stub
	}
	
	public Media(String type) {
		super();
		this.type = type;
	}
	
	public Media(double price, String name, int quantity) {
		super(price, name, quantity);
		// TODO Auto-generated constructor stub
	}
	
	public Media(double price, String name, int quantity, String type) {
		super(price, name, quantity);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}
	public void setType(String s) {
		this.type = s;
	}
	@Override
	public String toString() {
		return "Media [type=" + type + "]";
	}
	
}
