class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました");
	} 
	public void show()
	{
		System.out.println("車ナンバーは"+num+"です。");
	 	System.out.println("ガソリン量"+gas+"です。");
	}
}
//
class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("レーシングかーを作成しました。");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("コース番号を"+course+"にしました。");
		
	}
	//@override
	public void show()
	{
		System.out.println("★レーシングかーのナンバーは"+num+"です。");
		System.out.println("★車ナンバーは"+gas+"です。");
	 	System.out.println("★コース番号は"+course+"です。");
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