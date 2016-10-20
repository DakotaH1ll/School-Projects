package lab3;

import java.util.Scanner;

public class questions {
	void q1() {

		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		int[][] matrix2 = new int[3][3];

		System.out.println("Please enter 9 integers: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = scan.nextInt();

			}

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix2[j][i] = matrix[i][j];

			}

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("TRANSPOSE!");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}

		scan.close();
	}

	void q2() {
		Person p1 = new Person("Tim", "Hortons", 23);
		Person p2 = new Person("Jean", "Hortons", 24);
		Person p3 = new Person("Tim", "Hortons", 23);

		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}

	void q3() {
		// Dog dog = new Dog("Spike");
		Dog L_dog = new Labrador("Tim", "Yellow");
		Dog Y_dog = new Yorkshire("Joe");
		System.out.println(L_dog.getName() + " says " + L_dog.speak()
				+ ", weight is: " + L_dog.avgBreedWeight());
		System.out.println(Y_dog.getName() + " says " + Y_dog.speak()
				+ ", weight is: " + Y_dog.avgBreedWeight());
	}

	void q4() {
		// uncomment the following code block, complete it to finish its
		// function

		Dog myDog;
		// Give a correct class to define myDog

		String ans = "y";
		int choice;
		Scanner scan = new Scanner(System.in);
		while (ans.equalsIgnoreCase("y")) {
			System.out.println("Choose a Breed:\n1. Labrador\n2. Yorkshire");
			choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("I am Labrador, give me a name and color: ");
				String name = scan.nextLine();
				String color = scan.nextLine();
				myDog = new Labrador(name, color);

				// Select a correct dog class to make a instance
			} else {
				System.out.println("I am Yorshire, give me a name: ");
				String name = scan.nextLine();
				myDog = new Yorkshire(name);
			}
		}

	}

	void q5() {

		Shape squ;
		Shape rect;

		double side, length, width;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the side for the square: ");
		side = scan.nextDouble();

		squ = new Square(side);

		System.out.println("Please enter the length for the rectangle: ");
		length = scan.nextDouble();

		System.out.println("Please enter the width for the rectangle: ");
		width = scan.nextDouble();

		rect = new Rectangle(length, width);

		System.out.println("This is " + squ.shapeName + " with an area of "
				+ squ.getArea());
		System.out.println("This is " + rect.shapeName + " with an area of "
				+ rect.getArea());

	}
}
