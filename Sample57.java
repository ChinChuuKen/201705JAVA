import java.io.*;
class Sample57
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("���Ȃ��͒j���������H");
		System.out.println("Y�܂���N����͂��Ă��������B");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		char res=str.charAt(0);
		
		if(res=='Y'|| res=='y'){
			System.out.println("���Ȃ��͒j���ł���B");
		}
		else if(res=='N'|| res=='n'){
			System.out.println("���Ȃ��͏����ł���B");
		}
		else
		{
			System.out.println("Y�܂���N����͂��Ă��������B");
		}
	}
}
