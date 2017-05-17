class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車のナンバーは"+num+"です。");
		System.out.println("ガソリン量は"+gas+"です。");
	}
}
class Sample82
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		//追加
		Car car2=new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		//追加
		car2.num=5000;
		car2.gas=88.8;
		
		car1.show();
		car1.show();
		//追加
		car2.show();
	}
}