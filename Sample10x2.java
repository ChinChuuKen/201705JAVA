class Sample10x2
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++){
			// (1)Math.randomの戻り値を取得
			double ans = Math.random();
			// (2)戻り値の小数点第一位の値を取得
			double cans = Math.ceil(ans*10);
			
			char ch;
			// (3) (2)で取得した値を3で割り、
			// その余りを取得
			// (4),(6)switch文で分岐するため、
			// int型にする
			int amari = (int)(cans%3);
			// (7) (6)の値をswitch文で判定し、
			// 対応した文字を表示
			switch(amari){
				case 0:
					ch = '☆';
					break;
				case 1:
					ch = '★';
					break;
				default:
					ch = '♪';
					break;
			}
			System.out.print(ch);
		}
	}
}