package lab3;

public class Square extends Shape {
	public Square(double side) {
		super(side);
		this.side = side;

		shapeName = "Square";

	}

	double getArea() {
		return side * side;
	}

}
