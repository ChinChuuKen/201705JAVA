package Exersice;

class teacher {
	int age;
	String sex;
	String name;

	/*
	 * public teacher(){ age=0; sex=""; name=""; }
	 */
	public void setTeacher(int ag, String se, String na) {
		age = ag;
		sex = se;
		name = na;
	}

	int getAge() {
		return age;
	}

	String getSex() {
		return sex;
	}

	String getName() {
		return name;
	}

	public void showTeacher() {
		System.out.println("���t�̔N��:" + age + ",����:" + sex + ",���O:" + name);
	}
}

class mathteacher extends teacher {
	String work;

	public void setWork(String wo) {
		work = wo;
	}

	String getWork() {
		return work;
	}

	public void setTeacher(int ag, String se, String na, String wo) {
		age = ag;
		sex = se;
		name = na;
		work = wo;
	}
	public void showTeacher() {
		System.out.println("���t�̔N��:" + age + ",����:" + sex + ",���O:" + name+",�d��:"+work);
	}
}

class englishteacher extends teacher {
	String work;

	public void setWork(String wo) {
		work = wo;
	}

	String getWork() {
		return work;
	}

	public void setTeacher(int ag, String se, String na, String wo) {
		age = ag;
		sex = se;
		name = na;
		work = wo;
	}
	public void showTeacher() {
		System.out.println("���t�̔N��:" + age + ",����:" + sex + ",���O:" + name+",�d��:"+work);
	}
}
public class Exersicex {
	public static void main(String[] args) {
		mathteacher[] mathteachers=new mathteacher[2];
		englishteacher[] englishteachers=new englishteacher[2];
		for(int i=0;i<2;i++){
			mathteachers[i]=new mathteacher();
			englishteachers[i]=new englishteacher();
		}
		mathteachers[0].setTeacher(20, "��", "aaa");
		mathteachers[0].setWork("mathteacher");
		
		mathteachers[1].setTeacher(25, "�j", "bbb","mathteacher");
		
		englishteachers[0].setTeacher(23, "��", "ccc");
		englishteachers[0].setWork("englishteacher");
		
		englishteachers[1].setTeacher(24, "�j", "ddd","englishteacher");
		
		for(int i=0;i<2;i++){
			mathteachers[i].showTeacher();
			englishteachers[i].showTeacher();
		}
	}
}
