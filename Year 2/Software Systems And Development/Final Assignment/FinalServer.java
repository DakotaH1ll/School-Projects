package finalAssignment;

import java.awt.BorderLayout;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

class firstHalf extends Thread {
	String filename;
	static ArrayList<Integer> firstHalf = new ArrayList<Integer>();

	public firstHalf(String file) {
		this.filename = file;
	}
	@Override
	public void run() {
		int acount = 0;
		int bcount = 0;
		int ccount = 0;
		int dcount = 0;
		int ecount = 0;
		int fcount = 0;
		int gcount = 0;
		int hcount = 0;
		int icount = 0;
		int jcount = 0;
		int kcount = 0;
		int lcount = 0;
		int mcount = 0;

		InputStream in = null;
		try {
			in = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Reader input = null;
		try {
			input = new InputStreamReader(in, "UTF8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Scanner scan = new Scanner(input);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			if (line.charAt(0) == 'a' || line.charAt(0) == 'A') {
				acount++;
			} else if (line.charAt(0) == 'b' || line.charAt(0) == 'B') {
				bcount++;
			} else if (line.charAt(0) == 'c' || line.charAt(0) == 'C') {
				ccount++;
			} else if (line.charAt(0) == 'd' || line.charAt(0) == 'D') {
				dcount++;
			} else if (line.charAt(0) == 'e' || line.charAt(0) == 'E') {
				ecount++;
			} else if (line.charAt(0) == 'f' || line.charAt(0) == 'F') {
				fcount++;
			} else if (line.charAt(0) == 'g' || line.charAt(0) == 'G') {
				gcount++;
			} else if (line.charAt(0) == 'h' || line.charAt(0) == 'H') {
				hcount++;
			} else if (line.charAt(0) == 'i' || line.charAt(0) == 'I') {
				icount++;
			} else if (line.charAt(0) == 'j' || line.charAt(0) == 'J') {
				jcount++;
			} else if (line.charAt(0) == 'k' || line.charAt(0) == 'K') {
				kcount++;
			} else if (line.charAt(0) == 'l' || line.charAt(0) == 'L') {
				lcount++;
			} else if (line.charAt(0) == 'm' || line.charAt(0) == 'M') {
				mcount++;
			}
		}

		firstHalf.add(acount);
		firstHalf.add(bcount);
		firstHalf.add(ccount);
		firstHalf.add(dcount);
		firstHalf.add(ecount);
		firstHalf.add(fcount);
		firstHalf.add(gcount);
		firstHalf.add(hcount);
		firstHalf.add(icount);
		firstHalf.add(jcount);
		firstHalf.add(kcount);
		firstHalf.add(lcount);
		firstHalf.add(mcount);

	}

	public static ArrayList<Integer> passArray() {
		return firstHalf;
	}

}

class secondHalf extends Thread {
	String filename;
	static ArrayList<Integer> secondHalf = new ArrayList<Integer>();

	public secondHalf(String file) {
		this.filename = file;
	}
	@Override
	public void run() {
		int ncount = 0;
		int ocount = 0;
		int pcount = 0;
		int qcount = 0;
		int rcount = 0;
		int scount = 0;
		int tcount = 0;
		int ucount = 0;
		int vcount = 0;
		int wcount = 0;
		int xcount = 0;
		int ycount = 0;
		int zcount = 0;

		InputStream in = null;
		try {
			in = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Reader input = null;
		try {
			input = new InputStreamReader(in, "UTF8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Scanner scan = new Scanner(input);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();

			if (line.charAt(0) == 'n' || line.charAt(0) == 'N') {
				ncount++;
			} else if (line.charAt(0) == 'o' || line.charAt(0) == 'O') {
				ocount++;
			} else if (line.charAt(0) == 'p' || line.charAt(0) == 'P') {
				pcount++;
			} else if (line.charAt(0) == 'q' || line.charAt(0) == 'Q') {
				qcount++;
			} else if (line.charAt(0) == 'r' || line.charAt(0) == 'R') {
				rcount++;
			} else if (line.charAt(0) == 's' || line.charAt(0) == 'S') {
				scount++;
			} else if (line.charAt(0) == 't' || line.charAt(0) == 'T') {
				tcount++;
			} else if (line.charAt(0) == 'u' || line.charAt(0) == 'U') {
				ucount++;
			} else if (line.charAt(0) == 'v' || line.charAt(0) == 'V') {
				vcount++;
			} else if (line.charAt(0) == 'w' || line.charAt(0) == 'W') {
				wcount++;
			} else if (line.charAt(0) == 'x' || line.charAt(0) == 'X') {
				xcount++;
			} else if (line.charAt(0) == 'y' || line.charAt(0) == 'Y') {
				ycount++;
			} else if (line.charAt(0) == 'z' || line.charAt(0) == 'Z') {
				zcount++;
			}
		}

		secondHalf.add(ncount);
		secondHalf.add(ocount);
		secondHalf.add(pcount);
		secondHalf.add(qcount);
		secondHalf.add(rcount);
		secondHalf.add(scount);
		secondHalf.add(tcount);
		secondHalf.add(ucount);
		secondHalf.add(vcount);
		secondHalf.add(wcount);
		secondHalf.add(xcount);
		secondHalf.add(ycount);
		secondHalf.add(zcount);

	}

	public static ArrayList<Integer> passArray() {
		return secondHalf;
	}
}

public class FinalServer {

	public static void function(String file) throws IOException,
			InterruptedException {
		Thread part1 = new firstHalf(file);
		Thread part2 = new secondHalf(file);

		part1.start();
		part2.start();
		part1.join();
		part2.join();

		ArrayList<Integer> occurences = firstHalf.passArray();
		ArrayList<Integer> NtoZ = secondHalf.passArray();
		occurences.addAll(NtoZ);

		JFrame frame = new JFrame("Occurrences");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("<html>A: " + occurences.get(0) + "<br>B: "
				+ occurences.get(1) + "<br>C: " + occurences.get(2) + "<br>D: "
				+ occurences.get(3) + "<br>E: " + occurences.get(4) + "<br>F: "
				+ occurences.get(5) + "<br>G: " + occurences.get(6) + "<br>H: "
				+ occurences.get(7) + "<br>I: " + occurences.get(8) + "<br>J: "
				+ occurences.get(9) + "<br>K: " + occurences.get(10)
				+ "<br>L: " + occurences.get(11) + "<br>M: "
				+ occurences.get(12) + "<br>N: " + occurences.get(13)
				+ "<br>O: " + occurences.get(14) + "<br>P: "
				+ occurences.get(15) + "<br>Q: " + occurences.get(16)
				+ "<br>R: " + occurences.get(17) + "<br>S: "
				+ occurences.get(18) + "<br>T: " + occurences.get(19)
				+ "<br>U: " + occurences.get(20) + "<br>V: "
				+ occurences.get(21) + "<br>W: " + occurences.get(22)
				+ "<br>X: " + occurences.get(23) + "<br>Y: "
				+ occurences.get(24) + "<br>Z: " + occurences.get(25)
				+ "</html");

		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) throws IOException {
		int port = 2020;
		if (args.length == 0) {
			port = 2020;
		} else {
			Pattern portPattern = Pattern.compile("\\d+");
			Matcher portMatcher = portPattern.matcher(args[0]);
			while (portMatcher.find()) {
				port = Integer.valueOf(portMatcher.group());
			}
		}
		ServerSocket serversocket = null;
		boolean started = false;
		while (!started) {
			try {
				serversocket = new ServerSocket(port);
				started = true;
			} catch (IOException e) {
				System.out.println("There was an error, please try again!");
				System.exit(0);
			}
		}
		System.out.println("Server started at port " + port);
		while (true) {
			try {
				Socket commsocket = serversocket.accept();
				System.out.println("Connected...");
				PrintWriter writer = new PrintWriter(
						commsocket.getOutputStream());
				writer.println("Hello from Java");
				writer.flush();
				commsocket.close();
			} catch (IOException e) {
				System.out.println("error on connection, " + e);
			}
		}
	}
}