package Exercise;

import java.io.*;

class MyPoint {
	int x, y;

	public MyPoint() {
		x = 0;
		y = 0;
	}

	public MyPoint(int px, int py) {
		x = px;
		y = py;
	}

	void setX(int px) {
		x = px;
	}

	void setY(int py) {
		y = py;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}
}

public class Exercise1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("X座標を入力してください(0~100の整数)：");
		String xstr = br.readLine();
		int xnum = Integer.parseInt(xstr);
		MyPoint mypoint = new MyPoint();
		
		if (xnum >= 0 && xnum <= 100) {
			mypoint.setX(xnum);
		}else{
			mypoint.setX(0);
		}
		System.out.println("Y座標を入力してください(0~100の整数)：");
		String ystr = br.readLine();
		int ynum = Integer.parseInt(ystr);
		if (ynum >= 0 && ynum <= 100) {
			mypoint.setY(ynum);
		}else{
			mypoint.setY(0);
		}
		
		int c = mypoint.getX();
		int d = mypoint.getY();

		System.out.println("X座標は" + c + ",Y座標は" + d);
	}
}
