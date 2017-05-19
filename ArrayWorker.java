class Worker
{
	public void work()
	{
		System.out.println("出社");
	}
}
class Ka_worker extends Worker
{
	public void work()
	{
		System.out.println(出社);
		meteting();
		System.out.println();
		
	}
	public void meeting()
	{
		System.out.println("★★★会議中★★★");
	}
}
class Ippan_worker extends Worker
{
	public void work()
	{
		System.out.println("出社");
		develop();
		System.out.println();
		
	}
	public void develop()
	{
		System.out.println("★★★開発中★★★");
		
	}
}
class ArrayWorker
{
	public static void main(String[] args)
	{
		Worker[] wk=new Worker[6];
		wk[0]=wk.Ka_worker();
		wk[1]=wk.Ippan_worker();
		wk[2]=wk.Ippan_worker();
		wk[3]=wk.Ippan_worker();
		wk[4]=wk.Ippan_worker();
		wk[5]=wk.Ippan_worker();
		
		for(int i=0;i<wk.length;i++){
			wk[i].work();
			
			System.out.println("******************");
		}
	}
}