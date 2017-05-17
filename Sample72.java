import java.io.*;
class Sample72
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("テスト受験者の数を入力してください。");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		
		int[] test;
		test=new int[num];
		
		System.out.println("人数の点数を入力してください。");
		
		for(int i=0;i<num;i++){
			str=br.readLine();
			int tem=Integer.parseInt(str);
			test[i]=tem;
		}
		for(int i=0;i<num;i++){
			System.out.println((i+1)+"番目の人の点数は"+test[i]+"です。");
		}
	}
}