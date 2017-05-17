import java.io.*;
class Sample36
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("整数を2つ入力してください。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		
		int num1=Integer.parseInt(str1);
		
		int num2=Integer.parseInt(str2);
		//int num1=Integer.parseInt(br.readLine());
		//int num2=Integer.parseInt(br.readLine());
		
		int num3=num1+num2;
		
		System.out.println("最初に"+num1+"が入力されました。");
		System.out.println("次に"+num2+"が入力されました。");
		System.out.println("二つ合計値の"+(num1+num2)+"です。");
		System.out.println("二つ合計値の"+num3+"です。");
	}
}