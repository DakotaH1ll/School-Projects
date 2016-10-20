package Lab5;

import java.util.Scanner;


public class Lab5 {

	public static void main(String[] args) {
		System.out.println("Please enter a number (1~2) to select a question:");
		Scanner scan = new Scanner(System.in);
		questions q = new questions();
		
		int quest = scan.nextInt();
		
		switch(quest)
		{
		case 1: q.q1(); break;
		case 2: q.q2(); break;
		}
	}

}