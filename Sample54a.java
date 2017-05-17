import java.io.*;
class Sample54a
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		if(res==1||res==2){
			System.out.println(res+"‚ª“ü—Í‚³‚ê‚Ü‚µ‚½B");
		}else{
			System.out.println("1‚©2‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		}
	}
}
