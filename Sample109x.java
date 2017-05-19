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
class Sample109x
{
	public static void main(String[] args)
	{
		Car[] cars = new Car[3];
		
		int[] num ={1234,2345,3456};
		double[] gas ={20.5,30.5,40.5};
		
		for(int i=0;i<cars.length;i++){
			System.out.println("----------------");
			cars[i] = new Car();
			cars[i].setCar(num[i],gas[i]);
			cars[i].show();
			System.out.println("----------------");
		}
	}
}