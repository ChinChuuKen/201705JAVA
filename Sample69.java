import java.io.*;
class Sample69
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("何番目でループを中止します？");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"番目の処理です。");
			if(i == res)
			break;
		}
	}
}
