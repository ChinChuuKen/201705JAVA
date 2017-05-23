import java.io.*;
class Lesson4
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
	
		System.out.println("1つ目の数値(小数点もok)を入力してください。");
		String buf1 = br.readLine();
		double num1 = Double.parseDouble(buf1);
		
		System.out.println("2つ目の数値(小数点もok)を入力してください。");
		String buf2 = br.readLine();
		double num2 = Double.parseDouble(buf2);
		
		System.out.println("入力された1つ目の値は--->"+num1+"です。");
		System.out.println("入力された2つ目の値は--->"+num2+"です。");
		
		System.out.println(num1+"と"+num2+"の加算値は"+(num1+num2)+"です。");
		System.out.println(num1+"と"+num2+"の減算値は"+(num1-num2)+"です。");
		System.out.println(num1+"と"+num2+"の乗算値は"+(num1*num2)+"です。");
		System.out.println(num1+"と"+num2+"の除算値は"+(num1/num2)+"です。");
		System.out.println(num1+"と"+num2+"の剰余値は"+(num1%num2)+"です。");
		
	}
}