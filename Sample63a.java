import java.io.*;
class Sample63a
{
	public static void main(String[] args)throws IOException
	{
		//System.out.println("������*����͂��܂����H");
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String str=br.readLine();
		//int num=Integer.parseInt(str);
		int i;
		for(i=1;i<=20;i++)
		{
			if(i%2==0)
			System.out.print("��");
			else
			System.out.print("��");
		}
		System.out.println("�S����"+i+"����s���܂����B");
	}
}
