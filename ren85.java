//import java.io.*;
class MyPoint
{
	int x,y;
	void setX(int px){
		x=px;
		System.out.println("X���W��ݒ肵�܂����B");
	}
	void setY(int py){
		y=py;
		System.out.println("Y���W��ݒ肵�܂����B");
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
class ren85
{
	public static void main(String[] args)
	{
	MyPoint mypoint=new MyPoint();

	mypoint.setX(100);
	mypoint.setY(200);
	
	int c=mypoint.getX();
	int d=mypoint.getY();
	
	System.out.println("X���W��"+c+",Y���W��"+d );
	}
	
 
}		
		