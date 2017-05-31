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
		System.out.println("***�w�������쐬���Ȃ���(Y/N)***");
		String str=br.readLine();
		int x=0;		//�w���̔ԍ�
		int snum = 0;	//�w���̐l��
		double ssum=0;	//�S�̍��v�_��
		double rnum=0;	//����̓_��
		double ennum=0;	//�p��̓_��
		double mnum=0;	//���w�̓_��
		String str1="";
		if(str.equals("Y")||str.equals("y")){
			try{
				while((str.equals("Y")||str.equals("y"))&&x<students.length){
					System.out.println("�쐬����w���̎�������͂��Ă�������");
					String nstr=br.readLine();
					if(nstr.equals("N")||nstr.equals("n")){
						System.out.println("����w�����͍쐬����܂���ł����B");
						break;
					}
					System.out.println("�쐬����w���̍���̓_������͂��Ă�������");
					String rstr=br.readLine();
					rnum=Double.parseDouble(rstr);
					if(rstr.equals("N")||rstr.equals("n")){
						System.out.println("����w�����͍쐬����܂���ł����B");
						break;
					}
					System.out.println("�쐬����w���̉p��̓_������͂��Ă�������");
					String estr=br.readLine();
					ennum=Double.parseDouble(estr);
					if(estr.equals("N")||estr.equals("n")){
						System.out.println("����w�����͍쐬����܂���ł����B");
						break;
					}
					System.out.println("�쐬����w���̐��w�̓_������͂��Ă�������");
					String mstr=br.readLine();
					mnum=Double.parseDouble(mstr);
					if(mstr.equals("N")||mstr.equals("n")){
						System.out.println("����w�����͍쐬����܂���ł����B");
						break;
					}else{
						x++;
						snum++;
						ssum+=rnum+ennum+mnum;
						students[x].setStudent(x,nstr,rnum,ennum,mnum);
						students[x].calcVal();
						System.out.println("***�w�������쐬���Ȃ���(Y/N)***");
						str1=br.readLine();
						while(str1.equals("N")||str1.equals("n")){
							System.out.println("�����I��");
							break;
						}
						str=str1;
						System.out.println();
					}
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�y���͒l�G���[�z���͂��ꂽ�l�͖���");
			}catch(java.lang.NumberFormatException e){
				System.out.println("�w�����͍쐬����܂���ł����B");
			}
		}else if(str.equals("N")||str.equals("n")){
			System.out.println("�w�����͍쐬����܂���ł���");
		}else{
			System.out.println("�y���͒l�G���[�z���͂��ꂽ�l�͖���");
		}
		for(int y=1;y<=x;y++)
		System.out.println(students[y].getName()+"����:�ԍ�"
				+students[y].getNo()+"��:����"
				+students[y].getNatureLangPoint()+"�_:�p��"
				+students[y].getEnglishLangPoint()+"�_:���w"
				+students[y].getMathPoint()+"�_:���v"
				+students[y].getSum()+"�_:����"
				+students[y].getAvg()+"�_\n�w���̐l��"
				+snum+"�l:�S�̍��v"+ssum+"�_:�S�̕���"+ssum/snum+"�_");
	}
}
