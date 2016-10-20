package finalAssignment;

import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class FinalClient {
	public static void main(String[] args) throws UnknownHostException,
			IOException, InterruptedException {
		String f = "FullDict.txt";
		int port = 2020;
		if (args.length == 0) {
			f = "FullDict.txt";
			port = 2020;
		} else {
			f = args[0];

			Pattern portPattern = Pattern.compile("\\d+");
			Matcher portMatcher = portPattern.matcher(args[1]);
			while (portMatcher.find()) {
				port = Integer.valueOf(portMatcher.group());
			}
		}

		Socket commsocket = new Socket("localhost", port);
		FinalServer.function(f);
		commsocket.close();
	}
}
