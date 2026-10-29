package javaanudip;

interface Interface1{
	  default void display() {
		System.out.println("Interface1");
	}
}

interface Interface2{
	 default void Show() {
		System.out.println("Interface2");
	}
}

public  class multi implements Interface1,Interface2 {
	
	public static void main(String[] args) {
		
		
		
		multi m = new multi();
		m.display();
		m.Show();
	}
	
	@Override
	public void display() {
		Interface1.super.display();
	}

}
