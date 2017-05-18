class StringValueCompare{
	public static void main(String[] args){
		
		System.out.println("**** new演算子を使わず直接Stringインスタンスを作成した場合 ****");
		
		String str_a = new String("LUFFY");
		String str_b = new String("LUFFY");
		
		System.out.println("**** 変数str_aおよびstr_bの値を表示 ****");
		System.out.println("str_a =>"+str_a);
		System.out.println("str_b =>"+str_b);
		System.out.println();
		
		//比較演算子を使用した比較
		System.out.println("**** 比較演算子を使用した比較 ****");
		if(str_a == str_b){
			System.out.println("str_aとstr_bは等しいです。");
		}else{
			System.out.println("str_aとstr_bは等しくありません。");
		}
		System.out.println();
		
		//equealsを使用した比較
		System.out.println("**** equalsメソツドを使用した比較 ****");
		if(str_a.equals(str_b)){
			System.out.println("str_aとstr_bは等しいです。");
		}else{
			System.out.println("str_aとstr_bは等しくありません。");
		}
		System.out.println("\n\n\n");
		
		System.out.println("**** new演算子Stringインスタンスを作成した場合 ****");
		
		String str_x = "ZORO";
		String str_y = "ZORO";
		
		System.out.println("**** 変数str_xおよびstr_yの値を表示 ****");
		System.out.println("str_x =>"+str_x);
		System.out.println("str_y =>"+str_y);
		System.out.println();
		
		//比較演算子を使用した比較
		System.out.println("**** 比較演算子を使用した比較 ****");
		if(str_x == str_y){
			System.out.println("str_xとstr_yは等しいです。");
		}else{
			System.out.println("str_xとstr_yは等しくありません。");
		}
		System.out.println();
		
		//equealsを使用した比較
		System.out.println("**** equalsメソツドを使用した比較 ****");
		if(str_x.equals(str_y)){
			System.out.println("str_xとstr_yは等しいです。");
		}else{
			System.out.println("str_xとstr_yは等しくありません。");
		}
		System.out.println("\n\n\n");
		
		
		System.out.println("**** new演算子を使用した変数とnew演算子を使わない変数からStringインスタンスを作成した場合 ****");
		
		String str_c = new String("NAMI");
		String str_d = "NAMI";
		
		System.out.println("**** 変数str_cおよびstr_dの値を表示 ****");
		System.out.println("str_c =>"+str_c);
		System.out.println("str_d =>"+str_d);
		System.out.println();
		
		//比較演算子を使用した比較
		System.out.println("**** 比較演算子を使用した比較 ****");
		if(str_c == str_d){
			System.out.println("str_cとstr_dは等しいです。");
		}else{
			System.out.println("str_cとstr_dは等しくありません。");
		}
		System.out.println();
		
		
		//equealsメソッドを使用した比較
		System.out.println("**** equalsメソッドを使用した比較 ****");
		if(str_c.equals(str_d)){
			System.out.println("str_cとstr_dは等しいです。");
		}else{
			System.out.println("str_cとstr_dは等しくありません。");
		}
		System.out.println("\n\n\n");
		
	}
}