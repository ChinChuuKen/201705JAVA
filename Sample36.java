import java.io.*;
class Sample36
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("������2���͂��Ă��������B");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		
		int num1=Integer.parseInt(str1);
		
		int num2=Integer.parseInt(str2);
		//int num1=Integer.parseInt(br.readLine());
		//int num2=Integer.parseInt(br.readLine());
		
		int num3=num1+num2;
		
		System.out.println("�ŏ���"+num1+"�����͂���܂����B");
		System.out.println("����"+num2+"�����͂���܂����B");
		System.out.println("����v�l��"+(num1+num2)+"�ł��B");
		System.out.println("����v�l��"+num3+"�ł��B");
	}
}