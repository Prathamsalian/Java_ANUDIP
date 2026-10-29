
// Assignment-1. Write a Java program that uses a method to calculate the area of a rectangle and compare them using Relational Operator Steps: 
	      /*  ● Create a class Rectangle. 
	          ● The Rectangle class should have two attributes length and width of type int.
	          ● Create a constructor that accepts length and width as parameters. 
	          ● Area should be calculated as length*area. ● Instantiate two Rectangle classes with random values. 
	          ● Compare the areas of the two rectangles using the Relational Operator. 
	          ● If the first one is bigger than the second one, print “Rectangle1 > Rectangle2”. 
	          ● If the first one is smaller print “Rectangle1 < Rectangle2”. 
	          ● Otherwise print “They are equal”.  */

package javaanudip;

class Rectange{
int length;
int width;

Rectange(int len , int wid){
	this.length = len;
	this.width = wid;
	
}
	
	int getArea() {
        return this.length * this.width;
	}
}

public class Rextangle_assignmemnt {
	
	 public static void main(String[] args) {
		 
		 Rectange rect1 = new Rectange(10 , 2);
		 Rectange rect2 = new Rectange(10 , 10);
		  
		 int area1 = rect1.getArea();
		 int area2 = rect2.getArea();
		 
		 System.out.println("Rectangle1 Area = " + area1);
	     System.out.println("Rectangle2 Area = " + area2);
	     
	     if (area1 > area2) {
	            System.out.println("Rectangle1 > Rectangle2");
	        } else if (area1 < area2) {
	            System.out.println("Rectangle1 < Rectangle2");
	        } else {
	            System.out.println("They are equal");
	        }
		 
	 }
		
	}

