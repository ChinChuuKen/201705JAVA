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
			
		System.out.println("***学生情報を作成しなすか(Y/N)***");
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
				
				System.out.println("作成する学生の氏名を入力してください");
				String nstr=br.readLine();
				System.out.println("作成する学生の国語の点数を入力してください");
				String rstr=br.readLine();
				rnum=Double.parseDouble(rstr);
				System.out.println("作成する学生の英語の点数を入力してください");
				String estr=br.readLine();
				ennum=Double.parseDouble(estr);
				System.out.println("作成する学生の数学の点数を入力してください");
				String mstr=br.readLine();
				mnum=Double.parseDouble(mstr);
				students[i].setStudent(i,nstr,rnum,ennum,mnum);
				students[i].calcVal();
				System.out.println(students[i].getName()+"さん:番号"
						+students[i].getNo()+"番:国語"
						+students[i].getNatureLangPoint()+"点:英語"
						+students[i].getEnglishLangPoint()+"点:数学"
						+students[i].getMathPoint()+"点:合計"
						+students[i].getSum()+"点:平均"
						+students[i].getAvg()+"点\n学生の人数"
						+snum+"人:全体合計"+ssum+"点:全体平均"+ssum/snum+"点");
			}else{
				System.out.println(students[i].getName()+"さん:番号"
						+students[i].getNo()+"番:国語"
						+students[i].getNatureLangPoint()+"点:英語"
						+students[i].getEnglishLangPoint()+"点:数学"
						+students[i].getMathPoint()+"点:合計"
						+students[i].getSum()+"点:平均"
						+students[i].getAvg()+"点\n学生の人数"
						+snum+"人:全体合計"+ssum+"点:全体平均"+ssum/snum+"点");
			}
		}else{
			do{
			System.out.println("【入力値エラー】入力された値は無効");
			System.out.println("***学生情報を作成しなすか(Y/N)***");
			//String str1=br.readLine();
			}while(!(str.equals("Y"))||!(str.equals("N")));
			if(str.equals("Y")||str.equals("N")){
				
			}
		}
		}
		
	}
}
