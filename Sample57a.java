import java.io.*;
class Sample57a
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("���Ȃ��͒j���������H");
		System.out.println("Y�܂���N����͂��Ă��������B");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		char res=str.charAt(0);
		
		switch(res)
		{
			case 'Y':
			case 'y':
			System.out.println("���Ȃ��͒j���ł���B");
			break;
			//case 'Y':
			//System.out.println("���Ȃ��͒j���ł���B");
			//break;
			//case 'y':
			//System.out.println("���Ȃ��͒j���ł���B");
			//break;
			case 'N':
			case 'n':
			System.out.println("���Ȃ��͏����ł���B");
			break;
			
			//case 'N':
			//System.out.println("���Ȃ��͏����ł���B");
			//break;
			//case 'n':
			//System.out.println("���Ȃ��͏����ł���B");
			//break;
			//�ȗ��\
			default:
			System.out.println("Y�܂���N����͂��Ă��������B");
			break;
		}
	}
}
