class Car
{
	public static int sum = 0;//有static，是??量，全局起作用
	public int sumx = 0;//?例?量，??在?例化以后的?象中起作用
	
	private int num;
	private double gas;
	
	 public Car()
	 {
	 	num = 0;
	 	gas = 0.0;
	 	sum++;
	 	sumx++;
	 	System.out.println("車を作成しました。");
	 	
	 }
	 //instence 方法
	 public void setCar(int n,double g)
	 {
	 	num = n;
	 	gas = g;
	 	System.out.println("ナンバーは"+num+"ガソリン量を"+gas+"にしました。");
	 }
	//有static，?方法
	 public static void showSum()
	 {
	 	System.out.println("車は全部で"+sum+"台あります。");
	 }
	//instance 方法
	 public void showSumx()
	 {
	 	System.out.println("sumx:車は全部で"+sumx+"台あります。");
	 }
	//instence 方法
	 public void show()
	 {
	 	System.out.println("車ナンバーは"+num+"です。");
	 	System.out.println("ガソリン量"+gas+"です。");
	 }
}
class Sample98
{
	public static void main(String[] args)
	{
		Car.showSum();//?方法可以用?直接?用，不用?例化之后再?用
		//Car.showSumx();//?象方法必??例化之后才能?用
		
		Car car1 = new Car();
		car1.setCar(1234,20.5);
		car1.show();
	
		Car.showSum();//?方法可以用?直接?用，不用?例化之后再?用
		car1.showSumx();//?象方法必??例化之后才能?用
		car1.showSum();//?方法可以用?直接?用，不用?例化之后再?用，?例化之后再?用也是可以的
		
		Car car2 = new Car();
		car2.setCar(4567,30.5);
		car2.show();
		
		Car.showSum();
		car2.showSumx();//?象方法必??例化之后才能?用
		car2.showSum();
	}
}