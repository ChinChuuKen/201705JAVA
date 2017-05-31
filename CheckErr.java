// 悪魔の実
interface Fruits{
	void dispFruits();
	void eatFruits(String fName);
}

// superクラス
class Chara {
	protected String name;
	protected String sex;
	
	public void setChara(String n, String sx){
		name = n;
		sex = sx;
	}
	public void show(){
		System.out.println("名前\t:" + name +"\n性別\t:"+ sex);
	}
	public String getName(){
		return this.name;
	}
}

// 海賊クラス
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
		System.out.println("悪魔の実:" + dFruits);
	}
	public void eatFruits(String fn){
		dFruits = fn;
	}
	public void dispPrize(){
		System.out.println("賞金額:" + prize + "ベリー");
	}
	public void dispShipName(){
		System.out.println("船の名前は:" + shipName);
	}
	public void show(){
		super.show();
		System.out.println("船の名前:" + shipName + "\n賞金額\t:" +
						prize + "ベリー");
		this.dispFruits();
	}
}

// 海軍クラス
class Navy extends Chara{
	private String grade;
	private String dFruits;

	public Navy(String n, String sx, String g){
		super.setChara(n, sx);
		grade = g;
	}
	public void dispFruits(){
		System.out.println("悪魔の実:" + dFruits);
	}
	public void eatFruits(String fName){
		dFruits = fName;
	}
	public void show(){
		super.show();
		System.out.println("階級\t:" + grade);
		this.dispFruits();
	}
}

class CheckErr
{
	public static void main(String[] args){
		String[][] prtData = {
			{"モンキーDルフィ","男","500000000","サウザンドサニー号","ゴムゴムの実"},
			{"ニコ・ロビン","女","500000000","サウザンドサニー号","ハナハナの実"},
			{"ポートガスDエース","男","550000000","モビーディック号","メラメラの実"},
			{"バルトロメオ","男","200000000","ゴーイングルフィセンパイ号","バリバリの実"},
			{"キャベンディッシュ","男","280000000","眠れる森の白馬号","なし"},
			{"アルビダ","女","330000000","Missラブダック号","スベスベの実"}
		};

		String[][] nvyData = {
			{"サカズキ","男","元帥","マグマグの実"},
			{"ボルサリーノ","男","大将","ピカピカの実"},
			{"スモーカー","男","中将","モクモクの実"},
			{"つる","女","中将","ウォシュウォシュの実"}
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
		
		System.out.println("***** 海賊のデータを表示 *****");
		dispArray(prtArray);
		System.out.println("\n***** 海軍のデータを表示 *****");
		dispArray(nvyArray);
		
	}
	
	public static void dispArray(Chara[] cArr){
		for(int i=0;i<cArr.length;i++){
			cArr[i].show();
			System.out.println("******************************");
		}
	}
}
