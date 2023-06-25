package com.products;

public class Men extends Clothing{
	private String madeInName;
	public Men() {
		// TODO Auto-generated constructor stub
	}
	
	public Men(String madeInName) {
		super();
		this.madeInName = madeInName;
	}
	
	public Men(double price, String name, int quantity)
	{
		super(price, name, quantity);
	}
	
	public Men(double price, String name, int quantity, int size, String madeInName) {
		super(price, name, quantity, size);
		this.madeInName = madeInName;
		// TODO Auto-generated constructor stub
	}

	public String getMadeInName() {
		return madeInName;
	}
	
	@Override
	public String getName() {
		return name;
	}
	public void setMadeInName(String madeInName) {
		this.madeInName = madeInName;
	}
	
	@Override
	public void setName(String name)
	{
		this.name = getMadeInName()+" "+name;
	}

	@Override
	public String toString() {
		return "Men [madeInName=" + madeInName + ", size=" + size + ", price=" + price + ", name=" + name
				+ ", quantity=" + quantity + "]";
	}

	
	
	
}
