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
class Sample97
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		car1.setCar(1234,20.5);
		car1.show();
		
		Car car2 = new Car();
		car2.setCar(4567,30.5);
		car2.show();
	}
}