/*
String��StringBuffer�̓���̈Ⴂ���T���v���v���O����
*/
import java.io.*;
class StringDataChange{
	/*������String���󂯎��A�A�����Z�q���g������������H*/
	static void stringChange1(String str){
		str = str+"�ǉ����ꕶ����";
		System.out.println("�ystirngChange1�zstr=>"+str);
	}
	/*������String���󂯎��A���̌�AString��StringBuffer�ɕϊ����ĉ��H*/
	static void stringChange2(String str){
		StringBuffer sb = new StringBuffer(str);
		sb.append("�ǉ����ꕶ����");
		System.out.println("�ystirngChange2�zsb=>"+sb);
		str = sb.toString();
		System.out.println("�ystirngChange2�zstr=>"+str);
	}
	/*������StringBuffer���󂯎��A���H*/
	static void stringChange3(StringBuffer sb){
		sb.append("�ǉ����ꕶ����");
		System.out.println("�ystirngChange3�zsb=>"+sb);
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���������͂��Ă��������B");
		String str = br.readLine();
		
		System.out.println("���͕�����́y"+str+"�z�ł��B");
		
		stringChange1(str);
		System.out.println("stringChange1�Ăяo����̌��ʂ́y"+str+"�z�ł��B");
		
		stringChange2(str);
		System.out.println("stringChange2�Ăяo����̌��ʂ́y"+str+"�z�ł��B");
		
		StringBuffer sb = new StringBuffer(str);
		stringChange3(sb);
		str = sb.toString();
		//stringChange(str);
		System.out.println("stringChange3�Ăяo����̌��ʂ́y"+str+"�z�ł��B");
	}
}