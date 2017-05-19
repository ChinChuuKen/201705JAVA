class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 1;
		System.out.println("RacingCarのコンストラクた。");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("コース番号を"+course+"にしました。");
		
	}
	public void set(int n,double g)
	{
		
		
	}
}
class L11
{
	public static void main(String[] args)
	{
		RacingCar rc1=new RacingCar();
		rc1.setCourse(100);
		rc1.setCar(8888,111.1);
		rc1.show();
	} 
}