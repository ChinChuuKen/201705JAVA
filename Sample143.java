class Sample143
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
		catch(ArrayIndexOutOfBoundsException e){
		
			System.out.println("�z��̗v�f�����������܂��B");
			//System.out.println(e);
			
		}
		finally{
		System.out.println("�Ō�ɕK�����̏��������܂��B");
			
		}
		System.out.println("�����I�����܂����B");
		
	}
}