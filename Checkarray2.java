import java.io.*;
class Checkarray2
{
	public static void main(String[] args) throws IOException
	{
		//System.out.println("テスト受験者の数を入力してください。");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//String str=br.readLine();
		//int num=Integer.parseInt(str);
		
		int[] test;
		test=new int[5];
		
		System.out.println("人数の点数を入力してください。");
		String str;
		for(int i=0;i<5;i++){
			str=br.readLine();
			int tem=Integer.parseInt(str);
			test[i]=tem;
		}
		for(int i=0;i<5;i++){
			if(test[i]>=80){
				System.out.println((i+1)+"番目の人の点数は"+test[i]+"です。80以上です。");
			}else 
				System.out.println((i+1)+"番目の人の点数は"+test[i]+"です。80未満です。");
		}
	}
}