// �����̎�
interface Fruits{
	void dispFruits();
	void eatFruits(String fName);
}

// super�N���X
class Chara {
	protected String name;
	protected String sex;
	
	public void setChara(String n, String sx){
		name = n;
		sex = sx;
	}
	public void show(){
		System.out.println("���O\t:" + name +"\n����\t:"+ sex);
	}
	public String getName(){
		return this.name;
	}
}

// �C���N���X
class Pirate extends Chara{
	private long prize;
	private String shipName;
	private String dFruits;
	
	public Pirate(String n, String sx, long pz, String sNm){
		super.setChara(n, sx);
		prize = pz;
		shipName = sNm;
	}

	public void dispFruits(){
		System.out.println("�����̎�:" + dFruits);
	}
	public void eatFruits(String fn){
		dFruits = fn;
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
		this.dispFruits();
	}
}

// �C�R�N���X
class Navy extends Chara{
	private String grade;
	private String dFruits;

	public Navy(String n, String sx, String g){
		super.setChara(n, sx);
		grade = g;
	}
	public void dispFruits(){
		System.out.println("�����̎�:" + dFruits);
	}
	public void eatFruits(String fName){
		dFruits = fName;
	}
	public void show(){
		super.show();
		System.out.println("�K��\t:" + grade);
		this.dispFruits();
	}
}

class CheckErr
{
	public static void main(String[] args){
		String[][] prtData = {
			{"�����L�[D���t�B","�j","500000000","�T�E�U���h�T�j�[��","�S���S���̎�"},
			{"�j�R�E���r��","��","500000000","�T�E�U���h�T�j�[��","�n�i�n�i�̎�"},
			{"�|�[�g�K�XD�G�[�X","�j","550000000","���r�[�f�B�b�N��","���������̎�"},
			{"�o���g�����I","�j","200000000","�S�[�C���O���t�B�Z���p�C��","�o���o���̎�"},
			{"�L���x���f�B�b�V��","�j","280000000","�����X�̔��n��","�Ȃ�"},
			{"�A���r�_","��","330000000","Miss���u�_�b�N��","�X�x�X�x�̎�"}
		};

		String[][] nvyData = {
			{"�T�J�Y�L","�j","����","�}�O�}�O�̎�"},
			{"�{���T���[�m","�j","�叫","�s�J�s�J�̎�"},
			{"�X���[�J�[","�j","����","���N���N�̎�"},
			{"��","��","����","�E�H�V���E�H�V���̎�"}
		};		
		
		Pirate[] prtArray = new Pirate[prtData.length];
		for(int i=0;i<prtData.length;i++){
			prtArray[i] = new Pirate(prtData[i][0], 
									prtData[i][1],
									Long.parseLong(prtData[i][2]),
									prtData[i][3]);
			prtArray[i].eatFruits(prtData[i][4]);
		}
		Navy[] nvyArray = new Navy[nvyData.length];
		for(int i=0;i<nvyData.length;i++){
			nvyArray[i] = new Navy(nvyData[i][0], 
									nvyData[i][1],
									nvyData[i][2]);
			nvyArray[i].eatFruits(nvyData[i][3]);
		}
		
		System.out.println("***** �C���̃f�[�^��\�� *****");
		dispArray(prtArray);
		System.out.println("\n***** �C�R�̃f�[�^��\�� *****");
		dispArray(nvyArray);
		
	}
	
	public static void dispArray(Chara[] cArr){
		for(int i=0;i<cArr.length;i++){
			cArr[i].show();
			System.out.println("******************************");
		}
	}
}
