class Car
{
	private int num;
	private double gas;
	
	//
	public Car(){
		num = 100;
		gas = 12.8;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	void show(){
		System.out.println("�Ԃ̃i���o�[��"+num+"�ł��B");
		System.out.println("�K�\�����ʂ�"+gas+"�ł��B");
	}
}
class Sample94
{
	public static void main(String[] args)
	{
		System.out.println("main start");
		Car car1=new Car();
		System.out.println("car1 finished");
		car1.show();
		
	}
}
