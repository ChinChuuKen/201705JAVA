
class Checkarry
{
	public static void main(String[] args)
	{
		int[] test={80,75,50,90,20};
		for(int i=0;i<5;i++){
			if(test[i]>=60){
				System.out.println((i+1)+"�Ԗڂ̐l�̓_����"+test[i]+"�ł��B60�ȏ�ł��B");
			}else 
				System.out.println((i+1)+"�Ԗڂ̐l�̓_����"+test[i]+"�ł��B60�����ł��B");
		}
	}
}