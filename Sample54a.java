import java.io.*;
class Sample54a
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("整数を入力してください。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		if(res==1||res==2){
			System.out.println(res+"が入力されました。");
		}else{
			System.out.println("1か2を入力してください。");
		}
	}
}
