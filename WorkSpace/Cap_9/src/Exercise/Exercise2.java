package Exercise;

class Car1 {
	int num;
	double gas;
	String color;

	public Car1(){
		num=0;
		gas=0;
		color=null;
	}
	public Car1(int an,double ag,String ac){
		num = an;
		gas = ag;
		color = ac;
		System.out.println("車のナンバーは"+num+
				",ガソリン量は"+gas+",色は"+color+"です。");
	}
	public void setNum(int an) {
		num = an;
		System.out.println("車のナンバーは"+num+"です。");	
	}
	public void setGas(double ag) {
		gas = ag;
		System.out.println("車のガソリン量は"+gas+"です。");
	}
	public void setColor(String ac) {
		color = ac;
		System.out.println("車の色は"+color+"です。");
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
	
	public void showCar(){
		System.out.println("車のナンバーは"+num+
				",ガソリン量は"+gas+",色は"+color+"です。");
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		Car1[] cars = new Car1[2];
		
		cars[0] = new Car1();
		cars[0].setNum(1234);
		cars[0].setGas(10.5);
		cars[0].setColor("red");
		
		cars[1] = new Car1(2345,12.5,"black");
		
		for(int i=0;i<cars.length;i++){
			cars[i].showCar();
		}
	}
}
