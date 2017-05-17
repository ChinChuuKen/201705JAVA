import java.io.*;
class Sample611
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("‰½”Ô–Ú‚Ìˆ—‚ğ”ò‚Î‚µ‚Ü‚·‚©H(1~10)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		for(int i=1;i<=10;i++)
		{
			if(i == res)
				continue;
			System.out.println(i+"”Ô–Ú‚Ìˆ—‚Å‚·B");
			
		}
	}
}
