/*
String‚ÆStringBuffer‚Ì“®ì‚Ìˆá‚¢‚ğƒTƒ“ƒvƒ‹ƒvƒƒOƒ‰ƒ€
*/
import java.io.*;
class StringDataChange{
	/*ˆø”‚ÉString‚ğó‚¯æ‚èA˜AŒ‹‰‰Zq‚ğg‚¢•¶š—ñ‚ğ‰ÁH*/
	static void stringChange1(String str){
		str = str+"’Ç‰Á‚³‚ê•¶š—ñ";
		System.out.println("ystirngChange1zstr=>"+str);
	}
	/*ˆø”‚ÉString‚ğó‚¯æ‚èA‚»‚ÌŒãAString‚ÆStringBuffer‚É•ÏŠ·‚µ‚Ä‰ÁH*/
	static void stringChange2(String str){
		StringBuffer sb = new StringBuffer(str);
		sb.append("’Ç‰Á‚³‚ê•¶š—ñ");
		System.out.println("ystirngChange2zsb=>"+sb);
		str = sb.toString();
		System.out.println("ystirngChange2zstr=>"+str);
	}
	/*ˆø”‚ÉStringBuffer‚ğó‚¯æ‚èA‰ÁH*/
	static void stringChange3(StringBuffer sb){
		sb.append("’Ç‰Á‚³‚ê•¶š—ñ");
		System.out.println("ystirngChange3zsb=>"+sb);
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("•¶š—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		String str = br.readLine();
		
		System.out.println("“ü—Í•¶š—ñ‚Íy"+str+"z‚Å‚·B");
		
		stringChange1(str);
		System.out.println("stringChange1ŒÄ‚Ño‚µŒã‚ÌŒ‹‰Ê‚Íy"+str+"z‚Å‚·B");
		
		stringChange2(str);
		System.out.println("stringChange2ŒÄ‚Ño‚µŒã‚ÌŒ‹‰Ê‚Íy"+str+"z‚Å‚·B");
		
		StringBuffer sb = new StringBuffer(str);
		stringChange3(sb);
		str = sb.toString();
		//stringChange(str);
		System.out.println("stringChange3ŒÄ‚Ño‚µŒã‚ÌŒ‹‰Ê‚Íy"+str+"z‚Å‚·B");
	}
}