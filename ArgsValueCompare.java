class ArgsValueChange{
	public static void add(int a){
			num = a+10;
	}
	
	public static void main(String[] args){
		
		int num = 10;
		
		System.out.println("****メソッド実行前****");
		System.out.println("num=>"+num);
		
		add(num);
		
		System.out.println("****メソッド実行後****");
		System.out.println("num=>"+num);
		
		
		
	}
}