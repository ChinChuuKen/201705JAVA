import java.io.*;
class Lesson4
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
	
		System.out.println("何か文字列を入力してください。");
		
		String buf = br.readLine();
		
		System.out.println("入力された文字列は"+buf+"です。");
		
	}
}