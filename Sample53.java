import java.io.*;
class Sample53
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("整数を入力してください。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		if(res<=9){
			System.out.println("9以下が入力されました。");
		}else{
		System.out.println("9より大きい値が入力されました。");
		}
	}
}
