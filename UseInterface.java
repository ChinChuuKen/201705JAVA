//所属インターフェイス
interface belong{
	void bshow();
}

//悪まくの実インターフェイス
interface devil_f{
	void dshow();
}

//覇気インターフェイス
interface spirit{
	void sshow();		//メソッド
}

//個別情報インターフェイス
interface personal{
	void pshow();		//個別情報用メソッド
}

abstract class Character implements belong,devil_f,spirit,personal{
	
	protected String sex;
	protected String b_type;
	protected String p_data;
	
	//フィールド設定用メソッド
	public void setCharacter(String sex,String b_type,String p_data){
	
		this.sex = sex;
		this.b_type = b_type;
		this.p_data = p_data;
	}	
	//
	public void showCharacter(){
		bshow();
		dshow();
		sshow();
		pshow();
		System.out.println("性別は【"+sex+"】です。");
		System.out.println("血液型"+b_type+"】です。");
		System.out.println();
		
	}
}

class Luffy extends Character{
	public void bshow(){
		System.out.println("所属は麦わらの一味です。");
	}
	public void dshow(){
		System.out.println("悪魔の実はゴムゴムの実。");
	}
	public void sshow(){
		System.out.println("覇王色の覇気。");
		System.out.println("武装色の覇気。");
		System.out.println("見聞色の覇気。");
	}
	public void pshow(){
		System.out.println("兄弟は【"+p_data+"】");
	}
}

class Zoro extends Character{
	public void bshow(){
		System.out.println("所属は麦わらの一味です。");
	}
	public void dshow(){
		System.out.println("悪魔の実は食べていない。");
	}
	public void sshow(){
		System.out.println("武装色の覇気。");
	}
	public void pshow(){
		System.out.println("刀は【"+p_data+"】");
	}
}

class Nami extends Character{
	public void bshow(){
		System.out.println("所属は麦わらの一味です。");
	}
	public void dshow(){
		System.out.println("悪魔の実は食べていない。");
	}
	public void sshow(){
		System.out.println("覇気はない。");
	}
	public void pshow(){
		System.out.println("愛称は【"+p_data+"】");
	}
}

class Ace extends Character{
	public void bshow(){
		System.out.println("所属は白ひげ海賊団");
	}
	public void dshow(){
		System.out.println("悪魔の実はメラメラの実");
	}
	public void sshow(){
		System.out.println("覇王色の覇気。");
		System.out.println("武装色の覇気。");
		System.out.println("見聞色の覇気。");
	}
	public void pshow(){
		System.out.println("兄弟は【"+p_data+"】");
	}
}

class UseInterface
{
	public static void main(String[] args)
	{
		final int ARRAY_MAX = 4;
		Character[] op = new Character[ARRAY_MAX];
		
		for(int i=0;i<op.length;i++){
			switch(i){
			case 0:
				op[i] = new Luffy();
				op[i].setCharacter("男","F型(RH+)","弟");
				op[i].showCharacter();
				break;
			case 1:
				op[i] = new Zoro();
				op[i].setCharacter("男","XF型(RH+)","三刀流");
				op[i].showCharacter();
				break;
			case 2:
				op[i] = new Nami();
				op[i].setCharacter("女","X型(RH+)","どろぼう猫");
				op[i].showCharacter();
				break;
			case 3:
				op[i] = new Ace();
				op[i].setCharacter("男","不明","兄");
				op[i].showCharacter();
				break;
			}
		}
	}
}