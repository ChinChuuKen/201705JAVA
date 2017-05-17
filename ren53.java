import java.io.*;
class ren53
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("2つの整数を入力してください。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String str2=br.readLine();
		
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		
		if(a>b){
		    System.out.println(b+"より"+a+"のほうが大きい値です。");	
		}else if(a<b)
		{
			System.out.println(a+"より"+b+"のほうが大きい値です。");	
		}else
		{
			System.out.println("2つの数は同じ値です。");	
			
		}
	}
}
