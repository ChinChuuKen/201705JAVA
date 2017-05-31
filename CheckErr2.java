import java.io.*;

// �����̎�
interface Fruits2{
	void dispFruits();
	void eatFruits(String fName);
}

// super�N���X
class Chara2 implements Fruits2{
	protected String name;
	protected String sex;
	protected String dFruits;
	
	public void setChara(String n, String sx){
		name = n;
		sex = sx;
	}
	public void show(){
		System.out.println("���O\t:" + name + "\n����\t:" + sex);
	}
	public String getName(){
		return this.name;
	}
	public void dispFruits(){
		System.out.println("�����̎�:" + dFruits);
	}
	public void eatFruits(String fn){
		dFruits = fn;
	}
}

// �C���N���X
class Pirate2 extends Chara2{
	private long prize;
	private String shipName;
	
	public Pirate2(String n, String sx, long pz, String sNm){
		super.setChara(n, sx);
		prize = pz;
		shipName = sNm;
	}

	public void dispPrize(){
		System.out.println("�܋��z:" + prize + "�x���[");
	}
	public void dispShipName(){
		System.out.println("�D�̖��O��:" + shipName);
	}
	public void show(){
		super.show();
		System.out.println("�D�̖��O:" + shipName + "\n�܋��z\t:" +
						prize + "�x���[");
	}
}

// �C�R�N���X
class Navy2 extends Chara2{
	private String grade;

	public Navy2(String n, String sx, String g){
		super.setChara(n, sx);
		grade = g;
	}
	public void show(){
		super.show();
		System.out.println("�K��\t:" + grade);
	}
}

class CheckErr2
{
	public static void main(String[] args)throws IOException{
		//prtData���쐬�A6�C���̃f�[�^(name,sex,�܋��z,�D�̖��O,�����̎�)���i�[
		String[][] prtData = {
			{"�����L�[D���t�B","�j","500000000","�T�E�U���h�T�j�[��","�S���S���̎�"},
			{"�j�R�E���r��","��","500000000","�T�E�U���h�T�j�[��","�n�i�n�i�̎�"},
			{"�|�[�g�K�XD�G�[�X","�j","550000000","���r�[�f�B�b�N��","���������̎�"},
			{"�o���g�����I","�j","200000000","�S�[�C���O���t�B�Z���p�C��","�o���o���̎�"},
			{"�L���x���f�B�b�V��","�j","280000000","�����X�̔��n��","�Ȃ�"},
			{"�A���r�_","��","330000000","Miss���u�_�b�N��","�X�x�X�x�̎�"}
		};
		//nvyData���쐬�A4�C�R�̃f�[�^(name,sex,�K��,�����̎�)���i�[
		String[][] nvyData = {
			{"�T�J�Y�L","�j","����","�}�O�}�O�̎�"},
			{"�{���T���[�m","�j","�叫","�s�J�s�J�̎�"},
			{"�X���[�J�[","�j","����","���N���N�̎�"},
			{"��","��","����","�E�H�V���E�H�V���̎�"}
		};		
		
		//�z��ϐ�prtArray��錾�A�v�f����prtData.length(������5)��ݒ�
		Chara2[] prtArray = new Pirate2[prtData.length];
		//prtArray�ɂ�Pirate2�̃f�[�^(�C���X�^���X)���i�[,
		for(int i=0;i<prtData.length;i++){
			prtArray[i] = new Pirate2(prtData[i][0], 
									prtData[i][1],
									Long.parseLong(prtData[i][2]),		//prtData[i][2]�̒l��long�^�ɕϊ�
									prtData[i][3]);
			prtArray[i].eatFruits(prtData[i][4]);		//����i�s�̍Ō�̃f�[�^���w�肵�AeatFruits()�����s
		}
		//�z��ϐ�nvyArray��錾�A�v�f����nvyData.length(������4)��ݒ�
		Chara2[] nvyArray = new Navy2[nvyData.length];
		//nvyArray��Navy2�̃f�[�^(�C���X�^���X)���i�[,
		for(int i=0;i<nvyData.length;i++){
			nvyArray[i] = new Navy2(nvyData[i][0], 
									nvyData[i][1],
									nvyData[i][2]);
			nvyArray[i].eatFruits(nvyData[i][3]);		//����i�s�̍Ō�̃f�[�^���w�肵�AeatFruits()�����s
		}
		
		System.out.println("�ǂ���̃f�[�^��\�����܂����H\n�\���������f�[�^�̔ԍ�����͂��Ă��������B\n0:�C��\t1:�C�R");
		
		
		/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int sel = Integer.parseInt(br.readLine());
			Chara2[] chArr;
			String dtype;
	        //���͂�0�̏ꍇ�Adtype�̒l��"�C��"�AchArr�̒l��prtArray
			//���͂�1�̏ꍇ�Adtype�̒l��"�C�R"�AchArr�̒l��nvyArray
			if(sel == 0){
				dtype = "�C��";
				chArr = prtArray;
			}else{
				dtype = "�C�R";
				chArr = nvyArray;
			}System.out.println("***** "+dtype+"�̃f�[�^��\�����܂��B *****");
				System.out.println("�N�̃f�[�^��\�����܂����H\n�\���������l���̔ԍ�����͂��Ă��������B\n"+
					"�S�����\������ꍇ�͑S��(99)����͂��Ă��������B");
				dispNameList(chArr, sel);		//����chArr�̒l(�z��̖��O)��sel�̒l(0��1)���w�肵,dispNameList()�����s
				sel = Integer.parseInt(br.readLine());
				dispData(chArr, sel);			//����chArr�̒l(�z��̖��O)��sel�̒l(�l���̔ԍ���99)���w�肵,dispData()�����s
		*/
		try{
			try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int sel = Integer.parseInt(br.readLine());
				Chara2[] chArr;
				String dtype;
		        //���͂�0�̏ꍇ�Adtype�̒l��"�C��"�AchArr�̒l��prtArray
				//���͂�1�̏ꍇ�Adtype�̒l��"�C�R"�AchArr�̒l��nvyArray
				if(sel == 0){
					dtype = "�C��";
					chArr = prtArray;
					System.out.println("***** "+dtype+"�̃f�[�^��\�����܂��B *****");
					System.out.println("�N�̃f�[�^��\�����܂����H\n�\���������l���̔ԍ�����͂��Ă��������B\n"+
						"�S�����\������ꍇ�͑S��(99)����͂��Ă��������B");
					dispNameList(chArr, sel);		//����chArr�̒l(�z��̖��O)��sel�̒l(0��1)���w�肵,dispNameList()�����s
					sel = Integer.parseInt(br.readLine());
					dispData(chArr, sel);			//����chArr�̒l(�z��̖��O)��sel�̒l(�l���̔ԍ���99)���w�肵,dispData()�����s
				}else if(sel == 1){
					dtype = "�C�R";
					chArr = nvyArray;
					System.out.println("***** "+dtype+"�̃f�[�^��\�����܂��B *****");
					System.out.println("�N�̃f�[�^��\�����܂����H\n�\���������l���̔ԍ�����͂��Ă��������B\n"+
						"�S�����\������ꍇ�͑S��(99)����͂��Ă��������B");
					dispNameList(chArr, sel);		//����chArr�̒l(�z��̖��O)��sel�̒l(0��1)���w�肵,dispNameList()�����s
					sel = Integer.parseInt(br.readLine());
					dispData(chArr, sel);			//����chArr�̒l(�z��̖��O)��sel�̒l(�l���̔ԍ���99)���w�肵,dispData()�����s
				}else{
					System.out.println("�K�v�Ȕ͈͂̃f�[�^����͂��Ă�������!");
			}
			}catch(NumberFormatException e){
				System.out.println("�K�v�ȃf�[�^(����)����͂��Ă�������!");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�K�v�Ȕ͈͂̃f�[�^����͂��Ă�������!");
	    }finally{}
	}
	//���\�b�h�\dispData��錾
	//sel�̒l�͐l���̔ԍ��̏ꍇ�A�l���̃f�[�^��\��,
	//sel�̒l��99�̏ꍇ�A�S���C���l��(chArr�̒l��prtArray�̏ꍇ)�̃f�[�^��\��
	//sel�̒l��99�̏ꍇ�A�S���C�R�l��(chArr�̒l��nvyArray�̏ꍇ)�̃f�[�^��\��
	public static void dispData(Chara2[] cArr, int dSel){
		if(dSel == 99){
			for(int i=0;i<cArr.length;i++){
				cArr[i].show();		//�S���l���̃f�[�^��\��
				System.out.println("******************************");
			}
		}else{
			cArr[dSel].show();		//�I���̐l���̃f�[�^��\��
		}
	}
	//���\�b�h�\dispNameList��錾�A�C�����C�R�̖��O��S���ŕ\��
	public static void dispNameList(Chara2[] cArr,int dSel){
		String str = "";
		for(int i=0;i<cArr.length;i++){
			str += i +" : "+ cArr[i].getName() + " \n";		//i�Ԗڂ̐l�̖��O
		}
		System.out.println(str);
	}
}
