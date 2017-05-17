import java.io.*;
class ren62
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("テストの点数を入力してください。(0で終了)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		double res=0;
		int i=0;
		double sum=0;
		double sum1=0;
		int a;
		//利用while
		while(res!=0){
			String str=br.readLine();
		    res=Integer.parseInt(str);
			sum +=res;
			i++;
		}
		//利用do{} while();
		do{
			String str=br.readLine();
		    res=Integer.parseInt(str);
			sum +=res;
			i++;
		}while(res!=0);
		
		a=(int) sum;
		System.out.println("テストの合計点は"+a+"点です");
		sum1=sum/(i-1);
		System.out.println("テストの平均点は"+sum1+"点です");
		
	}
}
	
