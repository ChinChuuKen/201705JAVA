
class Checkarry
{
	public static void main(String[] args)
	{
		int[] test={80,75,50,90,20};
		for(int i=0;i<5;i++){
			if(test[i]>=60){
				System.out.println((i+1)+"番目の人の点数は"+test[i]+"です。60以上です。");
			}else 
				System.out.println((i+1)+"番目の人の点数は"+test[i]+"です。60未満です。");
		}
	}
}