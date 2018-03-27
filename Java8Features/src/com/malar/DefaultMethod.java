package com.malar;

public class DefaultMethod implements DefaultMethodInterface{
	
	
	public static void main(String[] args) {
		DefaultMethodInterface defaultMethodinterface;
		defaultMethodinterface=new DefaultMethod();
		
		defaultMethodinterface.callMe();
		defaultMethodinterface.callMeToo();

	}

	@Override
	public void callMe() {
		System.out.println("Method Implementation fromInterface");
	}

}
