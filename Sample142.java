class Sample142
{
	public static void main(String[] args)
	{
		try{
		int[] test;
		test = new int[5];
		System.out.println("test[10]�ɒl�������܂��B");
		
		test[10] = 80;
		System.out.println("test[10]��80�������܂����B");
		}
		catch(ArrayIndexOutOfBoundsException eeeee){
			System.out.println("�z��̗v�f�����������܂��B");
			System.out.println(eeeee);
		}
		finally{
			System.out.println("�Ō�ɕK�����̏��������܂��B");
		}
		System.out.println("�����I�����܂����B");
		
	}
}