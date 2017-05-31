package Exersice;

import java.io.*;

class MyPoint
{
	int x,y;
	void setX(int px){
		x=px;
		//System.out.println("X座標を設定しました。");
	}
	void setY(int py){
		y=py;
		//System.out.println("Y座標を設定しました。");
	}
	
	int getX(){
		//System.out.println();
		return x;
	}
	int getY(){
		//System.out.println();
		return y;
	}
}

public class Exersice1 {
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("X座標を入力してください：");
	String xstr=br.readLine();
	int xnum=Integer.parseInt(xstr);
	
	System.out.println("Y座標を入力してください：");
	String ystr=br.readLine();
	int ynum=Integer.parseInt(ystr);
	
	MyPoint mypoint=new MyPoint();
	mypoint.setX(xnum);
	mypoint.setY(ynum);
	
	int c=mypoint.getX();
	int d=mypoint.getY();
	
	System.out.println("X座標は"+c+",Y座標は"+d );
	}
}
