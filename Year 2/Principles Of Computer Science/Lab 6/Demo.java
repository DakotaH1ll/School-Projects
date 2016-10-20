package CSCI2010;

import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		System.out.println("My Doubly Linked List Demo!");
		LinkedList<City> myList = new LinkedList<City>();
		myList.append(new City("Toronto", "ON", 2500000));
		myList.append(new City("Pickering", "ON", 90000));
		myList.append(new City("Ajax", "ON", 110000));
		myList.append(new City("Whitby", "ON", 122000));
		myList.append(new City("Oshawa", "ON", 150000));
		System.out.println(myList.toString());

		LinkedList<City> mySortedList = myList.sort_OutOfPlace();
		System.out.println("--------------------------------------------");
		
		System.out.println(mySortedList.toString());
		System.out.println("--------------------------------------------");
		
		myList.sort_InPlace();
		System.out.println(myList.toString());
	}
}