package javaanudip;

 class GrandFather {
	
	public static void age() {
		System.out.println("Grandfather is dead");
	}
}

class Baap extends GrandFather{
	
	public static void age1() {
		System.out.println("Father age is 40");
	}
}

public class Child extends Baap{
		
public static void main(String[] args) {
			
//		Child c = new Child();
		age();
		age1();
		}

	}


