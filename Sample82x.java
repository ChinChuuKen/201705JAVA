import java.io.*;
class Sample82x
{
	public static void main(String[] args)throws IOException
	{   
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Car car1;
		car1=new Car();
		
		String str1=br.readLine();
		car1.num=Integer.parseInt(str1);
		String str2=br.readLine();
		car1.gas=Double.parseDouble(str2);
		
		System.out.println("車のナンバーは"+car1.num+"です。");
		System.out.println("ガソリン量は"+car1.gas+"です。");
	}
}