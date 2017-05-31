package Exersice;

class Car1 {
	int num;
	double gas;
	String color;

	public void setNum(int an) {
		num = an;
	}

	public void setGas(double ag) {
		gas = ag;
	}

	public void setColor(String ac) {
		color = ac;
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

public class Exersice2 {
	public static void main(String[] args) {
		Car1[] cars = new Car1[3];
		for (int i = 0; i < 3; i++) {
			cars[i] = new Car1();
		}
		cars[0].setNum(1234);
		cars[0].setGas(10.5);
		cars[0].setColor("red");
		cars[1].setNum(2345);
		cars[1].setGas(12.5);
		cars[1].setColor("black");
		cars[2].setNum(3456);
		cars[2].setGas(13.5);
		cars[2].setColor("white");
		
		for(int i=0;i<cars.length;i++){
//			cars[i].getNum();
//			cars[i].getGas();
//			cars[i].getColor();
			System.out.println((i+1)+"号車のナンバーは"+cars[i].getNum()+
					",ガソリン量は"+cars[i].getGas()+",色は"+cars[i].getColor()+"です。");
		}
	}
}
