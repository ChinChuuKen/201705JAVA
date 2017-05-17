class Car
{
	private int num;
	private double gas;
	
	//
	public Car(){
		num = 100;
		gas = 12.8;
		System.out.println("車を作成しました。");
	}
	
	void show(){
		System.out.println("車のナンバーは"+num+"です。");
		System.out.println("ガソリン量は"+gas+"です。");
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
