class CarException extends Exception
{

}

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
	public void setCar(int n,double g)throws CarException
	{
		if(g<0){
			CarException e = new CarException();
			throw e;
		}else{
			num = n;
			gas = g;
			System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました");
		}
	} 
	public void show()
	{
		System.out.println("車ナンバーは"+num+"です。");
	 	System.out.println("ガソリン量"+gas+"です。");
	}
}
class Sample145
{
	public static void main(String[] args){
		Car car1 = new Car();
		try{
			car1.setCar(1234,-10.0);
		}
		catch(CarException e){
			System.out.println(e+"が送出されました。");
		}
		car1.show();
	}
}