import java.io.*;
class Lesson5
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
	
		System.out.println("*** BMI�w��/�W���̏d ***");
		System.out.println("���O����͂��Ă��������B");
		String buf1 = br.readLine();
		
		System.out.println("�g������͂��Ă��������B(�P��:cm)");
		String buf2 = br.readLine();
		double num2 = Double.parseDouble(buf2);
		double num3 = num2/100;
		
		System.out.println("�̏d����͂��Ă��������B(�P��:kg)");
		String buf4 = br.readLine();
		double num4 = Double.parseDouble(buf4);
		
		System.out.println(buf1+"�����BMI�l��"+(num4/(num3*num3))+"�ł��B");
		System.out.println(buf1+"����̕W���̏d��"+((num3*num3)*22)+"�ł��B");
		
	}
}