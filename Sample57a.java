import java.io.*;
class Sample57a
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("あなたは男性せすが？");
		System.out.println("YまたはNを入力してください。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		char res=str.charAt(0);
		
		switch(res)
		{
			case 'Y':
			case 'y':
			System.out.println("あなたは男性ですれ。");
			break;
			//case 'Y':
			//System.out.println("あなたは男性ですれ。");
			//break;
			//case 'y':
			//System.out.println("あなたは男性ですれ。");
			//break;
			case 'N':
			case 'n':
			System.out.println("あなたは女性ですれ。");
			break;
			
			//case 'N':
			//System.out.println("あなたは女性ですれ。");
			//break;
			//case 'n':
			//System.out.println("あなたは女性ですれ。");
			//break;
			//省略可能
			default:
			System.out.println("YまだはNを入力してください。");
			break;
		}
	}
}
