import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class UnbufCount {

	public static void main(String[] args) throws IOException {

		String f = "";
		if (args.length == 0) {
			f = "dict.txt";
		} else {
			f = args[0];
			for (int i = 1; i < args.length; i++) {
				f += " " + args[i];
			}
		}

		String line;

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
		int eecount = 0;

		InputStream in = new FileInputStream(f);
		Reader input = new InputStreamReader(in, "UTF8");
		Scanner scan = new Scanner(input);

		Date then = new Date();

		while (scan.hasNextLine()) {
			line = scan.nextLine();

			if (line.charAt(line.length() - 1) == 'a'
					|| line.charAt(line.length() - 1) == 'A') {
				acount++;
			} else if (line.charAt(line.length() - 1) == 'b'
					|| line.charAt(line.length() - 1) == 'B') {
				bcount++;
			} else if (line.charAt(line.length() - 1) == 'c'
					|| line.charAt(line.length() - 1) == 'C') {
				ccount++;
			} else if (line.charAt(line.length() - 1) == 'd'
					|| line.charAt(line.length() - 1) == 'D') {
				dcount++;
			} else if (line.charAt(line.length() - 1) == 'e'
					|| line.charAt(line.length() - 1) == 'E') {
				ecount++;
			} else if (line.charAt(line.length() - 1) == 'f'
					|| line.charAt(line.length() - 1) == 'F') {
				fcount++;
			} else if (line.charAt(line.length() - 1) == 'g'
					|| line.charAt(line.length() - 1) == 'G') {
				gcount++;
			} else if (line.charAt(line.length() - 1) == 'h'
					|| line.charAt(line.length() - 1) == 'H') {
				hcount++;
			} else if (line.charAt(line.length() - 1) == 'i'
					|| line.charAt(line.length() - 1) == 'I') {
				icount++;
			} else if (line.charAt(line.length() - 1) == 'j'
					|| line.charAt(line.length() - 1) == 'J') {
				jcount++;
			} else if (line.charAt(line.length() - 1) == 'k'
					|| line.charAt(line.length() - 1) == 'K') {
				kcount++;
			} else if (line.charAt(line.length() - 1) == 'l'
					|| line.charAt(line.length() - 1) == 'L') {
				lcount++;
			} else if (line.charAt(line.length() - 1) == 'm'
					|| line.charAt(line.length() - 1) == 'M') {
				mcount++;
			} else if (line.charAt(line.length() - 1) == 'n'
					|| line.charAt(line.length() - 1) == 'N') {
				ncount++;
			} else if (line.charAt(line.length() - 1) == 'o'
					|| line.charAt(line.length() - 1) == 'O') {
				ocount++;
			} else if (line.charAt(line.length() - 1) == 'p'
					|| line.charAt(line.length() - 1) == 'P') {
				pcount++;
			} else if (line.charAt(line.length() - 1) == 'q'
					|| line.charAt(line.length() - 1) == 'Q') {
				qcount++;
			} else if (line.charAt(line.length() - 1) == 'r'
					|| line.charAt(line.length() - 1) == 'R') {
				rcount++;
			} else if (line.charAt(line.length() - 1) == 's'
					|| line.charAt(line.length() - 1) == 'S') {
				scount++;
			} else if (line.charAt(line.length() - 1) == 't'
					|| line.charAt(line.length() - 1) == 'T') {
				tcount++;
			} else if (line.charAt(line.length() - 1) == 'u'
					|| line.charAt(line.length() - 1) == 'U') {
				ucount++;
			} else if (line.charAt(line.length() - 1) == 'v'
					|| line.charAt(line.length() - 1) == 'V') {
				vcount++;
			} else if (line.charAt(line.length() - 1) == 'w'
					|| line.charAt(line.length() - 1) == 'W') {
				wcount++;
			} else if (line.charAt(line.length() - 1) == 'x'
					|| line.charAt(line.length() - 1) == 'X') {
				xcount++;
			} else if (line.charAt(line.length() - 1) == 'y'
					|| line.charAt(line.length() - 1) == 'Y') {
				ycount++;
			} else if (line.charAt(line.length() - 1) == 'z'
					|| line.charAt(line.length() - 1) == 'Z') {
				zcount++;
			} else if (line.charAt(line.length() - 1) == 'é'
					|| line.charAt(line.length() - 1) == 'É') {
				eecount++;
			}

		}
	}
		System.out.print("Took: ");
		System.out.println((new Date()).getTime() - then.getTime());

		System.out.println("A: " + acount);
		System.out.println("B: " + bcount);
		System.out.println("C: " + ccount);
		System.out.println("D: " + dcount);
		System.out.println("E: " + ecount);
		System.out.println("F: " + fcount);
		System.out.println("G: " + gcount);
		System.out.println("H: " + hcount);
		System.out.println("I: " + icount);
		System.out.println("J: " + jcount);
		System.out.println("K: " + kcount);
		System.out.println("L: " + lcount);
		System.out.println("M: " + mcount);
		System.out.println("N: " + ncount);
		System.out.println("O: " + ocount);
		System.out.println("P: " + pcount);
		System.out.println("Q: " + qcount);
		System.out.println("R: " + rcount);
		System.out.println("S: " + scount);
		System.out.println("T: " + tcount);
		System.out.println("U: " + ucount);
		System.out.println("V: " + vcount);
		System.out.println("W: " + wcount);
		System.out.println("X: " + xcount);
		System.out.println("Y: " + ycount);
		System.out.println("Z: " + zcount);
		System.out.println("é: " + eecount);

		input.close();
		scan.close();
	}
}