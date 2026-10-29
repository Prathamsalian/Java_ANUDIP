//Assignment-2. Write a Java program that allows the user to create a bank account and perform transactions such as deposit, withdrawal, and balance inquiry. Using a conditional operator (ternary operator ), display the message whether minimum balance is maintained or not.

//Steps:
	    /*   ● Create a class BankAccount 
	         ● Add three member variables: String accountHolderName , int accountNumber and int balance; 
             ● Add a constructors using all three members 
             ● Add getters and setters. 
             ● Add method deposit (int), withdraw(int) 
             ● Implement the methods by increasing or decreasing the balance 
             ● In the main method create a bank account 
             ● Withdraw money from this account and/or deposit into this account 
             ● Get the balance 
             ● Create a string variable “status” inside the main method 
             ● Assign values to status as “Minimum Balance Maintained” if balance is above or equal to 5000. 
             Otherwise values of status will be “Minimum Balance not Maintained”. Use conditional operator (ternary operator ) to assign the values of the status. 
             ● Dis pla y t h e s t a t u s.      */

package javaanudip;

class BankofIndia {
    private String accountHolderName;
    private int accountNumber;
    private int balance;
	public int withdraw;
	public int deposit;

    BankofIndia(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() { 
    	return accountHolderName; 
    	}
    public void setAccountHolderName(String name) {
    	this.accountHolderName = name; 
    	}

    public int getAccountNumber() {
    	return accountNumber;
    	}
    public void setAccountNumber(int num) {
    	this.accountNumber = num;
    	}

    public int getBalance() {
    	return balance; 
    	}
    public void setBalance(int bal) { 
    	this.balance = bal; 
    	}

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
    	
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
        else {
        	
        	System.out.println("Erorr");
        }
    }
}

public class bankbob {
	
    public static void main(String[] args) {
    	
    	BankofIndia acc = new BankofIndia("Amit", 1001, 7000);

        acc.deposit(1000);
        acc.withdraw(9000);

        int bal = acc.getBalance();

        String status;
        if(bal != acc.withdraw) {
        	status = "Out of money";
        }
        else if (bal >= 5000) {
            status = "Minimum Balance Maintained";    
        }
        else {
            status = "Minimum Balance not Maintained";
        }
        System.out.println("Balance: " + bal);
        System.out.println("Status: " + status);
    }
}