import java.util.Scanner;

public class pratice08 {
    
    String name;

    //constructor
    public pratice08(String n) {
        this.name = n;
    }

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.print("Enter name");
        pratice08 h = new pratice08(name.nextLine());
        
        System.out.print(h.name);
    }
}

//IMP
//Scanner(System.in); is constructor , new is mermory allocation , name is object  , student is class name 