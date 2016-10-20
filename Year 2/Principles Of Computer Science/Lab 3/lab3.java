package lab3;

import java.util.Scanner;

public class lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		questions q = new questions();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please select a question (1~5):");
		int quest = scan.nextInt();
		switch (quest) {
		case 1:
			q.q1();
			break;
		case 2:
			q.q2();
			break;
		case 3:
			q.q3();
			break;
		case 4:
			q.q4();
			break;
		case 5:
			q.q5();
			break;
		default:
			break;
		}
		scan.close();
	}

}