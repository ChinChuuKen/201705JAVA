import java.io.*;
class Sample141x
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		try{
			int[] test;
			test = new int[5];
			System.out.println("test[4]�ɒl�������܂��B");
			
			test[4] = num;
			//test[10] = 10;
			System.out.println("test[4]��"+num+"�������܂����B");
		}
		//catch(ArrayIndexOutOfBoundsException a){
		//	System.out.println("�z��̗v�f�����������܂�1�B");
			//System.out.println(e);
		//}
		catch(NumberFormatException e){
			System.out.println("�z��̗v�f�����������܂��B");
			//System.out.println(e);
		}
		finally{
			System.out.println("�Ō�ɕK�����̏��������܂��B");
		}
		System.out.println("�����I�����܂����B");
		
	}
}