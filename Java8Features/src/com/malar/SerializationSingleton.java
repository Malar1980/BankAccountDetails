
package com.malar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Singleton - to create only one instance 
class Singleton implements Serializable {

	private static Singleton soleInstance = new Singleton();

	private Singleton() {
		System.out.println("Creating.....");
	}

	public static Singleton getInstance() {
		return soleInstance;
	}

}

public class SerializationSingleton {
	public static void main(String args[]) throws Exception {

		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

		System.out.println("Hashcode s :" + s.hashCode());
		System.out.println("Hashcode s1 :" + s1.hashCode());
		System.out.println("Hashcode s3 :" + s3.hashCode());

		// Violating Singleton try to create more Instances

		// 1.Reflection 2.Serialization and deserialization 3. Cloning
		// 4.GarbageCollection 5.Multiple class loaders 6. Multithreaded

		// 1. Serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/Users/taruvan/s3.ser"));
		oos.writeObject(s);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/Users/taruvan/s3.ser"));
		Singleton s4 = (Singleton) ois.readObject();

		

		System.out.println("Hashcode Reflection Singleton :" + s4.hashCode());
	}
}
