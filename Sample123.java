//�̂���̃C���^�[�t�F�C�X(interface)
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
		System.out.println("�i���o�["+num+"�K�\������"+gas+"�̎Ԃ��쐬���܂���");
	}
	
	public void show()
	{
		System.out.println("�ԃi���o�[��"+num+"�ł��B");
	 	System.out.println("�K�\������"+gas+"�ł��B");
	}
}

class Plane implements iVehicle
{
	private int flight;
	 
	public Plane(int f)
	{
		flight = f;
		System.out.println("��"+flight+"�̔�s�@���쐬���܂���");
	}
	public void show()
	{
		System.out.println("��s�@�̕�"+flight+"�ł��B");
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