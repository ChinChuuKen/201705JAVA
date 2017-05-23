abstract class Animal
{
	protected int leg;			//�r
	protected int wing;			//�H��
	protected String tail;		//�K��
	protected String sex;		//����
	protected String breath;	//�ċz���@
	protected String move;		//�ړ����@
	
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
		born();		//���Y���@��
		move();		//�ړ����@��
		breath();	//�ċz���@
		eat();		//�H�����@��
		sleep();	//�������@��
	}
	//���ۃ��\�b�h�̒�`
	abstract void born();
	abstract void move();
	abstract void breath();
	abstract void eat();
	abstract void sleep();

} 
class Giraffe extends Animal
{
	public void born(){
		System.out.println("�L�����͕�e�̂������琶�܂�܂��B");
	}
	public void move(){
		System.out.println("�L������"+leg+"�{�r�ŗ����"+move+"�ړ����܂��B");
	}
	public void breath(){
		System.out.println("�L�����̌ċz���@��"+breath+"�ł��B");
	}
	public void eat(){
		System.out.println("�L�����͑��H�ł��B");
	}
	public void sleep(){
		System.out.println("�L�����͉��ɂȂ��ĐQ�܂��B");
	}
}
class Tuna extends Animal
{
	public void born(){
		System.out.println("�}�O���͗�����z�����܂��B");
	}
	public void move(){
		System.out.println("�}�O����"+tail+"�ŊC����"+move+"�ړ����܂��B");
	}
	public void breath(){
		System.out.println("�}�O���̌ċz���@��"+breath+"�ł��B");
	}
	public void eat(){
		System.out.println("�}�O���͊C���v�����N�g���⋛��H�ׂ܂��B");
	}
	public void sleep(){
		System.out.println("�}�O���͐Q�܂���B");
	}
}
class UseAbstractClass
{
	public static void main(String[] args)
	{
		Giraffe g1 = new Giraffe();
		g1.setAnimal(4,0,"�K��","","�x�ċz","������");
		g1.showAnimal();
		
		System.out.println();
		
		Tuna t1 = new Tuna();
		t1.setAnimal(0,0,"���r��","","�G���ċz","�j����");
		t1.showAnimal();
	}
}