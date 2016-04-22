package com.acadgild.session.seven;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		try{
	        int a[]=new int[5];
	        //Array has only 10 elements
	        a[7] = 9;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBounds");
	         e.printStackTrace();
	      }
		
	
	}

}
