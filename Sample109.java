class Car
{
	private int num;
	private double gas;
	
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
class Sample109
{
	public static void main(String[] args)
	{
		Car[] cars = new Car[3];
		
		for(int i=0;i<cars.length;i++){
			cars[i] = new Car();
		}
		
		cars[0].setCar(1234,20.5);
		cars[1].setCar(2345,30.5);
		cars[2].setCar(3456,40.5);
		
		for(int i=0;i<cars.length;i++){
			cars[i].show();
		}
	}
}