package javaanudip;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
	
	Map<Integer,String> s1 = new TreeMap<>((Integer key1 , Integer key2) -> key1 - key2);
	s1.put(21 , "SJ");
	s1.put(11 , "PJ");
	s1.put(13 , "KJ");
	s1.put(14 , "JJ");
	System.out.println(s1.size());
	System.out.println(s1);

	
	
	}
	
}
