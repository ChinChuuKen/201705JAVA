import java.io.*;
class Lesson4
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
		
		System.out.println("���͂��ꂽ1�ڂ̒l��--->"+num1+"�ł��B");
		System.out.println("���͂��ꂽ2�ڂ̒l��--->"+num2+"�ł��B");
		
		System.out.println(num1+"��"+num2+"�̉��Z�l��"+(num1+num2)+"�ł��B");
		System.out.println(num1+"��"+num2+"�̌��Z�l��"+(num1-num2)+"�ł��B");
		System.out.println(num1+"��"+num2+"�̏�Z�l��"+(num1*num2)+"�ł��B");
		System.out.println(num1+"��"+num2+"�̏��Z�l��"+(num1/num2)+"�ł��B");
		System.out.println(num1+"��"+num2+"�̏�]�l��"+(num1%num2)+"�ł��B");
		
	}
}