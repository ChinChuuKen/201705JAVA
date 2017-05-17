import java.io.*;
class Sample10y
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("整数を入力してください。(0~2)0:パー、1:チョキ、2:グウ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<5;i++){
		
			String str = br.readLine();
			int num = Integer.parseInt(str);
		
			if(num>2 || num<0){
				System.out.println("入力値0~２以入力させる。");
			}else{
				double a,b,c;
				int d,e;
				
				a = Math.random();
				b = a*10;
				c = Math.floor(b);
				d = (int) c;
				e = d%3;
			
				switch(e){
				    case 0:{
						if(num==0){
							System.out.println("乱数は"+e+",入力数は"+num+",引きわけ。");
						}else if(num==1){
							System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの勝ち。");
						}else if(num==2){
							System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの負け。");
						}
				    	break;
					}
				    case 1:{
						if(num==0){
							System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの負け。");
						}else if(num==1){
							System.out.println("乱数は"+e+",入力数は"+num+",引きわけ。");
						}else if(num==2){
							System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの勝ち。");
						}
				    	break;
					}
				    case 2:{
						if(num==0){
							System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの負け。");
						}else if(num==1){
							System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの勝ち。");
						}else if(num==2){
							System.out.println("乱数は"+e+",入力数は"+num+",引きわけ。");
						}
					    break;
					}
				}
			
				if(e==0 && num==0){
					System.out.println("乱数は"+e+",入力数は"+num+",引きわけ。");
				}else if(e==0 && num==1){
					System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの勝ち。");
				}else if(e==0 && num==2){
					System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの負け。");
				}else if(e==1 && num==0){
					System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの負け。");
				}else if(e==1 && num==1){
					System.out.println("乱数は"+e+",入力数は"+num+",引きわけ。");
				}else if(e==1 && num==2){
					System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの勝ち。");
				}else if(e==2 && num==0){
					System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの負け。");
				}else if(e==2 && num==1){
					System.out.println("乱数は"+e+",入力数は"+num+",ユーザーの勝ち。");
				}else if(e==2 && num==2){
					System.out.println("乱数は"+e+",入力数は"+num+",引きわけ。");
				}
			}
		}
	}
}