import java.io.*;
class Sample65a
{
	public static void main(String[] args)throws IOException
	{
		int i=1;
		do{
			System.out.println(i+"番目の繰り返しです。");
			i++;
		}while(i<=5);
		System.out.println("繰り返しが終わりました。");
	}
}
