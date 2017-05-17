import java.io.*;
class Sample105
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("®”‚ğ‚Q‚Â“ü—Í‚µ‚½‚­‚¾‚³‚¢B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.max(num1,num2);
		
			System.out.println(num1+"‚Æ"+num2+"‚Ì‚¤‚¿‘å‚«‚¢‚Ù‚¤‚Í"+ans+"‚Å‚·B");

	}
}