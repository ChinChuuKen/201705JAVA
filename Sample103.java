import java.io.*;
class Sample103
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("���������͂������������B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("��������͂������������B");
		
		String str2 = br.readLine();
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch);
		
		if(num != -1)
			System.out.println(str1+"��"+(num+1)+"�ԖڂɁu"+ch+"�v���݂���܂����B");
		else
			System.out.println(str1+"�Ɂu"+ch+"�v�͂���܂���B");
	}
}