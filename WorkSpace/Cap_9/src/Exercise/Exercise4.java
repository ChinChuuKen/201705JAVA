package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	int getNo() {
		return no;
	}
	String getName() {
		return name;
	}
	double getNatureLangPoint() {
		return n_lang_P;
	}
	double getEnglishLangPoint() {
		return e_lang_P;
	}
	double getMathPoint() {
		return matn_P;
	}
	double getSum() {
		return sum;
	}
	double getAvg() {
		return avg;
	}
}

public class Exercise4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Studentx[] students=new Studentx[10];
		for(int i=0;i<10;i++){
			students[i]=new Studentx();
			
		System.out.println("***�w�������쐬���Ȃ���(Y/N)***");
		String str=br.readLine();
		
		if(str.equals("Y")||str.equals("N")){
			int snum = 0;
			double ssum=0;
			double rnum=0;
			double ennum=0;
			double mnum=0;
			snum++;
			ssum+=rnum+ennum+mnum;
			if(str.equals("Y")){
				
				System.out.println("�쐬����w���̎�������͂��Ă�������");
				String nstr=br.readLine();
				System.out.println("�쐬����w���̍���̓_������͂��Ă�������");
				String rstr=br.readLine();
				rnum=Double.parseDouble(rstr);
				System.out.println("�쐬����w���̉p��̓_������͂��Ă�������");
				String estr=br.readLine();
				ennum=Double.parseDouble(estr);
				System.out.println("�쐬����w���̐��w�̓_������͂��Ă�������");
				String mstr=br.readLine();
				mnum=Double.parseDouble(mstr);
				students[i].setStudent(i,nstr,rnum,ennum,mnum);
				students[i].calcVal();
				System.out.println(students[i].getName()+"����:�ԍ�"
						+students[i].getNo()+"��:����"
						+students[i].getNatureLangPoint()+"�_:�p��"
						+students[i].getEnglishLangPoint()+"�_:���w"
						+students[i].getMathPoint()+"�_:���v"
						+students[i].getSum()+"�_:����"
						+students[i].getAvg()+"�_\n�w���̐l��"
						+snum+"�l:�S�̍��v"+ssum+"�_:�S�̕���"+ssum/snum+"�_");
			}else{
				System.out.println(students[i].getName()+"����:�ԍ�"
						+students[i].getNo()+"��:����"
						+students[i].getNatureLangPoint()+"�_:�p��"
						+students[i].getEnglishLangPoint()+"�_:���w"
						+students[i].getMathPoint()+"�_:���v"
						+students[i].getSum()+"�_:����"
						+students[i].getAvg()+"�_\n�w���̐l��"
						+snum+"�l:�S�̍��v"+ssum+"�_:�S�̕���"+ssum/snum+"�_");
			}
		}else{
			do{
			System.out.println("�y���͒l�G���[�z���͂��ꂽ�l�͖���");
			System.out.println("***�w�������쐬���Ȃ���(Y/N)***");
			//String str1=br.readLine();
			}while(!(str.equals("Y"))||!(str.equals("N")));
			if(str.equals("Y")||str.equals("N")){
				
			}
		}
		}
		
	}
}
