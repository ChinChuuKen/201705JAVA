//creat a new file called 'Car' which storage "class Car" 
class Car
{
	int num;
	double gas;
	//int age;
	
}
class Sample81
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		Car car2;
		car2=new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		//car1.age=20;
		car2.num=3456;
		car2.gas=10.6;
		
		System.out.println("車のナンバーは"+car1.num+"です。");
		System.out.println("ガソリン量は"+car1.gas+"です。");
		//System.out.println("は"+car1.age+"です。");
		System.out.println("車のナンバーは"+car2.num+"です。");
		System.out.println("ガソリン量は"+car2.gas+"です。");
	}
}