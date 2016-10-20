package lab9;

import java.util.Comparator;


public class Product implements Comparable<String> {
	String name;
	double price;
	int amount;
	
	public Product(String name, double price, int amount)
	{
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	@Override
	public int compareTo(String arg0) {
		// TODO Auto-generated method stub
		return name.compareTo(arg0);		
	}

	

}