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
	public void show()
	{
		System.out.println("�����[�V���O���[�̃i���o�[��"+num+"�ł��B");
		System.out.println("���ԃi���o�[��"+gas+"�ł��B");
	 	System.out.println("���R�[�X�ԍ���"+course+"�ł��B");
	}
}
class Sample114
{
	public static void main(String[] args)
	{
		RacingCar rccar1=new RacingCar();
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
		rccar1.show();
		
		System.out.println("\n\n******************");
		Car car1=new Car();
		car1.setCar(8888,111.1);
		car1.show();
		
		System.out.println("\n\n******************");
		Car car2;
		car2=new RacingCar();//�q?�I?��?��(car2)�C�Ȉ��p��?�I���@
		car2.setCar(1234,20.5);
		//car1.setCourse(5);
		car2.show();
		
		/**
		System.out.println("\n\n******************");
		RacingCar rccar2;
		rccar2=new Car();//��?�I?��?��(rccar2)�C�s�\���p�q?�I���@
		//rccar2.setCar(1234,20.5);
		rccar2.setCourse(5);
		rccar2.show();
		
eg:
		Student���꘢?�C 
?�� 
Student s; //�����������꘢���p�C��s??������I?�� 
Student s = new Student(); 
���?��?�ቻ���꘢Student?�ہCnew Student()��?�p?�I?������?��?��B�ō@?���p�a?�ᑊ?�B 
����?�ۓI���p�a?�ᐥ�s���I�Bs ��Student?�ۈ�?��I���p�B?�ۘa?��I�T�O�������I�B 
�@��?�p 
Student s; 
�������p�@�C�ٖ@?�pobject�I�����a���@�C��?����s�a�C��?�ᑊ?
		
		*/
	} 
}