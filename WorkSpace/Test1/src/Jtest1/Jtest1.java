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
		System.out.println("種類\t:" + type + "\n名前\t:" + name + "\n価格\t:" + price);
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
		System.out.println("味\t:" + taste + "\n効能\t:" + effect);
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
		System.out.println("産地\t:" + local + "\n時間\t:" + g_time);
	}
}


public class Jtest1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[][] fru = { {"果物", "バナナ", "215","甘い", "高血圧の緩和" }, 
				{"果物", "リンゴ", "390","甘い", "ダイエット" },
				{"果物", "イチゴ","400", "甘い", "美白" }, 
				{"果物", "モモ", "500","甘い", "エネルギー補給" } };
		String[][] veg = { { "野菜", "大根", "180","神奈川県", "3か月" },
				{ "野菜", "ジャガイモ","200", "九州", "3か月" },
				{ "野菜", "セロリ","300", "静岡県", "2か月" },
				{ "野菜", "トマト", "400","熊本県", "3か月" } };
		
		System.out.println("***買った食べ物を選択してください。***\n0:果物\t1:野菜\t2:なし/終了");
		String str=br.readLine();
		int num1=Integer.parseInt(str);
		if(num1==0){
			System.out.println("***買った果物を選択してください。***");
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
