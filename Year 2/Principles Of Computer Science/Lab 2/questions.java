/**
 * @author Dakota James Hill 100523538
 *
 */
package lab2;

import java.util.Scanner;
import java.util.Random;

public class questions {

	static void q0() {
		System.out.println("Hello World!");
	}

	static void q1() {
		double average;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter three integers and"
				+ "I will compute their average");
		System.out.print("Enter 1st number: ");
		int val1 = scan.nextInt();
		System.out.print("Enter 2nd number: ");
		int val2 = scan.nextInt();
		System.out.print("Enter 3rd number: ");
		int val3 = scan.nextInt();

		average = ((val1 + val2 + val3) / 3);

		System.out.println("The average of those numbers is: " + average);

	}

	static void q2() {
		String s1 = "///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";
		String s2 = "==          Student Points        ==";
		String s3 = "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////";
		String s4 = "Name			Lab		Bonus	Total";
		String s5 = "----			---		-----	-----";
		String s6 = "Joe			43		7	50";
		String s7 = "William			50		8	58";
		String s8 = "Mary Sue		30		10	40";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
	}

	static void q3() {

		int val;
		int[] diff = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 different integers between 10 and 100:");

		val = scan.nextInt();
		if (val > 100) {
			System.out.println("Number must be less than 100");
		} else if (val < 10) {
			System.out.println("Number must be greater than 10");
		} else {
			diff[0] = val;
		}

		val = scan.nextInt();
		if (val > 100) {
			System.out.println("Number must be less than 100");
		} else if (val < 10) {
			System.out.println("Number must be greater than 10");
		} else if (val != diff[0]) {
			diff[1] = val;
		} else {
			System.out.println("Duplicate! I already have " + val);
		}

		val = scan.nextInt();
		if (val > 100) {
			System.out.println("Number must be less than 100");
		} else if (val < 10) {
			System.out.println("Number must be greater than 10");
		} else if (val != diff[0] && val != diff[1]) {
			diff[2] = val;
		} else {
			System.out.println("Duplicate! I already have " + val);
		}

		val = scan.nextInt();
		if (val > 100) {
			System.out.println("Number must be less than 100");
		} else if (val < 10) {
			System.out.println("Number must be greater than 10");
		} else if (val != diff[0] && val != diff[1] && val != diff[2]) {
			diff[3] = val;
		} else {
			System.out.println("Duplicate! I already have " + val);
		}

		val = scan.nextInt();
		if (val > 100) {
			System.out.println("Number must be less than 100");
		} else if (val < 10) {
			System.out.println("Number must be greater than 10");
		} else if (val != diff[0] && val != diff[1] && val != diff[2]
				&& val != diff[3]) {
			diff[4] = val;
		} else {
			System.out.println("Duplicate! I already have " + val);
		}

		System.out.println("Your integers are:");
		for (int value : diff)
			if (value != 0) {
			System.out.print(value + " ");
			}
	}

	static void q4() {
		String college = new String("PoDunk College");
		String town = "Anytown, USA";

		int stringLength = town.length();
		String change1, change2, change3;

		System.out.println(college + " contains " + stringLength
				+ " characters.");
		change1 = college.toUpperCase();
		change2 = change1.replace('O', '*');
		change3 = change2.concat(town);
		System.out.println("The final string is " + change3);
	}

	static void q5() {
		Random generator = new Random();
		System.out.println("Please enter R(ock), S(cissor) or P(aper)");
		Scanner scan = new Scanner(System.in);

		String personPlay;
		String personPlay2;

		String computerPlay = "Rock";
		int computerInt = generator.nextInt(3);

		if (computerInt == 0) {
			computerPlay = "Rock";
		} else if (computerInt == 1) {
			computerPlay = "Paper";
		} else if (computerInt == 2) {
			computerPlay = "Scissors";
		}

		personPlay = scan.nextLine();
		personPlay2 = personPlay.toUpperCase();

		System.out.println("The Computer chose: " + computerPlay);

		if (personPlay2.equals("R") && computerInt == 0) {
			System.out.println("It's a tie! You both chose rock!");
		} else if (personPlay2.equals("P") && computerInt == 1) {
			System.out.println("It's a tie! You both chose paper!"); // 3 Ties
		} else if (personPlay2.equals("S") && computerInt == 2) {
			System.out.println("It's a tie! You both chose scissors!");

		} else if (personPlay2.equals("R") && computerInt == 1) {
			System.out.println("You lose! Paper beats rock!");
		} else if (personPlay2.equals("P") && computerInt == 2) {
			System.out.println("You lose! Scissors beats paper!"); // 3 Losses
		} else if (personPlay2.equals("S") && computerInt == 0) {
			System.out.println("You lose! Rock beats scissors!");

		} else if (personPlay2.equals("R") && computerInt == 2) {
			System.out.println("You win! Rock beats scissors!");
		} else if (personPlay2.equals("P") && computerInt == 0) {
			System.out.println("You win! Paper beats rock!"); // 3 Wins
		} else if (personPlay2.equals("S") && computerInt == 1) {
			System.out.println("You win! Scissors beats paper!");
		}
	}
}