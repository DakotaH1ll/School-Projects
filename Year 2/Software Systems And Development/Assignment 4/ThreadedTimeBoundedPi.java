package Quatre;

import java.util.Random;
import java.math.*;

class piThread extends Thread {

	double total;
	long time;
	long incircle;

	public piThread(long e, long c, int t) {
		this.time = e;
		this.incircle = c;
		this.total = t;
	}

	public void run() {
		incircle += ThreadedTimeBoundedPi.MathStuff(time);
		total = incircle * 1.27;
	}

	public long outInCirc() {
		return incircle;
	}

	public double outTote() {
		return total;
	}
}

public class ThreadedTimeBoundedPi {

	public static long MathStuff(long end) {
		long inCircle = 0;
		double x = 0;
		double y = 0;
		long total = 0;

		Random R = new Random();

		long endTime = System.currentTimeMillis() + end;

		while (System.currentTimeMillis() < endTime) {
			x = R.nextDouble();
			y = R.nextDouble();
			if (x * x + y * y <= 1) {
				inCircle += 1;
			}
			total += 1;
		}
		return inCircle;

	}

	public static void print(double c, int t) {
		double pi = (double) c / t * 4.0;

		System.out.println(t + ": Estimation of PI = " + pi);
		System.out
				.println(t + ": Estimation error = " + Math.abs(Math.PI - pi));
	}

	public static void main(String[] args) {
		int total = 0;
		long incirc = 0;
		long end = Integer.parseInt(args[0]);
		int threads = Integer.parseInt(args[1]);

		for (int i = 0; i < threads; i++) {
			piThread temp = new piThread(end, incirc, total);
			temp.start();
			try {
				temp.join();
				total += temp.outTote();
				incirc += temp.outInCirc();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ThreadedTimeBoundedPi.print(incirc, total);
	}

}
