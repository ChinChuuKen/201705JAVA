import java.io.*;
class Sample69a
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("何番目でループを中止します？");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		int i=1;
		while(true)
		{
			System.out.println(i+"番目の処理です。");
			if(i == res)
			break;
			
		i++;
		}
		
		System.out.println("処理を終わります。");
	}
}
