import java.io.*;
class Checkarray2x
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("�l����͂�����������");
		System.out.println("�l����͂�����������");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int checkval=Integer.parseInt(str);
		
		int[] test={80,75,50,90,20};
		
		//System.out.println("�l���̓_������͂��Ă��������B");
		//String str;
		for(int i=0;i<5;i++){
			if(test[i]>=checkval){
				System.out.println((i+1)+"�Ԗڂ̐l�̓_����"+test[i]+"�ł��B"+checkval+"�ȏ�ł��B");
			}else 
				System.out.println((i+1)+"�Ԗڂ̐l�̓_����"+test[i]+"�ł��B"+checkval+"�����ł��B");
		}
	}
}