package Exersice;

import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int num;
		do {
			System.out.println("���l����͂��Ă�������");
			str = br.readLine();
			num = Integer.parseInt(str);
			if (num != 9999) {
				System.out.println("���͂������l��" + num + "�ł��B");
			} else {
				break;
			}
		} while (num != 9999);
		System.out.println("�I�����܂�");
	}
}
