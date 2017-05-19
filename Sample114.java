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
	public void show()
	{
		System.out.println("★レーシングかーのナンバーは"+num+"です。");
		System.out.println("★車ナンバーは"+gas+"です。");
	 	System.out.println("★コース番号は"+course+"です。");
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
		car2=new RacingCar();//子?的?象?例(car2)，可以引用父?的方法
		car2.setCar(1234,20.5);
		//car1.setCourse(5);
		car2.show();
		
		/**
		System.out.println("\n\n******************");
		RacingCar rccar2;
		rccar2=new Car();//父?的?象?例(rccar2)，不能引用子?的方法
		//rccar2.setCar(1234,20.5);
		rccar2.setCourse(5);
		rccar2.show();
		
eg:
		Student是一个?， 
?句 
Student s; //只是声明了一个引用，并不??到特定的?例 
Student s = new Student(); 
上面?句?例化了一个Student?象，new Student()是?用?的?造函数?生?例。最后?引用和?例相?。 
所以?象的引用和?例是不同的。s 是Student?象或?例的引用。?象和?例的概念是相同的。 
如果?用 
Student s; 
声明引用后，无法?用object的属性和方法，因?它并不和任何?例相?
		
		*/
	} 
}