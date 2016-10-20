package csci2020u.a1;

import java.util.*;

public class Word2Phone {

	public static void main(String[] args) {
		String s = "";
		if (args.length != 7) {
			System.exit(0);
		} else {
			s = args[0];
			for (int i = 1; i < args.length; i++) {
				s += " " + args[i];
			}
		}

		Word2PhoneMapper mapper = new Word2PhoneMapper();

		List<String> results = new ArrayList<String>();
		results = mapper.map(s);

		for(int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
		}
	}

}