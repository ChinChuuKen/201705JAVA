class SetArray
{
	public static void main(String[] args)
	{
		int[] arr1={10,20,30};
		int[] arr2={50,100,150,200,250};
		int[] arrTemp;
		for(int i=0;i<2;i++){
			if(i==0){
				arrTemp=arr1;
			}else{
				arrTemp=arr2;
			}
			for(int j=0;j<arrTemp.length;j++){
				System.out.println("配列の値は"+arrTemp[j]+"です。");
			}
			System.out.println("表示する配列を変更します。");
		}
	}
}