package com.malar;

public interface Animal {
	default void eat() 
	 
	   { 
	     System.out.println("Animals Eat Meat,grass");   
	   } 
	 
	 
	 
	   default  void sleep() 
	 
	   { 
	      System.out.println("Sleeping..........");
	 
	   }
	   void makeNoise();

}
