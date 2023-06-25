package com.products;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import dnl.utils.text.table.TextTable;

public class Shopping {
	static NumberFormat nf;
	public Shopping() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		nf=NumberFormat.getCurrencyInstance();
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		//need to use a random number generator to determine 
		//the quantity of each object purchased. The random number generated 
		//must be between 3 and 6 inclusive.
		// TODO 
		// use this number to pass in the constructors
		//below constructors need to include all the required parameters. 
		//Below are very basic constructors
		
		
		double priceA = 10.99;
		String nameA = "Basket";
		int quantityA = (int)((Math.random()*4)+3);
		Product prod = new Product(priceA, nameA, quantityA);
		
		double priceB = 1000.99;
		String nameB = "iPhone";
		int quantityB = (int)((Math.random()*4)+3);
		Electronics elect = new Electronics(priceB, nameB, quantityB);
		
		double priceC = 29.99;
		String nameC = "Vinyl Record";
		int quantityC = (int)((Math.random()*4)+3);
		Media media = new Media (priceC, nameC, quantityC);
		media.setType("Audio");
		
		
		double priceD = 15.99;
		String nameD = "Jeans";
		int quantityD = (int)((Math.random()*4)+3);
		Clothing cloth = new Clothing (priceD, nameD, quantityD);
		cloth.setName("Levi's Jeans");
		cloth.setSize(30);
		
		double priceE = 100.99;
		String nameE = "Dress";
		int quantityE = (int)((Math.random()*4)+3);
		Women wom = new Women (priceE, nameE, quantityE);
		wom.setColor("Red");
		wom.setName("Levi's Jeans for Women");
		
		
		double priceF = 150.99;
		String nameF = "Suit";
		int quantityF = (int)((Math.random()*4)+3);
		Men men = new Men (priceF, nameF, quantityF);
		men.setMadeInName("Pakistan Made");
		men.setName("Levi's Jeans for Men");
		
		
		// Store each object in your Product array
		products.add(prod);//1.
		products.add(elect);//2.
		products.add(media);//3
		products.add(cloth);//4.
		products.add(wom);//5.
		products.add(men);//6.
		
		
		
		//After adding those 6 Products to the ArrayList, we need you to add 5 more. 
		//Do not use p1,p2,p3,p4,and p5 as the names of the products.
		String powerTypeA = "120 Volt ";
		boolean batteryIncludedA = true;
		String nameElec1 = "Computer";
		Product elec1 = new Electronics(powerTypeA, batteryIncludedA, nameElec1);
		
		double priceMedia2 = 4.50;
		String nameMedia2 = "Movie";
		int quantityMedia2 = 10;
		String typeMedia2 = "CD";
		Product media2 = new Media(priceMedia2, nameMedia2, quantityMedia2, typeMedia2);
		
		double priceCloth2 = 100.00;
		String nameCloth2 = "Jacket";
		int quantityCloth2 = 2;
		int sizeCloth2 = 40;		
		Product cloth2 = new Clothing(priceCloth2, nameCloth2, quantityCloth2, sizeCloth2);
		
		
		double priceWomen2 = 15.00;
		String nameWomen2 = "Belt";
		int quantityWomen2 = 3;
		int sizeWomen2 = 4;
		String colorWomen2 = "Pink";
		Product women2 = new Women(priceWomen2, nameWomen2, quantityWomen2, sizeWomen2, colorWomen2);
		
		
		double priceMen2 = 2.00;
		String nameMen2 = "Socks";
		int quantityMen2 = 10;
		int sizeMen2 = 9;
		String madeInNameMen2 = "Bangladesh";
		Product men2 = new Men (priceMen2, nameMen2, quantityMen2, sizeMen2, madeInNameMen2);
		
		// Store each object in your Product array
		products.add(elec1);//1.
		products.add(media2);//2.
		products.add(cloth2);//3.
		products.add(women2);//4.
		products.add(men2);//5.
	
		
		
		// Use a for-each loop to print each object.
		for (Product product: products)
		{
			System.out.println(product+"\n");
			
		}
		
		System.out.println("\n\n*******************************************************************************");
		//System.out.println("\tNAME\t\t\t\t\tQUANTITY\t\t\tPRICE\t\t\tTOTAL");
		System.out.printf("%-36s\t%4s\t%s\t%15s%n", "NAME", "QUANTITY", "PRICE", "TOTAL");
		System.out.println("\n*********************************************************************************");
		
		
		// TODO 
				//In the tester program, create a loop that prints the name, 
				//company, quantity, price and total cost for each object along 
				//with its total cost on the same line. After printing each object’s 
				//information, call your grandTotal method and report that out as well. Be sure to include $ where specified in the sample output below:
			//company, quantity, price and total cost
		                                                        
		 
		for(Product object: products)
		{
			System.out.printf("%-36s\t%4s\t%16s\t%10s%n", object.getName(), object.getQuantity(), nf.format(object.getPrice()), nf.format(productCost(object)));
			
			//System.out.println("\t"+object.getName()+"\t\t\t\t\t"+object.getQuantity()+"\t\t\t"+nf.format(object.getPrice())+"\t\t\t"+nf.format(productCost(object)));
		}
		System.out.println("\n*******************************************************************************\n");
		System.out.printf("\tGrand Total:%-70s ",nf.format(grandTotal(products)));
		
	}// end of main method     
	
	
		// TODO 
		//Create a static method called productCost in your 
		//tester program that accepts a reference to a Product Object. The productCost 
		//method should return the total cost of each Product based on its price and quantity. 
	public static double productCost(Product p)
	{
		return p.getPrice()*p.getQuantity();
	}
		
		// TODO 
		//Create a static method called grandTotal that takes a reference to a 
		//Product ArrayList and returns the total cost 
		//for all of the objects in your Array.
	public static double grandTotal(ArrayList<Product> stuff)
	{
		double total = 0.00;
		for(Product item: stuff)
		{
			total += productCost(item);
		}
		return total;
	}
	
		

		//// TODO 
		
	

}
