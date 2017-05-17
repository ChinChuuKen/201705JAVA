import java.io.*;
class DrawBg2
{
	int xpos,ypos;
	void draw(int x,int y){
		xpos=x;
		ypos=y;
		int i;
		int j;
		for(i=0;i<xpos;i++){
			for(j=0;j<ypos;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	void drawStar(){
		int i;
		int j;
		for(i=0;i<5;i++){
			for(j=0;j<8;j++){
				if(i==ypos && j==xpos){
					System.out.print("★");
				}else 
					{System.out.print("*");}
			}
			System.out.println("");
		}
	}
	void setXpos(int px){
		if(px>7){
			System.out.println("7より値を入力,0を");
			xpos = 0;
		}else{
			xpos = px;
		}
		
	}
	void setYpos(int py){
		if(py>4){
			System.out.println("4より値を入力");
			ypos = 0;
		}else{
		ypos=py;
		}
	}
}

class Hw05122
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("X座標を設定しました。(0~7)");
		String str1=br.readLine();
		int res1=Integer.parseInt(str1);
		System.out.println("Y座標を設定しました。(0~4)");
		String str2=br.readLine();
		int res2=Integer.parseInt(str2);
		
		DrawBg2 drawbg=new DrawBg2();
		drawbg.draw(5,8);
		System.out.println("");
		drawbg.setXpos(res1);
		drawbg.setYpos(res2);
		drawbg.drawStar();
		//drawbg.drawStar(3,2);
	}
}