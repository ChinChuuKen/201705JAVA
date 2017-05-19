//のりものインターフェイス(interface)
interface iVehicle
{
	void show();
	
}

class Car implements iVehicle
{
	private int num;
	private double gas;
	
	public Car(int n,double g)
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

class Plane implements iVehicle
{
	private int flight;
	 
	public Plane(int f)
	{
		flight = f;
		System.out.println("便"+flight+"の飛行機を作成しました");
	}
	public void show()
	{
		System.out.println("飛行機の便"+flight+"です。");
	}
}

class Sample123
{
	public static void main(String[] args)
	{
		iVehicle[] ivc=new iVehicle[2];
		
		ivc[0] = new Car(1234,20.5);
		
		ivc[1] = new Plane(232);
		
		for(int i=0;i<ivc.length;i++){
			ivc[i].show();
		}
	} 
}