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
		
		System.out.println("�Ԃ̃i���o�[��"+car1.num+"�ł��B");
		System.out.println("�K�\�����ʂ�"+car1.gas+"�ł��B");
	}
}