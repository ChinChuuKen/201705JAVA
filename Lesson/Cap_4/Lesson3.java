import java.io.*;
class Lesson3
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
	
		System.out.println("1�ڂ̐��l(�����_��ok)����͂��Ă��������B");
		String buf1 = br.readLine();
		double num1 = Double.parseDouble(buf1);
		
		System.out.println("2�ڂ̐��l(�����_��ok)����͂��Ă��������B");
		String buf2 = br.readLine();
		double num2 = Double.parseDouble(buf2);
		
		System.out.println("3�ڂ̐��l(�����_��ok)����͂��Ă��������B");
		String buf3 = br.readLine();
		double num3 = Double.parseDouble(buf3);
		
		System.out.println("3�̐��̉��Z�l��"+(num1+num2+num3)+"�ł��B");
		System.out.println("3�̐��̏�Z�l��"+(num1*num2*num3)+"�ł��B");
		
	}
}