package javaanudip;

import java.util.Scanner;

public class unique {
    public int calculate(int a,int b){
        return a+b;
    }

    public int calculate(int a,int b){
        return a-b;
    }

    public int calculate(int a,int b){
        return a*b;
    }

    public int calculate(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        
       

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: FOR ADDITION PRESS 1, FOR SUBTRACTION PRESS 2, FOR MULTIPLICATION PRESS 3, FOR DIVISION PRESS 4");
        int choice = sc.nextInt();

        unique obj = new unique();

        if(choice == 1){
            System.out.println("Addition: "+obj.calculate(a,b));
        }
        else if(choice == 2){
            System.out.println("Subtraction: "+obj.calculate(a,b));
        }
        else if(choice == 3){
            System.out.println("Multiplication: "+obj.calculate(a,b));
        }
        else if(choice == 4){
            System.out.println("Division: "+obj.calculate(a,b));
        }
        else{
            System.out.println("Invalid choice");
        }
        
    }
}