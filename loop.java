package javaanudip;

import java.util.HashSet;

public class loop {
    public static void main(String[] args) {
    	
        HashSet<String> names = new HashSet<>();

        names.add("Aditya");
        names.add("Pratham");
        names.add("Aditya"); // duplicate hai, add nahi hoga
        names.add("Sahil");

        System.out.println(names); // [Pratham, Aditya, Sahil] - order ka koi bharosa nahi
        System.out.println(names.size()); // 3 - duplicate count nahi hua
        System.out.println(names.contains("Aditya")); // true
        
        loop p1 = new loop();
        System.out.println(p1.hashCode()); // koi number dega
    }
}