// multilevel class and multiple interface 
package javaanudip;

class Ani {
	
	void eat() {
		System.out.println("Sunil eats");
	}
}
class Sunil extends Ani {
	
	void bark() {
		System.out.println("Sunil barks");
	}
}

class pratham extends Sunil {
	
	void meaow() {
		System.out.println("Pratham Meaow");
	}
}

interface Aditya {
	
	public void dance();
	
}

interface ManishSir {
	
	 void teach();
	
}
public class Jnwar extends pratham implements Aditya , ManishSir {
	
	
	public static void main(String[] args) {
		
		Jnwar j = new Jnwar();
		
		j.eat();
		j.bark();
		j.meaow();
		j.teach();
		j.dance();	
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Everyone should dance");
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("Sir is teaching");
	}
	
}
