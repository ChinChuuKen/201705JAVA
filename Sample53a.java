import java.io.*;
class Sample53a
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("整数を入力してください。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		if(res%2==0){
			System.out.println("偶数が入力されました。");
		}else{
		System.out.println("奇数が入力されました。");
		}
	}
}
