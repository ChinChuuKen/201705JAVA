package Exersice;

import java.io.*;

public class Exersice5 {
	public static void main(String[] args) throws IOException {
		int num = 0;
		while (num != 9999) {
			System.out.println("数値を入力してください");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			num = Integer.parseInt(str);
			System.out.println("入力した文字は" + num + "です。");
			if (num == 9999) {
				System.out.println("終了します");
				break;
			}
		}
	}
}
