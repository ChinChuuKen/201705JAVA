package Exercise;

import java.io.*;

class Studentx {
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

public class Exercise4x {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Studentx[] students=new Studentx[10];
		for(int i=0;i<10;i++){
			students[i]=new Studentx();
			}
		System.out.println("***学生情報を作成しなすか(Y/N)***");
		String str=br.readLine();
		int x=0;		//学生の番号
		int snum = 0;	//学生の人数
		double ssum=0;	//全体合計点数
		double rnum=0;	//国語の点数
		double ennum=0;	//英語の点数
		double mnum=0;	//数学の点数
		String str1="";
		if(str.equals("Y")||str.equals("y")){
			try{
				while((str.equals("Y")||str.equals("y"))&&x<students.length){
					System.out.println("作成する学生の氏名を入力してください");
					String nstr=br.readLine();
					if(nstr.equals("N")||nstr.equals("n")){
						System.out.println("今回学生情報は作成されませんでした。");
						break;
					}
					System.out.println("作成する学生の国語の点数を入力してください");
					String rstr=br.readLine();
					rnum=Double.parseDouble(rstr);
					if(rstr.equals("N")||rstr.equals("n")){
						System.out.println("今回学生情報は作成されませんでした。");
						break;
					}
					System.out.println("作成する学生の英語の点数を入力してください");
					String estr=br.readLine();
					ennum=Double.parseDouble(estr);
					if(estr.equals("N")||estr.equals("n")){
						System.out.println("今回学生情報は作成されませんでした。");
						break;
					}
					System.out.println("作成する学生の数学の点数を入力してください");
					String mstr=br.readLine();
					mnum=Double.parseDouble(mstr);
					if(mstr.equals("N")||mstr.equals("n")){
						System.out.println("今回学生情報は作成されませんでした。");
						break;
					}else{
						x++;
						snum++;
						ssum+=rnum+ennum+mnum;
						students[x].setStudent(x,nstr,rnum,ennum,mnum);
						students[x].calcVal();
						System.out.println("***学生情報を作成しなすか(Y/N)***");
						str1=br.readLine();
						while(str1.equals("N")||str1.equals("n")){
							System.out.println("処理終了");
							break;
						}
						str=str1;
						System.out.println();
					}
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("【入力値エラー】入力された値は無効");
			}catch(java.lang.NumberFormatException e){
				System.out.println("学生情報は作成されませんでした。");
			}
		}else if(str.equals("N")||str.equals("n")){
			System.out.println("学生情報は作成されませんでした");
		}else{
			System.out.println("【入力値エラー】入力された値は無効");
		}
		for(int y=1;y<=x;y++)
		System.out.println(students[y].getName()+"さん:番号"
				+students[y].getNo()+"番:国語"
				+students[y].getNatureLangPoint()+"点:英語"
				+students[y].getEnglishLangPoint()+"点:数学"
				+students[y].getMathPoint()+"点:合計"
				+students[y].getSum()+"点:平均"
				+students[y].getAvg()+"点\n学生の人数"
				+snum+"人:全体合計"+ssum+"点:全体平均"+ssum/snum+"点");
	}
}
