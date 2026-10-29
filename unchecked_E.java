//ClassNotFoundException
//Jab class ka naam galat ho ya fir JVM ko na mile

package javaanudip;
//
//public class unchecked_E {
//	
//	public static void main(String[] args) {
//		
//		try {
//			
//			//method1();
//		
//		Class.forName("com.example.exception");// ye class exist nahi karti
//		
//		
//		}catch(Exception e) {
//			
//			System.out.println("Class nhi mil rahi hai" + e);
//			
//		}finally{
//			
//			System.out.println("Run");
//			
//		}
//		
//	}
//	public static void method1() throws Exception {
//		
//		throw new ClassNotFoundException();
//	}
//}

//.....................................................................................................................................................................................................................................................................................................................................


//InteruptedExceptionEx

//Thread ko sone do or beech mai disturb karo 

//package javaanudip;

//public class unchecked_E {
//    
//	public static void main(String[] args) {
//		
//		try {
//			
//			 Thread.sleep(10000000);
//	
//			 sleepy1();
//			 
//
//			
////			System.out.print("5 sec ke liye so raha hu ");
//			
//		}
//			catch (InterruptedException e){
//			System.out.println("Neend disturb ho gayi: " + e);
//			
//		}		
//			
//	}
//	 // 1. Define the sleepy method OUTSIDE of the main method
//    public static void sleepy1() {
//        System.out.print("5 sec ke liye so raha hu ");
//    }
//	
//}		
//	public static void sleepy() throws InterruptedException {
//		throw new InterruptedException();
//	
//	}

//.....................................................................................................................................................................................................................................................................................................................................


//IOException Parent class hai 
//FileNotFoundException IOException ka child 

//import java.io.*;
//
//public class unchecked_E {
//	
//	public static void main(String[] args) {
//		
//		try {
//			
//			FileReader fr = new FileReader("abc.txt"); // file hai hi nahi
//			
//			
//		}catch(FileNotFoundException e){
//			
//			System.out.println("File nahi mili: " + e);
//			
//		}catch(IOException e){
//			
//			 System.out.println("IO Error: " + e);
//		}
//	}
//}

//.....................................................................................................................................................................................................................................................................................................................................

//EOFException ---- File khatam hone ke baad b hi padhoge tho 

//import java.io.*;
//
//public class unchecked_E {
//	
//	public static void main(String[] args) {
//		
//		try {
//			// pehle ek file banao
//			DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
//			
//			dos.writeInt(100);
//			dos.close();
//			
//			try (DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"))) {
//				System.out.println(dis.readInt());
//				System.out.println(dis.readInt()); // yaha file khatam, EOFException ayega
//			}
//            
//		}catch(EOFException e){
//			
//			System.out.println("File ka end aa gaya: " + e);
//			
//		}catch(IOException e) {
//			 System.out.println(e);
//		}
//	}
//}

//.....................................................................................................................................................................................................................................................................................................................................

//SocketException

//import java.net.*;
//import java.io.*;
//
//public class unchecked_E {
//	
//	public static void main(String[] args) {
//		
//		try {
//			Socket s = new Socket();
//			s.connect(new InetSocketAddress ("localhost", 9999));
//			
//		}catch (SocketException e) {
//            System.out.println("Socket problem: " + e);
//            
//	}catch (IOException e) {
//		
//		System.out.println(e);
//	}
//}

//.....................................................................................................................................................................................................................................................................................................................................

//SQL Exception

import java.sql.*;

public class unchecked_E {
	
    public static void main(String[] args) {
    	
        try {
            // galat URL - iske liye mysql-connector jar chahiye hota hai
            @SuppressWarnings("unused")
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wrongdb", "root", "root");
            
        } catch (SQLException e) {
        	
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}

//.....................................................................................................................................................................................................................................................................................................................................




