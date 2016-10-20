package Lab5;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class questions {

	void q1() {
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);

		// get word from user
		System.out.print("Enter a single word(letters only, please)");
		String word = scan.nextLine();

		// convert to all upper case
		word = word.toUpperCase();

		// count frequency of each letter in string
		try {
			for (int i = 0; i < word.length(); i++)

			{
				counts[word.charAt(i) - 'A']++;
			}

		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("That is not a letter!");
		}
		// print frequencies
		System.out.println();
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				System.out.println((char) (i + 'A') + ":" + counts[i]);
			}
		}
	}

	void q2() {
		int creditHrs; // number of semester hours earned
		double qualityPts; // number of quality points earned
		double gpa; // grade point (quality point) average

		String line, name, inputName = "students.txt";
		String outputName = "warning.txt";

		try {
			Scanner scan = new Scanner(inputName);
			FileWriter write = new FileWriter(outputName, true);
			
			PrintWriter outfile = new PrintWriter(write);
			
			// Print a header to the output file
			outfile.println();
			outfile.println("Student on Academic Warning");
			outfile.println();

			// Process the input file, one token at a time
			while (scan.hasNextLine()) {

				line = scan.nextLine();
				Scanner lineBreaker = new Scanner(line);

				name = lineBreaker.next();
				creditHrs = lineBreaker.nextInt();
				qualityPts = lineBreaker.nextDouble();

				gpa = qualityPts / creditHrs;

				if (creditHrs < 30 && gpa < 1.5) {
					outfile.println(name + " " + creditHrs + " " + gpa);
				} else if (creditHrs < 60 && gpa < 1.75) {
					outfile.println(name + " " + creditHrs + " " + gpa);
				} else if (gpa < 2) {
					outfile.println(name + " " + creditHrs + " " + gpa);
				}

			}
			scan.close();
			outfile.close();
		}

		catch (UnsupportedEncodingException a) {
			System.out.println("The encoding type is unsupported");

		} catch (FileNotFoundException a) {
			System.out
					.println("The file could not be opened, because it cannot be found");
		} catch (NumberFormatException a) {
			System.out.println("The numbers are in an incorrect format");
		} catch (IOException a) {
			System.out
					.println("Something went wrong with the input or the output");
		} catch (Exception b) {
			System.out.println("Something else went wrong!");
		}

	}
}
