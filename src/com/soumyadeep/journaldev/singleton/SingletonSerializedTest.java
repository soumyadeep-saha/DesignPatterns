package com.soumyadeep.journaldev.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerializedSingleton serializedSingleton = SerializedSingleton.getInstance();

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(serializedSingleton);
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializedSingleton inputObject = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("output object hashCode= " + serializedSingleton.hashCode());
		System.out.println("input object hashCode= " + inputObject.hashCode());

		/*
		 * So it destroys the singleton pattern, to overcome this scenario all we need
		 * to do it provide the implementation of readResolve() method.
		 * 
		 * Copy protected Object readResolve() { return getInstance(); }
		 */
	}
}
