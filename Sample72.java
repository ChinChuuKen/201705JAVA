import java.io.*;
class Sample72
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("�e�X�g�󌱎҂̐�����͂��Ă��������B");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		
		int[] test;
		test=new int[num];
		
		System.out.println("�l���̓_������͂��Ă��������B");
		
		for(int i=0;i<num;i++){
			str=br.readLine();
			int tem=Integer.parseInt(str);
			test[i]=tem;
		}
		for(int i=0;i<num;i++){
			System.out.println((i+1)+"�Ԗڂ̐l�̓_����"+test[i]+"�ł��B");
		}
	}
}