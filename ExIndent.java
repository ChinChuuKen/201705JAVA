class ExIndent{
	public static void main(String[] args){
		int a=10;
		if(a==5){
			System.out.println("a==>5");
		}
		else{
			System.out.println("a not 5");
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
				System.out.println("j=>"+j);
			}
		}
		int x=0;
		while(x<3){
			System.out.println("x=>"+x);
			x++;
		}
	}	
}


