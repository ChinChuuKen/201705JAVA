import java.io.*;
class Uriage
{
	public static void main(String[] args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�������͂�����������");
		int tok,oosaka,jd,mgw;
		for(int i=0;i<4;i++){
			String str=br.readLine();
			int sale=Integer.parseInt(str);
			if(i=0){
				tok=sale;
			}else if(i=1){
				oosaka=sale;
			}else if(i=2){
				jd=sale;
			}else if(i=3){
				mgw=sale;
			}
		}
		string [][] sales;
		sales=new string{{1,2,3,4},{tok,oosaka,jd,mgw}}
		
		System.out.println("�����\�����܂��B");
		for(int i=0;i<sales.length;i++){
			for(int j=0;j<test[i].length;j++){
				
				System.out.println(sales[i][]);
			}
			
		}
		
	}
}