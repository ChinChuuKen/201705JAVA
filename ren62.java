import java.io.*;
class ren62
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�e�X�g�̓_������͂��Ă��������B(0�ŏI��)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		double res=0;
		int i=0;
		double sum=0;
		double sum1=0;
		int a;
		//���pwhile
		while(res!=0){
			String str=br.readLine();
		    res=Integer.parseInt(str);
			sum +=res;
			i++;
		}
		//���pdo{} while();
		do{
			String str=br.readLine();
		    res=Integer.parseInt(str);
			sum +=res;
			i++;
		}while(res!=0);
		
		a=(int) sum;
		System.out.println("�e�X�g�̍��v�_��"+a+"�_�ł�");
		sum1=sum/(i-1);
		System.out.println("�e�X�g�̕��ϓ_��"+sum1+"�_�ł�");
		
	}
}
	
