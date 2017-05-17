import java.io.*;
class Sample57
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("あなたは男性せすが？");
		System.out.println("YまたはNを入力してください。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		char res=str.charAt(0);
		
		if(res=='Y'|| res=='y'){
			System.out.println("あなたは男性ですれ。");
		}
		else if(res=='N'|| res=='n'){
			System.out.println("あなたは女性ですれ。");
		}
		else
		{
			System.out.println("YまだはNを入力してください。");
		}
	}
}
