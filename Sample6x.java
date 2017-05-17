import java.io.*;
class Sample6x
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("何番目の処理を飛ばしますか？(1~10)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		int res1=Integer.parseInt(str1);
		String str2=br.readLine();
		int res2=Integer.parseInt(str2);
		//my method
		for(int i=1;i<=10;i++)
		{	
			if(res1==res2){
					System.out.println("同じ値を入力していますす。");
					break;
				}
			else if(i == res1||i == res2)
				continue;
			System.out.println(i+"番目の処理です。");
		}
		//techer's method
		if(res1==res2){
			System.out.println("同じ値を入力していますす。");
		}else{
			for(int i=1;i<=10;i++){	
			if(i == res1||i == res2)
				continue;
			System.out.println(i+"番目の処理です。");
			}
		}
		
	}
}
	
