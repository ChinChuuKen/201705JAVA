package Exersice;

import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int num;
		do {
			System.out.println("数値を入力してください");
			str = br.readLine();
			num = Integer.parseInt(str);
			if (num != 9999) {
				System.out.println("入力した数値は" + num + "です。");
			} else {
				break;
			}
		} while (num != 9999);
		System.out.println("終了します");
	}
}
