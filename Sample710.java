class Sample710
{
	public static void main(String[] args)
	{
		int[][] test;
		test=new int[2][5];
		
		test[0][0]=80;
		test[0][1]=60;
		test[0][2]=22;
		test[0][3]=50;
		test[0][4]=75;
		test[1][0]=90;
		test[1][1]=55;
		test[1][2]=68;
		test[1][3]=72;
		test[1][4]=58;
		
		for(int i=0;i<test[0].length;i++){
			System.out.println((i+1)+"�Ԗڂ̐l�̍���̓_����"+test[0][i]+"�ł��B");
			System.out.println((i+1)+"�Ԗڂ̐l�̎Z���̓_����"+test[1][i]+"�ł��B");
		}
		
		for(int i=0;i<test.length;i++){
			for(int j=0;j<test[i].length;j++){
				System.out.println((j+1)+"�Ԗڂ̐l�̓_����"+test[i][j]+"�ł��B");
				System.out.println("test["+i+"]["+j+"]�̓_����"+test[i][j]+"�ł��B");
			}
			System.out.println("*********");
		}
		
	}
}