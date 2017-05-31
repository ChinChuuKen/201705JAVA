import java.util.*;
class Apple{
	private String color;
	private String taste;
	
	public Apple(){};
	public Apple(String color,String taste){
		this.color = color;
		this.taste = taste;
	}
	public String toString(){
		return this.color+"&"+this.taste;
	}
}
public class UseCollection{
	public static void main(String[] args){
		//ArrayList��String�I�u�W�F�N�g���i�[
		ArrayList a1 = new ArrayList();
		a1.add("Luffy");
		a1.add("Zoro");
		a1.add("Nami");
		
		System.out.println("*** ArrayList�̃f�[�^�\�� ***�@");
		for(int i=0;i<a1.size();i++){
			System.out.println("a1"+i+"==>"+a1.get(i));
		}
		System.out.println();
		
		//ArrayList�Ɍ^�̈قȂ�I�u�W�F�N�g���i�[
		List a2 = new ArrayList();
		a2.add("Apple");					//String�I�u�W�F�N�g
		a2.add(new Apple("red","sweet"));	//Apple�I�u�W�F�N�g
		a2.add(1000);							//Integer�I�u�W�F�N�g
		
		Object obj = null;
		System.out.println("*** ArrayList�̃f�[�^�\�� ***�A");
		for(int i=0;i<a2.size();i++){
			obj = a2.get(i);
			System.out.println("a2"+i+"==>"+obj);
		}
		System.out.println();
		
		//HashMap�I�u�W�F�N�g���g�p������@
		HashMap hmap = new HashMap();
		hmap.put("user_id","tuka");
		hmap.put("name","�˓c");
		hmap.put("ads","���l�s");
		hmap.put("b_type","B�^");
		
		System.out.println("**** HashMap�̕\�� ****�@");
		for(Object key:hmap.keySet()){
			System.out.println("�L�[=>�y"+key+"�z");
			System.out.println("�l=>�y"+hmap.get(key)+"�z");
		}
		System.out.println();
		
		//LinkedHashMap�I�u�W�F�N�g���g�p������@
		Map lmap = new LinkedHashMap();
		lmap.put("team","�����");
		lmap.put("name","Luffe");
		lmap.put("devil","�S���S��");
		lmap.put("sex","�j");
		
		System.out.println("**** LinkedHashMap�̕\�� ****�@");
		for(Object key:lmap.keySet()){
			System.out.println("�L�[=>�y"+key+"�z");
			System.out.println("�l=>�y"+lmap.get(key)+"�z");
		System.out.println();
		}	
			
		
		ArrayList alist1 = new ArrayList();
		alist1.add("���t�B�[");
		alist1.add("�G�[�X");
		alist1.add("�T�{");
		alist1.add("���[");
			
		// �R���N�V�����I�u�W�F�N�g�@
		//	***** �@ Iterator���g�p������ *****
		Iterator it = alist1.iterator();	//Iterator���擾
		
		System.out.println("***** for���g�p�������[�v���� *****");
		//���̗v�f
		while(it.hasNext()){
			obj = it.next();
			System.out.println("alist1==>"+obj);
		}
		
		System.out.println();
		
		//	***** �A �g��for���g�p������ *****
		System.out.println("***** �g��for���g�p�������[�v���� *****");
		for(Object obj2:alist1){
			System.out.println("alist1==>"+obj2);
		}
		System.out.println();
			
		//	***** �B �ʏ��for���g�p������ *****
		System.out.println("***** �ʏ��for���g�p�������[�v���� *****");
		for(int i=0;i<alist1.size();i++){
			System.out.println("alist1==>"+alist1.get(i));
		}
		System.out.println();
		
		// ***** �W�F�l���b�N�X���g�p������ *****
		ArrayList<String> alist_s = new ArrayList<String>();
		alist_s.add("����J���r");
		alist_s.add("����^����");
		alist_s.add("����n���~");
		
		it = alist_s.iterator();
		while(it.hasNext()){
			obj = it.next();
			System.out.println("alist_s==>"+obj);
		}
		System.out.println();
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ID","ID-001");
		map.put("���O","�����ꑾ�Y");
		map.put("�Z��","�����s������");
		map.put("�N��",30);
		map.put("���^�z",200000);
		
		for(Object key:map.keySet()){
			System.out.print("�y"+key+"�z==>");
			System.out.println("�y"+map.get(key)+"�z");
		}
		System.out.println();
	}
}

