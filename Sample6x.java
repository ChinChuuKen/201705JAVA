import java.io.*;
class Sample6x
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("���Ԗڂ̏������΂��܂����H(1~10)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		int res1=Integer.parseInt(str1);
		String str2=br.readLine();
		int res2=Integer.parseInt(str2);
		//my method
		for(int i=1;i<=10;i++)
		{	
			if(res1==res2){
					System.out.println("�����l����͂��Ă��܂����B");
					break;
				}
			else if(i == res1||i == res2)
				continue;
			System.out.println(i+"�Ԗڂ̏����ł��B");
		}
		//techer's method
		if(res1==res2){
			System.out.println("�����l����͂��Ă��܂����B");
		}else{
			for(int i=1;i<=10;i++){	
			if(i == res1||i == res2)
				continue;
			System.out.println(i+"�Ԗڂ̏����ł��B");
			}
		}
		
	}
}
	
