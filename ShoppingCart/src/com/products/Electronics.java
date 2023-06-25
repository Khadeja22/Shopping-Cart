package com.products;

public class Electronics extends Product{
	private String powerType;
	private boolean batteryIncluded;
	public Electronics() {
		// TODO Auto-generated constructor stub
	}
	
	public Electronics(String powerType, boolean batteryIncluded, String name) {
		super();
		this.powerType = powerType;
		this.batteryIncluded = batteryIncluded;
		this.name = powerType+" "+name;
	}
	
	
	
	public Electronics(double price, String name, int quantity) {
		super(price, name, quantity);
		// TODO Auto-generated constructor stub
	}

	public String getPowerType() {
		return powerType;
	}
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}
	public boolean isBatteryIncluded() {
		return batteryIncluded;
	}
	public void setBatteryIncluded(boolean b) {
		this.batteryIncluded = b;
	}
	@Override
	public String toString() {
		return "Electronics [powerType=" + powerType + ", batteryIncluded=" + batteryIncluded + "]";
	}
	
}
