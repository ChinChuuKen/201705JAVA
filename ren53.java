import java.io.*;
class ren53
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("2�̐�������͂��Ă��������B");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String str2=br.readLine();
		
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		
		if(a>b){
		    System.out.println(b+"���"+a+"�̂ق����傫���l�ł��B");	
		}else if(a<b)
		{
			System.out.println(a+"���"+b+"�̂ق����傫���l�ł��B");	
		}else
		{
			System.out.println("2�̐��͓����l�ł��B");	
			
		}
	}
}
