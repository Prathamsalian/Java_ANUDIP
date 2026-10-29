package javaanudip;

class Animal {
	
	void eat() {
		System.out.println("Animal Eats ");
	}

}
class Dog extends Animal{
	
	void bark() {
		System.out.println("Dog BArks");
	}
}

public class cat extends Dog{
	
	public static void main(String[] args) {
		
		cat c = new cat();
		c.eat();
		c.bark();
		
	}
}
