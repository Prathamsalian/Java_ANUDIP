package javaanudip;

abstract class Payment{
	
	void pay() {
		
	}
	
}
class upi extends Payment {

  
    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}
class DebitCard extends Payment {

    public void pay() {
        System.out.println("Payment using Debit Card");
    }
}

public class Abc {
	
	public static void main(String[] args) {
		
		
		DebitCard db = new DebitCard();
		upi u = new upi();
		db.pay();
		u.pay();
	}
	
}
