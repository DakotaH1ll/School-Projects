package lab3;

public abstract class Shape {
	protected String shapeName;
	public double side;

	public Shape(double side) {
	}

	public Shape(double len, double wid) {
	}

	abstract double getArea();
}
