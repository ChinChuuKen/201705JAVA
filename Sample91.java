class Car
{
	private int num;
	private double gas;
	
	void setNumGas(int n,double g){
		num = n;
		gas = g;
	}
	
	void show(){
		System.out.println("�Ԃ̃i���o�[��"+num+"�ł��B");
		System.out.println("�K�\�����ʂ�"+gas+"�ł��B");
	}
}
class Sample91
{
	public static void main(String[] args)
	{
		Car car1=new Car();
		
		//car1.num=1234;
		//car1.gas=20.5;
		
		car1.setNumGas(1234,20.5);
		car1.show();
		
	}
}
