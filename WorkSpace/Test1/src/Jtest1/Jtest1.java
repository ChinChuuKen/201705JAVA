package Jtest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Food {
	String type;
	String name;
	double price;

	public void setFood(String at, double ap, String an) {
		type = at;
		name = an;
		price = ap;
	}

	public void show() {
		System.out.println("���\t:" + type + "\n���O\t:" + name + "\n���i\t:" + price);
	}
}

class Fruit extends Food {
	String taste; 
	String effect;

	public Fruit(String at, String an, double ap, String ate, String ae) {
		super.setFood(at, ap, an);
		taste = ate;
		effect = ae;
	}
	public void show() {
		super.show();
		System.out.println("��\t:" + taste + "\n���\\t:" + effect);
	}
}

class Vegetables extends Food {
	String local; 
	String g_time;

	public Vegetables(String at, String an, double ap, String al, String ag) {
		super.setFood(at, ap, an);
		local = al;
		g_time = ag;
	}

	public void show() {
		super.show();
		System.out.println("�Y�n\t:" + local + "\n����\t:" + g_time);
	}
}


public class Jtest1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[][] fru = { {"�ʕ�", "�o�i�i", "215","�Â�", "�������̊ɘa" }, 
				{"�ʕ�", "�����S", "390","�Â�", "�_�C�G�b�g" },
				{"�ʕ�", "�C�`�S","400", "�Â�", "����" }, 
				{"�ʕ�", "����", "500","�Â�", "�G�l���M�[�⋋" } };
		String[][] veg = { { "���", "�卪", "180","�_�ސ쌧", "3����" },
				{ "���", "�W���K�C��","200", "��B", "3����" },
				{ "���", "�Z����","300", "�É���", "2����" },
				{ "���", "�g�}�g", "400","�F�{��", "3����" } };
		
		System.out.println("***�������H�ו���I�����Ă��������B***\n0:�ʕ�\t1:���\t2:�Ȃ�/�I��");
		String str=br.readLine();
		int num1=Integer.parseInt(str);
		if(num1==0){
			System.out.println("***�������ʕ���I�����Ă��������B***");
			int num11=Integer.parseInt(br.readLine());
			if(num11==1){
				System.out.println();
			}else if(num11==2){
				
			}else if(num11==3){
				
			}else if(num11==4){
				
			}else{
				
			}
		}else if(num1==1){
			
		}else if(num1==2){
			
		}
	}
}
