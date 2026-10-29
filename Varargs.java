package javaanudip;

import java.lang.reflect.Array;

public class Varargs {
	
	    int add(int ...variables) {
		int sum = 0;
		for (int n: variables) {
			sum = sum+n;
		}
		return sum;
	}
	    String add(String ...names) {
	        String result = "";
	        for(String s : names) {
	            result = result + s + " ";
	        }
	        return result;
	    }
public static void main(String[] args) {
	Varargs obj = new Varargs();
	System.out.println(obj.add(10, 20));
	System.out.println(obj.add(10, 20, 30));
	System.out.println(obj.add(1, 2, 3, 4, 5, 6)); 
	System.out.println(obj.toString("Aditya", "Pratham"));
	
}
}
