package Exersice;

class Student {
	int no;
	String name;
	double n_lang_P, e_lang_P, matn_P, sum, avg;

	public void setStudent(int an, String anm, double np, double ep, double mp) {
		no = an;
		name = anm;
		n_lang_P = np;
		e_lang_P = ep;
		matn_P = mp;
	}

	public void calcVal() {
		sum = n_lang_P + e_lang_P + matn_P;
		avg = sum / 3;
	}

	public void showPoint() {
		System.out.println("�ԍ�:\t" + no + "\n���O:\t" + name + "\n����_��:" + n_lang_P + "\n�p��_��:" + e_lang_P
				+ "\n���w�_��:" + matn_P + "\n���v�_��:" + sum + "\n���ϓ_��:" + avg+"\n");
	}
}

public class Exersice4 {
	public static void main(String[] args) {
		Student[] students = new Student[2];
		for (int i = 0; i < 2; i++) {
			students[i] = new Student();
		}
		students[0].setStudent(2001, "������", 95, 92, 93);
		students[1].setStudent(2002, "������", 89, 94, 90);

		for (int i = 0; i < 2; i++) {
			students[i].calcVal();
			students[i].showPoint();
		}
	}
}
