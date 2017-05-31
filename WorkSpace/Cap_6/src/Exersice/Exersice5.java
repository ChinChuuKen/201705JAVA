package Exersice;

import java.io.*;

public class Exersice5 {
	public static void main(String[] args) throws IOException {
		int num = 0;
		while (num != 9999) {
			System.out.println("”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			num = Integer.parseInt(str);
			System.out.println("“ü—Í‚µ‚½•¶š‚Í" + num + "‚Å‚·B");
			if (num == 9999) {
				System.out.println("I—¹‚µ‚Ü‚·");
				break;
			}
		}
	}
}
