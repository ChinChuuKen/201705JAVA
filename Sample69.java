import java.io.*;
class Sample69
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("���ԖڂŃ��[�v�𒆎~���܂��H");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"�Ԗڂ̏����ł��B");
			if(i == res)
			break;
		}
	}
}
