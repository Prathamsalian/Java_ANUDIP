//Array List 

package javaanudip;
import java.util.*;

public class ARRYS implements Comparable<Integer> {
	
	public static void main(String[] args) {
		
	ArrayList<Integer> lst = new ArrayList<>();
	lst.add(2);
	lst.add(4);
	lst.add(5);
	lst.add(3);
	lst.add(8);
	lst.add(4);
	lst.add(9);
	lst.add(5);
	lst.add(0);
	lst.add(66);
	lst.add(8);
	lst.add(77);
	
	
	//size
	System.out.println("Size"+ lst.size());
	System.out.println("All:" + lst);
	System.out.println("Empty:"+lst.isEmpty());
	System.out.println("Conatins  " +lst.contains(4));
	System.out.println("reverse"+lst.reversed());
	
	Iterator<Integer> it = lst.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	TreeMap<String,Integer> hh = new TreeMap();
	hh.put("Pratham", 3);
	hh.put("Sunil", 1);
	hh.put("Abc", 5);
	System.out.println("Answer" +hh);


		Collections.sort(lst);
		System.out.println(lst);
		
	}

//	@Override
//	public int compareTo(Integer o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//
//}
//
//@SuppressWarnings("hiding")
//interface Comparable<Integer>{
//	
//	void sonil();
//	
//}
