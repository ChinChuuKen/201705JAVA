import java.io.*;
class Checkarray2
{
	public static void main(String[] args) throws IOException
	{
		//System.out.println("�e�X�g�󌱎҂̐�����͂��Ă��������B");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//String str=br.readLine();
		//int num=Integer.parseInt(str);
		
		int[] test;
		test=new int[5];
		
		System.out.println("�l���̓_������͂��Ă��������B");
		String str;
		for(int i=0;i<5;i++){
			str=br.readLine();
			int tem=Integer.parseInt(str);
			test[i]=tem;
		}
		for(int i=0;i<5;i++){
			if(test[i]>=80){
				System.out.println((i+1)+"�Ԗڂ̐l�̓_����"+test[i]+"�ł��B80�ȏ�ł��B");
			}else 
				System.out.println((i+1)+"�Ԗڂ̐l�̓_����"+test[i]+"�ł��B80�����ł��B");
		}
	}
}