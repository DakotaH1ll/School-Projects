package csci2020u.a1;

import java.util.*;

class Word2PhoneMapper implements IWord2Phone {

	public List<String> map(String word) {

		List<String> numList = new ArrayList<String>();

		char[] temp = new char[7];

		for (int i = 0; i < 7; i++) {
			char curr = word.charAt(i);
			if (curr == 'a' || curr == 'b' || curr == 'c') {
				temp[i] = '2';
			} else if (curr == 'd' || curr == 'e' || curr == 'f') {
				temp[i] = '3';
			} else if (curr == 'g' || curr == 'h' || curr == 'i') {
				temp[i] = '4';
			} else if (curr == 'j' || curr == 'k' || curr == 'l') {
				temp[i] = '5';
			} else if (curr == 'm' || curr == 'n' || curr == 'o') {
				temp[i] = '6';
			} else if (curr == 'p' || curr == 'q' || curr == 'r' || curr == 's') {
				temp[i] = '7';
			} else if (curr == 't' || curr == 'u' || curr == 'v') {
				temp[i] = '8';
			} else if (curr == 'w' || curr == 'x' || curr == 'y' || curr == 'z') {
				temp[i] = '9';
			} else {
				System.exit(1);
			}

		}
		
		String number = new String(temp);
		
		numList.add(number);
		return numList;
	}
	
}