package Exersice;

import java.io.*;

public class Exersice5 {
	public static void main(String[] args) throws IOException {
		int num = 0;
		while (num != 9999) {
			System.out.println("���l����͂��Ă�������");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			num = Integer.parseInt(str);
			System.out.println("���͂���������" + num + "�ł��B");
			if (num == 9999) {
				System.out.println("�I�����܂�");
				break;
			}
		}
	}
}
