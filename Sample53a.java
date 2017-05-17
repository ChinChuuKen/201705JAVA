import java.io.*;
class Sample53a
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		if(res%2==0){
			System.out.println("‹ô”‚ª“ü—Í‚³‚ê‚Ü‚µ‚½B");
		}else{
		System.out.println("Šï”‚ª“ü—Í‚³‚ê‚Ü‚µ‚½B");
		}
	}
}
