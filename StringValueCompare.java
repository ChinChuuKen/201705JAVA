class StringValueCompare{
	public static void main(String[] args){
		
		System.out.println("**** new���Z�q���g�킸����String�C���X�^���X���쐬�����ꍇ ****");
		
		String str_a = new String("LUFFY");
		String str_b = new String("LUFFY");
		
		System.out.println("**** �ϐ�str_a�����str_b�̒l��\�� ****");
		System.out.println("str_a =>"+str_a);
		System.out.println("str_b =>"+str_b);
		System.out.println();
		
		//��r���Z�q���g�p������r
		System.out.println("**** ��r���Z�q���g�p������r ****");
		if(str_a == str_b){
			System.out.println("str_a��str_b�͓������ł��B");
		}else{
			System.out.println("str_a��str_b�͓���������܂���B");
		}
		System.out.println();
		
		//equeals���g�p������r
		System.out.println("**** equals���\�c�h���g�p������r ****");
		if(str_a.equals(str_b)){
			System.out.println("str_a��str_b�͓������ł��B");
		}else{
			System.out.println("str_a��str_b�͓���������܂���B");
		}
		System.out.println("\n\n\n");
		
		System.out.println("**** new���Z�qString�C���X�^���X���쐬�����ꍇ ****");
		
		String str_x = "ZORO";
		String str_y = "ZORO";
		
		System.out.println("**** �ϐ�str_x�����str_y�̒l��\�� ****");
		System.out.println("str_x =>"+str_x);
		System.out.println("str_y =>"+str_y);
		System.out.println();
		
		//��r���Z�q���g�p������r
		System.out.println("**** ��r���Z�q���g�p������r ****");
		if(str_x == str_y){
			System.out.println("str_x��str_y�͓������ł��B");
		}else{
			System.out.println("str_x��str_y�͓���������܂���B");
		}
		System.out.println();
		
		//equeals���g�p������r
		System.out.println("**** equals���\�c�h���g�p������r ****");
		if(str_x.equals(str_y)){
			System.out.println("str_x��str_y�͓������ł��B");
		}else{
			System.out.println("str_x��str_y�͓���������܂���B");
		}
		System.out.println("\n\n\n");
		
		
		System.out.println("**** new���Z�q���g�p�����ϐ���new���Z�q���g��Ȃ��ϐ�����String�C���X�^���X���쐬�����ꍇ ****");
		
		String str_c = new String("NAMI");
		String str_d = "NAMI";
		
		System.out.println("**** �ϐ�str_c�����str_d�̒l��\�� ****");
		System.out.println("str_c =>"+str_c);
		System.out.println("str_d =>"+str_d);
		System.out.println();
		
		//��r���Z�q���g�p������r
		System.out.println("**** ��r���Z�q���g�p������r ****");
		if(str_c == str_d){
			System.out.println("str_c��str_d�͓������ł��B");
		}else{
			System.out.println("str_c��str_d�͓���������܂���B");
		}
		System.out.println();
		
		
		//equeals���\�b�h���g�p������r
		System.out.println("**** equals���\�b�h���g�p������r ****");
		if(str_c.equals(str_d)){
			System.out.println("str_c��str_d�͓������ł��B");
		}else{
			System.out.println("str_c��str_d�͓���������܂���B");
		}
		System.out.println("\n\n\n");
		
	}
}