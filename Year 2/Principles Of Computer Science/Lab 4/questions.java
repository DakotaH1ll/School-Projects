package lab4;

import java.util.Scanner;

public class questions {

	void q1() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a string: ");

		String MyString = scan.nextLine();
		char[] letters = new char[MyString.length()];

		for (int i = 0; i < MyString.length(); i++) {
			letters[i] = MyString.charAt(i);
		}

		System.out.println("Backwards: ");
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);
		}

		System.out.println("");
		System.out.println("Switched Case: ");

		for (int i = 0; i < MyString.length(); i++) {
			char currchar;
			char inputchar;

			if (Character.isUpperCase(MyString.charAt(i))) {
				currchar = MyString.charAt(i);
				inputchar = Character.toLowerCase(currchar);
			} else {
				currchar = MyString.charAt(i);
				inputchar = Character.toUpperCase(currchar);
			}
		System.out.print(inputchar);
		}
	}

	void q2() {
		Student s1_1 = new Student("Tom", "Oshawa", "Computer Science");
		Student s1_2 = new Student("Tom", "Oshawa", "Computer Science");

		Student s2_1 = new Student("Jean", "Toronto", "Chemistry");
		Student s2_2 = new Student("Jean", "Toronto");

		Student s3_1 = new Student("Tom", "Toronto");
		Student s3_2 = new Student("Tom", "Oshawa");

		Student s4_1 = new Student("Kate", "Whitby");
		Student s4_2 = new Student("Tom", "Whitby");

		
		 System.out.println(s1_1.compareTo(s1_2));
		 System.out.println(s2_1.compareTo(s2_2));
		 System.out.println(s3_1.compareTo(s3_2));
		 System.out.println(s4_1.compareTo(s4_2));
		 
	}
}