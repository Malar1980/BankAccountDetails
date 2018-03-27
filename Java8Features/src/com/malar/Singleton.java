package com.malar;

import java.lang.reflect.Constructor;

// Singleton - to create only one instance 
public class Singleton {
	
	private static Singleton soleInstance=new Singleton();
	
	private Singleton()
	{
		System.out.println( "Creating.....");
	}
	
	public static Singleton getInstance (){
		return soleInstance;
	}

	
	public static void main(String[] args) throws Exception {
	Singleton s=Singleton.getInstance();
	Singleton s1=Singleton.getInstance();
	Singleton s3=Singleton.getInstance();
	
	System.out.println("Hashcode s :"+s.hashCode());
	System.out.println("Hashcode s1 :"+s1.hashCode());
	System.out.println("Hashcode s3 :"+s3.hashCode());

	// Violating Singleton try to create more Instances
	
	// 1.Reflection 2.Serialization and deserialization 3. Cloning 4.GarbageCollection 5.Multiple class loaders 6. Multithreaded
	
	// 1. Reflection
	
	Class singletonClass=Class.forName("com.malar.Singleton");
	Constructor<Singleton> singletonReflection=singletonClass.getDeclaredConstructor();
	singletonReflection.setAccessible(true);
	Singleton s4=singletonReflection.newInstance();
	
	System.out.println("Hashcode Reflection Singleton :"+s4.hashCode());
	}

}
