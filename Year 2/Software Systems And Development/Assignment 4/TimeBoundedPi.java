package Quatre;

import java.util.Random;

public class TimeBoundedPi {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		long end = start + Integer.parseInt(args[0]);
		long total = 0;
		long inCircle = 0;
		double x = 0;
		double y = 0;
		double pi = 0;

		Random R = new Random();

		int iteration = 0;

		while (System.currentTimeMillis() < end) {
			// run

			x = R.nextDouble();
			y = R.nextDouble();
			if (x * x + y * y <= 1) {
				inCircle += 1;
			}
			total += 1;
			iteration += 1;

		}
		pi = (double) inCircle / total * 4.0;
		System.out.println(iteration + ": estimation of PI = " + pi);
		System.out.println(iteration + ": estimation error = "
				+ Math.abs(Math.PI - pi));
	}

}
