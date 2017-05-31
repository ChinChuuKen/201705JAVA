package Exercise;

import java.io.*;

class Monster {
	String type;
	int atk;
	int def;
	String atr;

	public Monster() {
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

public class Exercise3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Monsterx[] monsters = new Monsterx[4];
		for (int i = 0; i < 4; i++) {
			monsters[i] = new Monsterx();
		}
		monsters[0].createMonster("バハムート", 9000, 8000, "炎");
		monsters[1].createMonster("リバイアサン", 7800, 9000, "水");
		monsters[2].createMonster("オーディン", 8500, 8500, "気");
		monsters[3].createMonster("タイタン", 6800, 9200, "土");
		System.out.println("1体目に作成するモンスターの番号お選択してください");
		System.out.println("1:バハムート\n2:リバイアサン\n3:オーディン\n4:タイタン");
		int num1;
		num1 = Integer.parseInt(br.readLine());
		if (num1 == 1 || num1 == 2 || num1 == 3 || num1 == 4) {
			System.out.println("***1体目のモンスター***種別:" + monsters[num1-1].getType() + "\n***1体目のモンスター***攻撃力:"
					+ monsters[num1-1].getAtk() + "\n***1体目のモンスター***守備力:" + monsters[num1-1].getDef()
					+ "\n***1体目のモンスター***属性:" + monsters[num1-1].getAtr());
		} else {
			int num2;
			do {
				System.out.println("処理対象外の値入力されています。\n再入力してください。");
				num2 = Integer.parseInt(br.readLine());
			} while (num2 != 1 && num2 != 2 && num2 != 3 && num2 != 4);
			System.out.println("***1体目のモンスター***種別:" + monsters[num2-1].getType() + "\n***1体目のモンスター***攻撃力:"
					+ monsters[num2-1].getAtk() + "\n***1体目のモンスター***守備力:" + monsters[num2-1].getDef()
					+ "\n***1体目のモンスター***属性:" + monsters[num2-1].getAtr());
			num1 = num2;
		}

		System.out.println("\n2体目に作成するモンスターの番号お選択してください");
		System.out.println("1:バハムート\n2:リバイアサン\n3:オーディン\n4:タイタン");
		int num3 = Integer.parseInt(br.readLine());
		if (num3 != num1) {
			if (num3 == 1 || num3 == 2 || num3 == 3 || num3 == 4) {
				System.out.println("***2体目のモンスター***種別:" + monsters[num3-1].getType() + "\n***2体目のモンスター***攻撃力:"
						+ monsters[num3-1].getAtk() + "\n***2体目のモンスター***守備力:" + monsters[num3-1].getDef()
						+ "\n***2体目のモンスター***属性:" + monsters[num3-1].getAtr());
			} else {
				int num2;
				do {
					System.out.println("処理対象外の値入力されています。\n再入力してください。");
					num2 = Integer.parseInt(br.readLine());
				} while (num2 != 1 && num2 != 2 && num2 != 3 && num2 != 4);
				System.out.println("***1体目のモンスター***種別:" + monsters[num2-1].getType() + "\n***2体目のモンスター***攻撃力:"
						+ monsters[num2-1].getAtk() + "\n***2体目のモンスター***守備力:" + monsters[num2-1].getDef()
						+ "\n***2体目のモンスター***属性:" + monsters[num2-1].getAtr());
			}
		} else {
			int num4;
			do {
				System.out.println("そのモンスターは既されています。\n別のモンスターを指定してください。");
				num4 = Integer.parseInt(br.readLine());
			} while ((num4 != 1 && num4 != 2 && num4 != 3 && num4 != 4 )|| num4 == num1);
			System.out.println("***2体目のモンスター***種別:" + monsters[num4-1].getType() + "\n***2体目のモンスター***攻撃力:"
					+ monsters[num4-1].getAtk() + "\n***2体目のモンスター***守備力:" + monsters[num4-1].getDef()
					+ "\n***2体目のモンスター***属性:" + monsters[num4-1].getAtr());
		}
	}
}
