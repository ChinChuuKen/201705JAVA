class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("�Ԃ̃i���o�[��"+num+"�ł��B");
		System.out.println("�K�\�����ʂ�"+gas+"�ł��B");
	}
}
class Sample82
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		//�ǉ�
		Car car2=new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		//�ǉ�
		car2.num=5000;
		car2.gas=88.8;
		
		car1.show();
		car1.show();
		//�ǉ�
		car2.show();
	}
}