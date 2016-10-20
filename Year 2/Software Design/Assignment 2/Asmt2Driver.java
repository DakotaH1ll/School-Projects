package Dope;

import java.util.Random;

class Asmt2Driver {
  public static void main(String[] args) {
	Random rg = new Random();

	double x = rg.nextDouble() * 10;
	double y = rg.nextDouble() * 10;
	Point2D pos1 = new Point2D(x, y);
	float vel1 = rg.nextFloat();
	x = rg.nextFloat() * 10;
	y = rg.nextFloat() * 10;
	Vector2D ori1 = new Vector2D(x, y);
	GPSMovingObject obj1 = new GPSMovingObject(pos1, vel1, ori1);

	x = rg.nextFloat() * 10;
	y = rg.nextFloat() * 10;
	Point2D pos2 = new Point2D(x, y);
	float vel2 = rg.nextFloat();
	x = rg.nextFloat() * 10;
	y = rg.nextFloat() * 10;
	Vector2D ori2 = new Vector2D(x, y);
	GPSMovingObject obj2 = new GPSMovingObject(pos2, vel2, ori2);

	float time = obj1.getEstimatedTimeTo(obj2);
	System.out.println("It took " + time + " seconds for "+obj1+" to reach "+obj2+".");
  }
}

