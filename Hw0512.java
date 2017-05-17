class DrawBg
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
}
class Hw0512
{
	public static void main(String[] args)
	{
		DrawBg drawbg=new DrawBg();
		drawbg.draw(5,8);
	}
}