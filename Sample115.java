class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�i���o�["+num+"�K�\������"+gas+"�̎Ԃ��쐬���܂���");
	} 
	public void show()
	{
		System.out.println("�ԃi���o�[��"+num+"�ł��B");
	 	System.out.println("�K�\������"+gas+"�ł��B");
	}
}
//
class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("���[�V���O���[���쐬���܂����B");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�R�[�X�ԍ���"+course+"�ɂ��܂����B");
		
	}
	//@override
	public void show()
	{
		System.out.println("�����[�V���O���[�̃i���o�[��"+num+"�ł��B");
		System.out.println("���ԃi���o�[��"+gas+"�ł��B");
	 	System.out.println("���R�[�X�ԍ���"+course+"�ł��B");
	}
}

class Sample115
{
	public static void main(String[] args)
	{
		Car car1;
		
		car1=new RacingCar();
		
		car1.setCar(1234,20.5);
		//car1.setCourse(5);
		car1.show();
		
	} 
}