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
		System.out.println("番号:\t" + no + "\n名前:\t" + name + "\n国語点数:" + n_lang_P + "\n英語点数:" + e_lang_P
				+ "\n数学点数:" + matn_P + "\n合計点数:" + sum + "\n平均点数:" + avg+"\n");
	}
}

public class Exersice4 {
	public static void main(String[] args) {
		Student[] students = new Student[2];
		for (int i = 0; i < 2; i++) {
			students[i] = new Student();
		}
		students[0].setStudent(2001, "あああ", 95, 92, 93);
		students[1].setStudent(2002, "いいい", 89, 94, 90);

		for (int i = 0; i < 2; i++) {
			students[i].calcVal();
			students[i].showPoint();
		}
	}
}
