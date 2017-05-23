abstract class Animal
{
	protected int leg;			//脚
	protected int wing;			//羽根
	protected String tail;		//尻尾
	protected String sex;		//性別
	protected String breath;	//呼吸方法
	protected String move;		//移動方法
	
	public void setAnimal
	(int leg,int wing,String tail,String sex,String breath,String move)
	{
		this.leg = leg;
		this.wing = wing;
		this.tail = tail;
		this.sex = sex;
		this.breath = breath;
		this.move = move;
	}
	public void showAnimal()
	{
		born();		//生産方法を
		move();		//移動方法を
		breath();	//呼吸方法
		eat();		//食事方法を
		sleep();	//睡眠方法を
	}
	//抽象メソッドの定義
	abstract void born();
	abstract void move();
	abstract void breath();
	abstract void eat();
	abstract void sleep();

} 
class Giraffe extends Animal
{
	public void born(){
		System.out.println("キリンは母親のお腹から生まれます。");
	}
	public void move(){
		System.out.println("キリンは"+leg+"本脚で陸上を"+move+"移動します。");
	}
	public void breath(){
		System.out.println("キリンの呼吸方法は"+breath+"です。");
	}
	public void eat(){
		System.out.println("キリンは草食です。");
	}
	public void sleep(){
		System.out.println("キリンは横になって寝ます。");
	}
}
class Tuna extends Animal
{
	public void born(){
		System.out.println("マグロは卵から孵化します。");
	}
	public void move(){
		System.out.println("マグロは"+tail+"で海中を"+move+"移動します。");
	}
	public void breath(){
		System.out.println("マグロの呼吸方法は"+breath+"です。");
	}
	public void eat(){
		System.out.println("マグロは海中プランクトンや魚を食べます。");
	}
	public void sleep(){
		System.out.println("マグロは寝ません。");
	}
}
class UseAbstractClass
{
	public static void main(String[] args)
	{
		Giraffe g1 = new Giraffe();
		g1.setAnimal(4,0,"尻尾","","肺呼吸","歩いで");
		g1.showAnimal();
		
		System.out.println();
		
		Tuna t1 = new Tuna();
		t1.setAnimal(0,0,"尾ビレ","","エラ呼吸","泳いで");
		t1.showAnimal();
	}
}