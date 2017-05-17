import java.io.*;
class Sample10x
{
	public static void main(String[] args)
	{
		double a,b,c;
		int d,e;
		
		for(int i=0;i<5;i++){
			a = Math.random();
			b = a*10;
			c = Math.floor(b);
			d = (int) c;
			e = d%3;
			if(e==0){
				System.out.println("0:™");
			}else if(e==1){
				System.out.println("1:š");
			}else if(e==2){
				System.out.println("2:ô");
			}
			
		}
	}
}