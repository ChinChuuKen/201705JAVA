class ArgsValueChange{
	public static void add(int a){
			int num = a+10;
	}
	public static void add1(int[] b){
			num1[0]=b+10;
	}
	
	public static void main(String[] args){
		
		int num = 10;
		int[] num1= {10};
		
		System.out.println("****���\�b�h���s�O****");
		System.out.println("num=>"+num);
		System.out.println("num1=>"+num1[0]);
		
		add(num);
		add1(num);
		
		System.out.println("****���\�b�h���s��****");
		System.out.println("num=>"+num);
		System.out.println("num1=>"+num[0]);
		
		
	}
}