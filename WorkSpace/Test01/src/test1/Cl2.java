package test1;

import java.io.*;

public class Cl2 {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字を入力してください：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sel = br.readLine();
		System.out.println("入力した文字は" + sel + "です。");
	}
}
