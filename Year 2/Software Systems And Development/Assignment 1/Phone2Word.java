package csci2020u.a1;

import csci2020u.a1.helper.Dictionary;
import java.util.*;

public class Phone2Word {

	public static void main(String[] args) {

		String target = "";
		if (args.length != 7) {
			target = "--";
		} else {
			target = args[0];
			for (int i = 1; i < args.length; i++) {
				target += " " + args[i];
			}
		}

		Dictionary dict = new Dictionary();

		for (int y = 0; y < 7; y++) {
			for (int i = 0; i < dict.size() - 1; i++) {
				String currWord = dict.get(i);

				if (target.charAt(y) == '2' && currWord.charAt(y) != 'a'
						|| currWord.charAt(y) != 'b'
						|| currWord.charAt(y) != 'c') {
					dict.remove(currWord);
				}

				else if (target.charAt(y) == '3' && currWord.charAt(y) != 'd'
						|| currWord.charAt(y) != 'e'
						|| currWord.charAt(y) != 'f') {
					dict.remove(currWord);
				}

				else if (target.charAt(y) == '4') {
					if (currWord.charAt(y) != 'g' || currWord.charAt(y) != 'h'
							|| currWord.charAt(y) != 'i') {
						dict.remove(currWord);
					}
				}

				else if (target.charAt(y) == '5' && currWord.charAt(y) != 'j'
						|| currWord.charAt(y) != 'k'
						|| currWord.charAt(y) != 'l') {
					dict.remove(currWord);
				}

				else if (target.charAt(y) == '6' && currWord.charAt(y) != 'm'
						|| currWord.charAt(y) != 'n'
						|| currWord.charAt(y) != 'o') {
					dict.remove(currWord);
				}

				else if (target.charAt(y) == '7' && currWord.charAt(y) != 'p'
						|| currWord.charAt(y) != 'q'
						|| currWord.charAt(y) != 'r'
						|| currWord.charAt(y) != 's') {
					dict.remove(currWord);
				}

				else if (target.charAt(y) == '8' && currWord.charAt(y) != 't'
						|| currWord.charAt(y) != 'u'
						|| currWord.charAt(y) != 'v') {
					dict.remove(i);
				}

				else if (target.charAt(y) == '9' && currWord.charAt(y) != 'w'
						|| currWord.charAt(y) != 'x'
						|| currWord.charAt(y) != 'y'
						|| currWord.charAt(y) != 'z') {
					dict.remove(currWord);
				}

			}

		}

		for (int q = 0; q < dict.size(); q++) {
			System.out.println(dict.get(q));
		}

	}
}
