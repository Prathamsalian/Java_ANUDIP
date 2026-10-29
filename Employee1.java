package javaanudip;

public class Employee1 {
    
    protected int EmployeeID = 404;
    protected double EmployeeAge = 35.5; // Fixed from int to double
    protected String EmployeeName = "Pratham";
    protected boolean isPermanent = true;
    
    // 1. Create the getter method for EmployeeID
    public int getEmployeeID() {
        return EmployeeID;
    }

    public static void main(String[] args) {
        
        System.out.println("Successfully Printed");
        
        Employee n = new Employee();
        
        // 2. Now this works because getEmployeeID() is a method!
        System.out.println(n.getEmployeeID());
        
        // 3. For variables without a getter, just use the name directly (no parentheses)
        System.out.println(n.EmployeeAge);
    }
}