//creat a new file called 'Car' which storage "class Car" 
class Car
{
	int num;
	double gas;
	//int age;
	
}
class Sample81
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		Car car2;
		car2=new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		//car1.age=20;
		car2.num=3456;
		car2.gas=10.6;
		
		System.out.println("�Ԃ̃i���o�[��"+car1.num+"�ł��B");
		System.out.println("�K�\�����ʂ�"+car1.gas+"�ł��B");
		//System.out.println("��"+car1.age+"�ł��B");
		System.out.println("�Ԃ̃i���o�[��"+car2.num+"�ł��B");
		System.out.println("�K�\�����ʂ�"+car2.gas+"�ł��B");
	}
}