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
		monsters[0].createMonster("�o�n���[�g", 9000, 8000, "��");
		monsters[1].createMonster("���o�C�A�T��", 7800, 9000, "��");
		monsters[2].createMonster("�I�[�f�B��", 8500, 8500, "�C");
		monsters[3].createMonster("�^�C�^��", 6800, 9200, "�y");
		System.out.println("1�̖ڂɍ쐬���郂���X�^�[�̔ԍ����I�����Ă�������");
		System.out.println("1:�o�n���[�g\n2:���o�C�A�T��\n3:�I�[�f�B��\n4:�^�C�^��");
		int num1;
		num1 = Integer.parseInt(br.readLine());
		if (num1 == 1 || num1 == 2 || num1 == 3 || num1 == 4) {
			System.out.println("***1�̖ڂ̃����X�^�[***���:" + monsters[num1-1].getType() + "\n***1�̖ڂ̃����X�^�[***�U����:"
					+ monsters[num1-1].getAtk() + "\n***1�̖ڂ̃����X�^�[***�����:" + monsters[num1-1].getDef()
					+ "\n***1�̖ڂ̃����X�^�[***����:" + monsters[num1-1].getAtr());
		} else {
			int num2;
			do {
				System.out.println("�����ΏۊO�̒l���͂���Ă��܂��B\n�ē��͂��Ă��������B");
				num2 = Integer.parseInt(br.readLine());
			} while (num2 != 1 && num2 != 2 && num2 != 3 && num2 != 4);
			System.out.println("***1�̖ڂ̃����X�^�[***���:" + monsters[num2-1].getType() + "\n***1�̖ڂ̃����X�^�[***�U����:"
					+ monsters[num2-1].getAtk() + "\n***1�̖ڂ̃����X�^�[***�����:" + monsters[num2-1].getDef()
					+ "\n***1�̖ڂ̃����X�^�[***����:" + monsters[num2-1].getAtr());
			num1 = num2;
		}

		System.out.println("\n2�̖ڂɍ쐬���郂���X�^�[�̔ԍ����I�����Ă�������");
		System.out.println("1:�o�n���[�g\n2:���o�C�A�T��\n3:�I�[�f�B��\n4:�^�C�^��");
		int num3 = Integer.parseInt(br.readLine());
		if (num3 != num1) {
			if (num3 == 1 || num3 == 2 || num3 == 3 || num3 == 4) {
				System.out.println("***2�̖ڂ̃����X�^�[***���:" + monsters[num3-1].getType() + "\n***2�̖ڂ̃����X�^�[***�U����:"
						+ monsters[num3-1].getAtk() + "\n***2�̖ڂ̃����X�^�[***�����:" + monsters[num3-1].getDef()
						+ "\n***2�̖ڂ̃����X�^�[***����:" + monsters[num3-1].getAtr());
			} else {
				int num2;
				do {
					System.out.println("�����ΏۊO�̒l���͂���Ă��܂��B\n�ē��͂��Ă��������B");
					num2 = Integer.parseInt(br.readLine());
				} while (num2 != 1 && num2 != 2 && num2 != 3 && num2 != 4);
				System.out.println("***1�̖ڂ̃����X�^�[***���:" + monsters[num2-1].getType() + "\n***2�̖ڂ̃����X�^�[***�U����:"
						+ monsters[num2-1].getAtk() + "\n***2�̖ڂ̃����X�^�[***�����:" + monsters[num2-1].getDef()
						+ "\n***2�̖ڂ̃����X�^�[***����:" + monsters[num2-1].getAtr());
			}
		} else {
			int num4;
			do {
				System.out.println("���̃����X�^�[�͊�����Ă��܂��B\n�ʂ̃����X�^�[���w�肵�Ă��������B");
				num4 = Integer.parseInt(br.readLine());
			} while ((num4 != 1 && num4 != 2 && num4 != 3 && num4 != 4 )|| num4 == num1);
			System.out.println("***2�̖ڂ̃����X�^�[***���:" + monsters[num4-1].getType() + "\n***2�̖ڂ̃����X�^�[***�U����:"
					+ monsters[num4-1].getAtk() + "\n***2�̖ڂ̃����X�^�[***�����:" + monsters[num4-1].getDef()
					+ "\n***2�̖ڂ̃����X�^�[***����:" + monsters[num4-1].getAtr());
		}
	}
}
