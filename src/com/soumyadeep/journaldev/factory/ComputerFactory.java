package com.soumyadeep.journaldev.factory;

public class ComputerFactory {

	public static Computer getInstance(String type, String ram, String hdd, String cpu) {

		if ("pc".equalsIgnoreCase(type)) {
			return new Pc(ram, hdd, cpu);
		} else if ("server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}
		return null;
	}
}
