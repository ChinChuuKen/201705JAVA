package Exercise;

import java.io.*;

class Monsterx{
	String type;
	int atk;
	int def;
	String atr;

	public Monsterx() {
		
	}

	public void createMonster(String at, int aa, int ad, String aat) {
		type = at;
		atk = aa;
		def = ad;
		atr = aat;
	}

	String getType() {
		return type;
	}

	int getAtk() {
		return atk;
	}

	int getDef() {
		return def;
	}

	String getAtr() {
		return atr;
	}
}

public class Exercise3x {
	public static void main(String[] args) throws IOException {
		String[] types={"バハムート","リバイアサン","オーディン","タイタン"};
		int[] atks={9000,7800,8500,6800};
		int[] defs={8000,9000,8500,9200};
		String[] atrs={"炎","水","気","土"};
		String outOfBounds="処理対象外の値入力されています。\n再入力してください。";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Monster[] mons = new Monster[2];
		int num=0;
		int i=0;
		while(i<mons.length){
			System.out.println((i+1)+"体目に作成するモンスターの番号お選択してください");
			try{
				int input=Integer.parseInt(br.readLine());
				if(input==num){
					System.out.println("処理対象外の値入力されています。\n再入力してください。");
					continue;
				}
				mons[i]=new Monster();
				mons[i].createMonster(types[input-1], atks[input-1], 
						defs[input-1], atrs[input-1]);
				num=input;
				i++;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(outOfBounds);
			}catch(NumberFormatException e){
				System.out.println(outOfBounds);
			}
		}
		for (int i1 = 0; i1 < mons.length; i1++) {
			System.out.println("***"+(i1+1)+"体目のモンスター***種別:" 
					+ mons[i1].getType() + "\n***"
					+(i1+1)+"体目のモンスター***攻撃力:"
					+ mons[i1].getAtk() + 
					"\n***"+(i1+1)+"体目のモンスター***守備力:" + mons[i1].getDef()
					+"\n***"+(i1+1)+"体目のモンスター***属性:" + mons[i1].getAtr());
			System.out.println();
			
		}
	}
}	