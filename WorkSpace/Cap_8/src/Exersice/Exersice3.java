package Exersice;

class Car2 {
	int num;
	double gas;
	String color;

	public void setCar(int an,double ag,String ac) {
		num = an;
		gas = ag;
		color = ac;
	}
    public void showCar(){
    	System.out.println("32号車のナンバーは"+num+
				",ガソリン量は"+gas+",色は"+color+"です。");
    }


	int getNum() {
		return num;
	}
	double getGas() {
		return gas;
	}
	String getColor() {
		return color;
	}
}

public class Exersice3 {
	public static void main(String[] args) {
		Car2[] cars = new Car2[2];
		for (int i = 0; i < 2; i++) {
			cars[i] = new Car2();
		}
		cars[0].setCar(1234,10.5,"red");
		cars[1].setCar(2345,12.5,"black");
		
//		cars[0].getNum();
//		cars[0].getGas();
//		cars[0].getColor();
		System.out.println("1号車のナンバーは"+cars[0].getNum()+
				",ガソリン量は"+cars[0].getGas()+",色は"+cars[0].getColor()+"です。");
		
		cars[1].showCar();

	}
}
