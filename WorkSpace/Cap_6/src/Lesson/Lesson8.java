package Lesson;

import java.io.*;

public class Lesson8 {
	public static void main(String[] args) throws IOException {
		int num = -1;
		int sum = 0;
		int count = 0;
		double ave;
		while (num != 0) {
			System.out.println("���l����͂��Ă�������");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			num = Integer.parseInt(str);
			sum += num;
			count++;
		}
		// if (num == 0) {
		// ave = (double) sum / (count - 1);
		// System.out.println("���͒l���v:" + sum);
		// System.out.println("���͒l����:" + ave);
		// System.out.println("���͉�:" + (count - 1));
		// }
		if (count == 1) {
			System.out.println("���͂��Ă܂���");
		} else {
			ave = (double) sum / (count - 1);
			System.out.println("���͒l���v:" + sum);
			System.out.println("���͒l����:" + ave);
			System.out.println("���͉�:" + (count - 1));
		}
	}
}
