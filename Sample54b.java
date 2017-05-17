import java.io.*;
class Sample54b
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("整数を入力してください。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		if(res>0 && res<5){
			System.out.println(res+"が入力されました。");
		}else{
			System.out.println("1~4までの値を入力してください。");
		}
	}
}
