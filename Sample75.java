class Sample75
{
	public static void main(String[] args)
	{
		int[] test1;
		test1=new int[3];
		System.out.println("test1��錾���܂����B");
		System.out.println("�z��v�f���m�ۂ��܂����B");
		
		test1[0]=80;
		test1[1]=60;
		test1[2]=22;
		
		int a=3;
		int b=a;
		b=5;
		int[] test2;
		System.out.println("test2��錾���܂����B");
		System.out.println(a);
		System.out.println(b);
		
		test2=test1;
		test2[1]=50;
		System.out.println("test2��test1�������܂����B");
		
		for(int i=0;i<3;i++){
				System.out.println("test1������"+(i+1)+"�Ԗڂ̐l�̓_����"+test1[i]+"�ł��B");
		}
		for(int i=0;i<3;i++){
				System.out.println("test2������"+(i+1)+"�Ԗڂ̐l�̓_����"+test2[i]+"�ł��B");
		}
	}
}