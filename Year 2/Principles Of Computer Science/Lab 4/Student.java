package lab4;

import java.text.DecimalFormat;
import java.util.Random;

interface Comparable<T> {

	public int compareTo(Student comp);

}

public class Student {

	private String name;
	private String address;
	private String major;
	private double GPA;
	private static Random rand = new Random();
	private static DecimalFormat fmt = new DecimalFormat("0.###");

	public Student(String newName, String newAddress, String newMajor) {
		name = newName;
		address = newAddress;
		major = newMajor;
		computGPA();
	}

	public Student(String newName, String newAddress) {
		name = newName;
		address = newAddress;
		major = "Undeclard";
		computGPA();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public void computGPA() {
		GPA = 0.5 + (rand.nextDouble() * 3.5);
	}

	public String toString() {
		String result = "";
		result += ("Name:" + name + "\n");
		result += ("Address: " + address + "\n");
		result += ("Major: " + major + "\n");
		result += ("GPA: " + fmt.format(GPA) + "\n");
		return result;
	}

	
	// I compared length of the string for all of the comparisons, except GPA, in which I compared
	// Which number was larger between the 2
	// If the first string / number is larger, it outputs a positive number
	// Otherwise it outputs a negative number
	
	public int compareTo(Student comp) {
		if (this.getName() != comp.getName()) {
			if (this.getName().length() > comp.getName().length()) {
				return 1;
			} else {
				return -1;
			}

		} else if (this.getAddress() != comp.getAddress()) {
			if (this.getAddress().length() > comp.getAddress().length()) {
				return 2;
			} else {

				return -2;
			}

		} else if (this.getMajor() != comp.getMajor()) {
			if (this.getMajor().length() > comp.getMajor().length()) {
				return 3;
			} else {
				return -3;
			}

		} else if (this.getGPA() != comp.getGPA()) {
			if (this.getGPA() > comp.getGPA()) {
				return 4;
			} else {
				return -4;
			}

		} else {
			return 0;
		}

	}

}