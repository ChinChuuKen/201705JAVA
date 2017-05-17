import java.io.*;
class Checkarray2x
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("値を入力したください");
		System.out.println("値を入力したください");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int checkval=Integer.parseInt(str);
		
		int[] test={80,75,50,90,20};
		
		//System.out.println("人数の点数を入力してください。");
		//String str;
		for(int i=0;i<5;i++){
			if(test[i]>=checkval){
				System.out.println((i+1)+"番目の人の点数は"+test[i]+"です。"+checkval+"以上です。");
			}else 
				System.out.println((i+1)+"番目の人の点数は"+test[i]+"です。"+checkval+"未満です。");
		}
	}
}