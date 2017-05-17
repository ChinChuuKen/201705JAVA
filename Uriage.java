import java.io.*;
class Uriage
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("”„ã‚ğ“ü—Í‚µ‚½‚­‚¾‚³‚¢");
		
		//input 6 7 8...?
		int i=0;
		int[] sales;
		sales=new int[i];
		for(int i=0;i<sales.length;i++){
			String str=br.readLine();
			int sale=Integer.parseInt(str);
			sales[i]=sale;
			i++;
		}
		//char[4] name ={"“Œ‹","‘åã","‹“s","ã–ì"};
		//char[] name;//=('“Œ‹','‘åã','‹“s','ã–ì');
		//name=new char[4];
		//name[0]='tokyou';
		System.out.println("”„ã‚ğ•\¦‚µ‚Ü‚·B");
		for(int i=0;i<sales.length;i++){
				System.out.println(sales[i]);
		}
	}
		
}
