package lab3;

public class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		super(length, width);
		this.length = length;
		this.width = width;
		shapeName = "Rectangle";

	}

	double getArea() {
		return length * width;
	}

}