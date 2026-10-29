package javaanudip;

import java.util.Scanner;

class calc {
	
	int cal(int a , int b) {
		return a+b;
	}
	
	int cal(int a , int b , int c) {
		return a+b+c;
	}
	int cal(int a , int b , int c , int d) {
		return a+b+c+d;
	}
	
	void display() {
	System.out.println("Calculation");
	}
}

public class calculation extends calc {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int a = sc.nextInt();
	System.out.println("Enter the number");
	int b = sc.nextInt();
	
	calculation part1 = new calculation();
	
	System.out.println("Adddtion 1" + part1.cal(a, b));


	
	}

}
