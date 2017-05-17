class Sample10x3
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++){
			// (1)Math.randomの戻り値を取得
			double ans = Math.random();
			// (2)戻り値の小数点第一位の値を取得
			double cans = Math.ceil(ans*10);
			
			// (3) (2)で取得した値を3で割り、
			// その余りを取得
			double amari = cans%3;
			char ch;
			// (4)if文で分岐
			// (5) (3)の値を判定し、
			// 対応した文字を表示
			if(amari == 0){
				ch = '☆';
			}else if(amari == 1){
				ch = '★';
			}else{
				ch = '♪';
			}
			System.out.print(ch);
		}
	}
}