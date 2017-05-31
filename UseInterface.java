//�����C���^�[�t�F�C�X
interface belong{
	void bshow();
}

//���܂��̎��C���^�[�t�F�C�X
interface devil_f{
	void dshow();
}

//�e�C�C���^�[�t�F�C�X
interface spirit{
	void sshow();		//���\�b�h
}

//�ʏ��C���^�[�t�F�C�X
interface personal{
	void pshow();		//�ʏ��p���\�b�h
}

abstract class Character implements belong,devil_f,spirit,personal{
	
	protected String sex;
	protected String b_type;
	protected String p_data;
	
	//�t�B�[���h�ݒ�p���\�b�h
	public void setCharacter(String sex,String b_type,String p_data){
	
		this.sex = sex;
		this.b_type = b_type;
		this.p_data = p_data;
	}	
	//
	public void showCharacter(){
		bshow();
		dshow();
		sshow();
		pshow();
		System.out.println("���ʂ́y"+sex+"�z�ł��B");
		System.out.println("���t�^"+b_type+"�z�ł��B");
		System.out.println();
		
	}
}

class Luffy extends Character{
	public void bshow(){
		System.out.println("�����͔����̈ꖡ�ł��B");
	}
	public void dshow(){
		System.out.println("�����̎��̓S���S���̎��B");
	}
	public void sshow(){
		System.out.println("�e���F�̔e�C�B");
		System.out.println("�����F�̔e�C�B");
		System.out.println("�����F�̔e�C�B");
	}
	public void pshow(){
		System.out.println("�Z��́y"+p_data+"�z");
	}
}

class Zoro extends Character{
	public void bshow(){
		System.out.println("�����͔����̈ꖡ�ł��B");
	}
	public void dshow(){
		System.out.println("�����̎��͐H�ׂĂ��Ȃ��B");
	}
	public void sshow(){
		System.out.println("�����F�̔e�C�B");
	}
	public void pshow(){
		System.out.println("���́y"+p_data+"�z");
	}
}

class Nami extends Character{
	public void bshow(){
		System.out.println("�����͔����̈ꖡ�ł��B");
	}
	public void dshow(){
		System.out.println("�����̎��͐H�ׂĂ��Ȃ��B");
	}
	public void sshow(){
		System.out.println("�e�C�͂Ȃ��B");
	}
	public void pshow(){
		System.out.println("���̂́y"+p_data+"�z");
	}
}

class Ace extends Character{
	public void bshow(){
		System.out.println("�����͔��Ђ��C���c");
	}
	public void dshow(){
		System.out.println("�����̎��̓��������̎�");
	}
	public void sshow(){
		System.out.println("�e���F�̔e�C�B");
		System.out.println("�����F�̔e�C�B");
		System.out.println("�����F�̔e�C�B");
	}
	public void pshow(){
		System.out.println("�Z��́y"+p_data+"�z");
	}
}

class UseInterface
{
	public static void main(String[] args)
	{
		final int ARRAY_MAX = 4;
		Character[] op = new Character[ARRAY_MAX];
		
		for(int i=0;i<op.length;i++){
			switch(i){
			case 0:
				op[i] = new Luffy();
				op[i].setCharacter("�j","F�^(RH+)","��");
				op[i].showCharacter();
				break;
			case 1:
				op[i] = new Zoro();
				op[i].setCharacter("�j","XF�^(RH+)","�O����");
				op[i].showCharacter();
				break;
			case 2:
				op[i] = new Nami();
				op[i].setCharacter("��","X�^(RH+)","�ǂ�ڂ��L");
				op[i].showCharacter();
				break;
			case 3:
				op[i] = new Ace();
				op[i].setCharacter("�j","�s��","�Z");
				op[i].showCharacter();
				break;
			}
		}
	}
}