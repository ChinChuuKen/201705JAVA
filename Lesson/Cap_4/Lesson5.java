import java.io.*;
class Lesson5
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
	
		System.out.println("*** BMI指数/標準体重 ***");
		System.out.println("名前を入力してください。");
		String buf1 = br.readLine();
		
		System.out.println("身長を入力してください。(単位:cm)");
		String buf2 = br.readLine();
		double num2 = Double.parseDouble(buf2);
		double num3 = num2/100;
		
		System.out.println("体重を入力してください。(単位:kg)");
		String buf4 = br.readLine();
		double num4 = Double.parseDouble(buf4);
		
		System.out.println(buf1+"さんのBMI値は"+(num4/(num3*num3))+"です。");
		System.out.println(buf1+"さんの標準体重は"+((num3*num3)*22)+"です。");
		
	}
}