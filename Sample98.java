class Car
{
	public static int sum = 0;//�Lstatic�C��??�ʁC�S�ǋN��p
	public int sumx = 0;//?��?�ʁC??��?�ቻ�ȍ@�I?�ے��N��p
	
	private int num;
	private double gas;
	
	 public Car()
	 {
	 	num = 0;
	 	gas = 0.0;
	 	sum++;
	 	sumx++;
	 	System.out.println("�Ԃ��쐬���܂����B");
	 	
	 }
	 //instence ���@
	 public void setCar(int n,double g)
	 {
	 	num = n;
	 	gas = g;
	 	System.out.println("�i���o�[��"+num+"�K�\�����ʂ�"+gas+"�ɂ��܂����B");
	 }
	//�Lstatic�C?���@
	 public static void showSum()
	 {
	 	System.out.println("�Ԃ͑S����"+sum+"�䂠��܂��B");
	 }
	//instance ���@
	 public void showSumx()
	 {
	 	System.out.println("sumx:�Ԃ͑S����"+sumx+"�䂠��܂��B");
	 }
	//instence ���@
	 public void show()
	 {
	 	System.out.println("�ԃi���o�[��"+num+"�ł��B");
	 	System.out.println("�K�\������"+gas+"�ł��B");
	 }
}
class Sample98
{
	public static void main(String[] args)
	{
		Car.showSum();//?���@�ȗp?����?�p�C�s�p?�ቻ�V�@��?�p
		//Car.showSumx();//?�ە��@�K??�ቻ�V�@�˔\?�p
		
		Car car1 = new Car();
		car1.setCar(1234,20.5);
		car1.show();
	
		Car.showSum();//?���@�ȗp?����?�p�C�s�p?�ቻ�V�@��?�p
		car1.showSumx();//?�ە��@�K??�ቻ�V�@�˔\?�p
		car1.showSum();//?���@�ȗp?����?�p�C�s�p?�ቻ�V�@��?�p�C?�ቻ�V�@��?�p�琥�ȓI
		
		Car car2 = new Car();
		car2.setCar(4567,30.5);
		car2.show();
		
		Car.showSum();
		car2.showSumx();//?�ە��@�K??�ቻ�V�@�˔\?�p
		car2.showSum();
	}
}