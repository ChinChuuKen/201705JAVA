package Lesson;

import java.io.*;

public class Lesson8 {
	public static void main(String[] args) throws IOException {
		int num = -1;
		int sum = 0;
		int count = 0;
		double ave;
		while (num != 0) {
			System.out.println("数値を入力してください");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			num = Integer.parseInt(str);
			sum += num;
			count++;
		}
		// if (num == 0) {
		// ave = (double) sum / (count - 1);
		// System.out.println("入力値合計:" + sum);
		// System.out.println("入力値平均:" + ave);
		// System.out.println("入力回数:" + (count - 1));
		// }
		if (count == 1) {
			System.out.println("入力してません");
		} else {
			ave = (double) sum / (count - 1);
			System.out.println("入力値合計:" + sum);
			System.out.println("入力値平均:" + ave);
			System.out.println("入力回数:" + (count - 1));
		}
	}
}
