import java.io.*;
class Uriage
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�������͂�����������");
		
		//input 6 7 8...?
		int i=0;
		int[] sales;
		sales=new int[i];
		for(int i=0;i<sales.length;i++){
			String str=br.readLine();
			int sale=Integer.parseInt(str);
			sales[i]=sale;
			i++;
		}
		//char[4] name ={"����","���","���s","���"};
		//char[] name;//=('����','���','���s','���');
		//name=new char[4];
		//name[0]='tokyou';
		System.out.println("�����\�����܂��B");
		for(int i=0;i<sales.length;i++){
				System.out.println(sales[i]);
		}
	}
		
}
