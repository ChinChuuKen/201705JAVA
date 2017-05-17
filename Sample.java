import java.io.*;
class Sample36
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("”‚ğ2‚Â“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
		System.out.printLn("Å‚É"+num1+"‚ª“ü—Í‚³‚ê‚Ü‚µ‚½B");
		System.out.printLn("Ÿ‚É"+num2+"‚ª“ü—Í‚³‚ê‚Ü‚µ‚½B");
	}
}