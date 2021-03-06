/*
StringとStringBufferの動作の違いをサンプルプログラム
*/
import java.io.*;
class StringDataChange{
	/*引数にStringを受け取り、連結演算子を使い文字列を加工*/
	static void stringChange1(String str){
		str = str+"追加され文字列";
		System.out.println("【stirngChange1】str=>"+str);
	}
	/*引数にStringを受け取り、その後、StringとStringBufferに変換して加工*/
	static void stringChange2(String str){
		StringBuffer sb = new StringBuffer(str);
		sb.append("追加され文字列");
		System.out.println("【stirngChange2】sb=>"+sb);
		str = sb.toString();
		System.out.println("【stirngChange2】str=>"+str);
	}
	/*引数にStringBufferを受け取り、加工*/
	static void stringChange3(StringBuffer sb){
		sb.append("追加され文字列");
		System.out.println("【stirngChange3】sb=>"+sb);
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("文字列を入力してください。");
		String str = br.readLine();
		
		System.out.println("入力文字列は【"+str+"】です。");
		
		stringChange1(str);
		System.out.println("stringChange1呼び出し後の結果は【"+str+"】です。");
		
		stringChange2(str);
		System.out.println("stringChange2呼び出し後の結果は【"+str+"】です。");
		
		StringBuffer sb = new StringBuffer(str);
		stringChange3(sb);
		str = sb.toString();
		//stringChange(str);
		System.out.println("stringChange3呼び出し後の結果は【"+str+"】です。");
	}
}