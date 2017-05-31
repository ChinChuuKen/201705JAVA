package Exersice;

public class Exersice7y {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			int x=(i<=5)?i:(10-i);
			for(int j=1;j<=x;j++){
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
