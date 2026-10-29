package javaanudip;

public interface array_day1 {
	
	public static void main(String[] args) {
		
		int [] arr1D = {1,2,3,4,5,6,7};
		
//        // Accessing and printing elements
//		System.out.println("1D ARRAY");
//		
//        for (int i = 0; i < arr1D.length; i++) {
//        	 System.out.print(arr1D[i] + " ");
//
//        }
		
		// Enchaned For Loop
		
		for( int i : arr1D) {
       	 System.out.print(arr1D[i] + " ");

		}
	}

}
