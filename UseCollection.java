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
		//ArrayListにStringオブジェクトを格納
		ArrayList a1 = new ArrayList();
		a1.add("Luffy");
		a1.add("Zoro");
		a1.add("Nami");
		
		System.out.println("*** ArrayListのデータ表示 ***①");
		for(int i=0;i<a1.size();i++){
			System.out.println("a1"+i+"==>"+a1.get(i));
		}
		System.out.println();
		
		//ArrayListに型の異なるオブジェクトを格納
		List a2 = new ArrayList();
		a2.add("Apple");					//Stringオブジェクト
		a2.add(new Apple("red","sweet"));	//Appleオブジェクト
		a2.add(1000);							//Integerオブジェクト
		
		Object obj = null;
		System.out.println("*** ArrayListのデータ表示 ***②");
		for(int i=0;i<a2.size();i++){
			obj = a2.get(i);
			System.out.println("a2"+i+"==>"+obj);
		}
		System.out.println();
		
		//HashMapオブジェクトを使用した例①
		HashMap hmap = new HashMap();
		hmap.put("user_id","tuka");
		hmap.put("name","塚田");
		hmap.put("ads","横浜市");
		hmap.put("b_type","B型");
		
		System.out.println("**** HashMapの表示 ****①");
		for(Object key:hmap.keySet()){
			System.out.println("キー=>【"+key+"】");
			System.out.println("値=>【"+hmap.get(key)+"】");
		}
		System.out.println();
		
		//LinkedHashMapオブジェクトを使用した例①
		Map lmap = new LinkedHashMap();
		lmap.put("team","麦わら");
		lmap.put("name","Luffe");
		lmap.put("devil","ゴムゴム");
		lmap.put("sex","男");
		
		System.out.println("**** LinkedHashMapの表示 ****①");
		for(Object key:lmap.keySet()){
			System.out.println("キー=>【"+key+"】");
			System.out.println("値=>【"+lmap.get(key)+"】");
		System.out.println();
		}	
			
		
		ArrayList alist1 = new ArrayList();
		alist1.add("ルフィー");
		alist1.add("エース");
		alist1.add("サボ");
		alist1.add("ロー");
			
		// コレクシュンオブジェクト　
		//	***** ① Iteratorを使用した例 *****
		Iterator it = alist1.iterator();	//Iteratorを取得
		
		System.out.println("***** forを使用したループ処理 *****");
		//次の要素
		while(it.hasNext()){
			obj = it.next();
			System.out.println("alist1==>"+obj);
		}
		
		System.out.println();
		
		//	***** ② 拡張forを使用した例 *****
		System.out.println("***** 拡張forを使用したループ処理 *****");
		for(Object obj2:alist1){
			System.out.println("alist1==>"+obj2);
		}
		System.out.println();
			
		//	***** ③ 通常のforを使用した例 *****
		System.out.println("***** 通常のforを使用したループ処理 *****");
		for(int i=0;i<alist1.size();i++){
			System.out.println("alist1==>"+alist1.get(i));
		}
		System.out.println();
		
		// ***** ジェネリックスを使用した例 *****
		ArrayList<String> alist_s = new ArrayList<String>();
		alist_s.add("特上カルビ");
		alist_s.add("特上タン塩");
		alist_s.add("特上ハラミ");
		
		it = alist_s.iterator();
		while(it.hasNext()){
			obj = it.next();
			System.out.println("alist_s==>"+obj);
		}
		System.out.println();
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ID","ID-001");
		map.put("名前","多言語太郎");
		map.put("住所","東京都中央区");
		map.put("年齢",30);
		map.put("給与額",200000);
		
		for(Object key:map.keySet()){
			System.out.print("【"+key+"】==>");
			System.out.println("【"+map.get(key)+"】");
		}
		System.out.println();
	}
}

