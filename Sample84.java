class Car
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num =n;
		System .out.println("�i���o�[��"+num+"�ɂ��܂����B");
	}
	void setGas(double g)
	{
		gas =g;
		System .out.println("���\�����ʂ�"+gas+"�ɂ��܂����B");
	}
	void show()
	{
		System.out.println("�Ԃ̃i���o�[��"+num+"�ł��B");
		System.out.println("�K�\�����ʂ�"+gas+"�ł��B");
	}
}
class Sample84
	{
		public static void main(String[] args)
		{
			Car car1=new Car();
			
			int number=1234;
			double gasoline=20.5;
			
			car1.setNum(number);
			car1.setGas(gasoline);
		}
	}