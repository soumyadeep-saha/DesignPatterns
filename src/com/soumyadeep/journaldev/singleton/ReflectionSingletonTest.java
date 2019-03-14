package com.soumyadeep.journaldev.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {

		/*
		 * Reflection can be used to destroy all the above singleton implementation
		 * approaches. Let�s see this with an example class.
		 */

		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;
		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());

		/*
		 * When you run the above test class, you will notice that hashCode of both the
		 * instances is not same that destroys the singleton pattern. Reflection is very
		 * powerful and used in a lot of frameworks like Spring and Hibernate, do check
		 * out Java Reflection Tutorial.
		 */
	}
}
