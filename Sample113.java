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
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました");
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
		//this(8888,111.1,9);
		//super(8888,111.1);
		course = 0;
		System.out.println("レーシングかーを作成しました。");
	}
	public RacingCar(int n,double g,int c)//int n,double g,
	{
		
		super(n,g);//n,g
		//this();
		course = c;
		System.out.println("コース番号を"+course+"のレーシングかーを作成しました。");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("コース番号を"+course+"にしました。");
		
	}
	public void newShow()
	{
		System.out.println("レーシングかーのナンバーは"+num+"です。");
		System.out.println("車ナンバーは"+gas+"です。");
	 	System.out.println("コース番号は"+course+"です。");
	}
}
class Sample113
{
	public static void main(String[] args)
	{
		RacingCar rccar1=new RacingCar(1234,20.5,5);//1234,20.5,
		
		rccar1.newShow();
	} 
}