package javaanudip;

public class day2 {
	
	public static void main(String[] args) {
String str = "HELLO WORLD";
		
		System.out.println(str.hashCode());
		System.out.println("Length of string is:"+ str.length());
		System.out.println(str.charAt(8));
		System.out.println(str.startsWith("H"));
		System.out.println(str.endsWith("pratham"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.isEmpty());
		System.out.println(str.replace("pratham", "world"));
		System.out.println(str.equals("Hello pratham"));
		System.out.println(str.equalsIgnoreCase("hello world"));
//		System.out.println(str.compareTo(str));
		System.out.println(str.substring(6));
		System.out.println(str.trim());
		System.out.println(str.contains("pratham"));
		
	}

}
