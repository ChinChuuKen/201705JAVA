package Exersice;

import java.io.*;

class MyPoint
{
	int x,y;
	void setX(int px){
		x=px;
		//System.out.println("X���W��ݒ肵�܂����B");
	}
	void setY(int py){
		y=py;
		//System.out.println("Y���W��ݒ肵�܂����B");
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
	System.out.println("X���W����͂��Ă��������F");
	String xstr=br.readLine();
	int xnum=Integer.parseInt(xstr);
	
	System.out.println("Y���W����͂��Ă��������F");
	String ystr=br.readLine();
	int ynum=Integer.parseInt(ystr);
	
	MyPoint mypoint=new MyPoint();
	mypoint.setX(xnum);
	mypoint.setY(ynum);
	
	int c=mypoint.getX();
	int d=mypoint.getY();
	
	System.out.println("X���W��"+c+",Y���W��"+d );
	}
}
