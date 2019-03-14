package com.soumyadeep.journaldev.factory;

public class TestFactory {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getInstance("pc", "pcram", "pchdd", "pccpu");
		Computer server = ComputerFactory.getInstance("server", "serverram", "serverhdd", "servercpu");

		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}
