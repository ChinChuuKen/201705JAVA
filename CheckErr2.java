import java.io.*;

// 悪魔の実
interface Fruits2{
	void dispFruits();
	void eatFruits(String fName);
}

// superクラス
class Chara2 implements Fruits2{
	protected String name;
	protected String sex;
	protected String dFruits;
	
	public void setChara(String n, String sx){
		name = n;
		sex = sx;
	}
	public void show(){
		System.out.println("名前\t:" + name + "\n性別\t:" + sex);
	}
	public String getName(){
		return this.name;
	}
	public void dispFruits(){
		System.out.println("悪魔の実:" + dFruits);
	}
	public void eatFruits(String fn){
		dFruits = fn;
	}
}

// 海賊クラス
class Pirate2 extends Chara2{
	private long prize;
	private String shipName;
	
	public Pirate2(String n, String sx, long pz, String sNm){
		super.setChara(n, sx);
		prize = pz;
		shipName = sNm;
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
	}
}

// 海軍クラス
class Navy2 extends Chara2{
	private String grade;

	public Navy2(String n, String sx, String g){
		super.setChara(n, sx);
		grade = g;
	}
	public void show(){
		super.show();
		System.out.println("階級\t:" + grade);
	}
}

class CheckErr2
{
	public static void main(String[] args)throws IOException{
		//prtDataを作成、6個海賊のデータ(name,sex,賞金額,船の名前,悪魔の実)を格納
		String[][] prtData = {
			{"モンキーDルフィ","男","500000000","サウザンドサニー号","ゴムゴムの実"},
			{"ニコ・ロビン","女","500000000","サウザンドサニー号","ハナハナの実"},
			{"ポートガスDエース","男","550000000","モビーディック号","メラメラの実"},
			{"バルトロメオ","男","200000000","ゴーイングルフィセンパイ号","バリバリの実"},
			{"キャベンディッシュ","男","280000000","眠れる森の白馬号","なし"},
			{"アルビダ","女","330000000","Missラブダック号","スベスベの実"}
		};
		//nvyDataを作成、4個海軍のデータ(name,sex,階級,悪魔の実)を格納
		String[][] nvyData = {
			{"サカズキ","男","元帥","マグマグの実"},
			{"ボルサリーノ","男","大将","ピカピカの実"},
			{"スモーカー","男","中将","モクモクの実"},
			{"つる","女","中将","ウォシュウォシュの実"}
		};		
		
		//配列変数prtArrayを宣言、要素数がprtData.length(ここは5)を設定
		Chara2[] prtArray = new Pirate2[prtData.length];
		//prtArrayにのPirate2のデータ(インスタンス)を格納,
		for(int i=0;i<prtData.length;i++){
			prtArray[i] = new Pirate2(prtData[i][0], 
									prtData[i][1],
									Long.parseLong(prtData[i][2]),		//prtData[i][2]の値はlong型に変換
									prtData[i][3]);
			prtArray[i].eatFruits(prtData[i][4]);		//引数i行の最後のデータを指定し、eatFruits()を実行
		}
		//配列変数nvyArrayを宣言、要素数がnvyData.length(ここは4)を設定
		Chara2[] nvyArray = new Navy2[nvyData.length];
		//nvyArrayにNavy2のデータ(インスタンス)を格納,
		for(int i=0;i<nvyData.length;i++){
			nvyArray[i] = new Navy2(nvyData[i][0], 
									nvyData[i][1],
									nvyData[i][2]);
			nvyArray[i].eatFruits(nvyData[i][3]);		//引数i行の最後のデータを指定し、eatFruits()を実行
		}
		
		System.out.println("どちらのデータを表示しますか？\n表示したいデータの番号を入力してください。\n0:海賊\t1:海軍");
		
		
		/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int sel = Integer.parseInt(br.readLine());
			Chara2[] chArr;
			String dtype;
	        //入力が0の場合、dtypeの値は"海賊"、chArrの値はprtArray
			//入力が1の場合、dtypeの値は"海軍"、chArrの値はnvyArray
			if(sel == 0){
				dtype = "海賊";
				chArr = prtArray;
			}else{
				dtype = "海軍";
				chArr = nvyArray;
			}System.out.println("***** "+dtype+"のデータを表示します。 *****");
				System.out.println("誰のデータを表示しますか？\n表示したい人物の番号を入力してください。\n"+
					"全員分表示する場合は全員(99)を入力してください。");
				dispNameList(chArr, sel);		//引数chArrの値(配列の名前)とselの値(0か1)を指定し,dispNameList()を実行
				sel = Integer.parseInt(br.readLine());
				dispData(chArr, sel);			//引数chArrの値(配列の名前)とselの値(人物の番号か99)を指定し,dispData()を実行
		*/
		try{
			try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int sel = Integer.parseInt(br.readLine());
				Chara2[] chArr;
				String dtype;
		        //入力が0の場合、dtypeの値は"海賊"、chArrの値はprtArray
				//入力が1の場合、dtypeの値は"海軍"、chArrの値はnvyArray
				if(sel == 0){
					dtype = "海賊";
					chArr = prtArray;
					System.out.println("***** "+dtype+"のデータを表示します。 *****");
					System.out.println("誰のデータを表示しますか？\n表示したい人物の番号を入力してください。\n"+
						"全員分表示する場合は全員(99)を入力してください。");
					dispNameList(chArr, sel);		//引数chArrの値(配列の名前)とselの値(0か1)を指定し,dispNameList()を実行
					sel = Integer.parseInt(br.readLine());
					dispData(chArr, sel);			//引数chArrの値(配列の名前)とselの値(人物の番号か99)を指定し,dispData()を実行
				}else if(sel == 1){
					dtype = "海軍";
					chArr = nvyArray;
					System.out.println("***** "+dtype+"のデータを表示します。 *****");
					System.out.println("誰のデータを表示しますか？\n表示したい人物の番号を入力してください。\n"+
						"全員分表示する場合は全員(99)を入力してください。");
					dispNameList(chArr, sel);		//引数chArrの値(配列の名前)とselの値(0か1)を指定し,dispNameList()を実行
					sel = Integer.parseInt(br.readLine());
					dispData(chArr, sel);			//引数chArrの値(配列の名前)とselの値(人物の番号か99)を指定し,dispData()を実行
				}else{
					System.out.println("必要な範囲のデータを入力してください!");
			}
			}catch(NumberFormatException e){
				System.out.println("必要なデータ(数字)を入力してください!");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("必要な範囲のデータを入力してください!");
	    }finally{}
	}
	//メソッド―dispDataを宣言
	//selの値は人物の番号の場合、人物のデータを表示,
	//selの値は99の場合、全部海賊人物(chArrの値はprtArrayの場合)のデータを表示
	//selの値は99の場合、全部海軍人物(chArrの値はnvyArrayの場合)のデータを表示
	public static void dispData(Chara2[] cArr, int dSel){
		if(dSel == 99){
			for(int i=0;i<cArr.length;i++){
				cArr[i].show();		//全部人物のデータを表示
				System.out.println("******************************");
			}
		}else{
			cArr[dSel].show();		//選択の人物のデータを表示
		}
	}
	//メソッド―dispNameListを宣言、海賊か海軍の名前を全部で表示
	public static void dispNameList(Chara2[] cArr,int dSel){
		String str = "";
		for(int i=0;i<cArr.length;i++){
			str += i +" : "+ cArr[i].getName() + " \n";		//i番目の人の名前
		}
		System.out.println(str);
	}
}
