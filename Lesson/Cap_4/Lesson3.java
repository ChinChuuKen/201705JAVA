import java.io.*;
class Lesson3
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
		
		System.out.println("3つ目の数値(小数点もok)を入力してください。");
		String buf3 = br.readLine();
		double num3 = Double.parseDouble(buf3);
		
		System.out.println("3つの数の加算値は"+(num1+num2+num3)+"です。");
		System.out.println("3つの数の乗算値は"+(num1*num2*num3)+"です。");
		
	}
}