class Car
{
	 private int num;
	 private double gas;
	
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
	 	System.out.println("�i���o�[��"+num+"�K�\�����ʂ�"+gas+"�ɂ��܂����B");
	 }
	 
	 public void show()
	 {
	 	System.out.println("�ԃi���o�[��"+num+"�ł��B");
	 	System.out.println("�K�\������"+gas+"�ł��B");
	 }
}
class Sample106
{
	public static void main(String[] args)
	{
		Car car1;
		System.out.println("car1��錾���܂����B");
		car1 = new Car();
		car1.setCar(1234,20.5);
		
		Car car2;
		System.out.println("car2��錾���܂����B");
		car2 = car1;
		System.out.println("car2��car1�������܂����B");
		
		System.out.println("car1�������B");
		car1.show();
		//car1.setCar(8888,111.1);
		car1 = null;
		
		System.out.println("car2�������B");
		car2.show();
	}
}