//String builder


package javaanudip;

public class day3 {
	
	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder("hello Pratham");
		
		System.out.println(name);
		name.append(" how are you");
		System.out.println(name);
		System.out.println(name.insert(0,"I am Java "));
		System.out.println(name.replace(0,4,"Hi"));
		System.out.println(name.delete(0,3));
//		System.out.println(name.deleteCharAt(0));
		
		System.out.println(name.reverse());
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.print(name.capacity());
		System.out.println(name.toString());
		
		
	}

}
