package javaanudip;

abstract class BankAccount {

	abstract void withdraw();

     void showBankName() {                // BankAccount
        System.out.println("sbi Bank");
    }
}

class SavingAccount extends BankAccount {
	
	 void withdraw() {
		 System.out.println("Withdraw from saving account");
	 }
	
}
//class showBankName extends BAnkAccount {
//	
//	void withdraw() {
//		System.out.println("sbi bank")
//	}
//}
public class Main{
	
	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();
		sa.withdraw();
		sa.showBankName();
	}
	
}