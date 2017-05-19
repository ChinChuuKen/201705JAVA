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
			System.out.println("test[4]に値を代入します。");
			
			test[4] = num;
			//test[10] = 10;
			System.out.println("test[4]に"+num+"を代入しました。");
		}
		//catch(ArrayIndexOutOfBoundsException a){
		//	System.out.println("配列の要素をこえたいます1。");
			//System.out.println(e);
		//}
		catch(NumberFormatException e){
			System.out.println("配列の要素をこえたいます。");
			//System.out.println(e);
		}
		finally{
			System.out.println("最後に必ずこの処理をします。");
		}
		System.out.println("無事終了しました。");
		
	}
}