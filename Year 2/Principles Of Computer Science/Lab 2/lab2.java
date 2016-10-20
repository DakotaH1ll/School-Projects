/**
 * @author Dakota James Hill (100523538)
 *
 */

package lab2;

import java.util.Scanner;
import java.util.Random;

public class lab2 extends questions {

	public static void main(String[] args) {
		Scanner choiceInt = new Scanner(System.in);

		System.out
				.println("Please enter a question number between 1 and 5, input 0 to print 'Hello World!'");
		int choice = choiceInt.nextInt();

		if (choice == 0) {
			q0();
		} else if (choice == 1) {
			q1();
		} else if (choice == 2) {
			q2();
		} else if (choice == 3) {
			q3();
		} else if (choice == 4) {
			q4();
		} else if (choice == 5) {
			q5();
		} else {
			System.out.println("That is an invalid option!");
		}
	}
}
