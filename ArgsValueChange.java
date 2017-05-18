class ArgsValueChange{
	//static int num;
	public static void add(int n){
		//int num = a+10;
		n+=10;
	}
	public static void add2(int[] n){
		n[0]+=10;
	}
	
	public static void main(String[] args){
		
		int num = 10;
		int[] num2 = {10};
		
		System.out.println("****メソッド実行前****");
		System.out.println("num=>"+num);
		System.out.println("num2=>"+num2[0]);
		
		add(num);
		add2(num2);
		
		System.out.println("****メソッド実行後****");
		System.out.println("num=>"+num);
		System.out.println("num2=>"+num2[0]);
	}
}