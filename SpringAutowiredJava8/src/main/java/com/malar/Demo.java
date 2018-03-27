package com.malar;


public class Demo {

	public static void main(String[] args) {
		Animal animal;
		animal=new Dog();
		animal.eat();
		animal.sleep();
		animal.makeNoise();
		
		animal=new Cow();
		animal.eat();
		animal.sleep();
		animal.makeNoise();
		
		

	}

}
