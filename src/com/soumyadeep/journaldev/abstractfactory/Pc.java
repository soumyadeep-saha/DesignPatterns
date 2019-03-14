package com.soumyadeep.journaldev.abstractfactory;

public class Pc extends Computer{
	
	public String ram;
	public String hdd;
	public String cpu;
	
	public Pc(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRam() {
		return this.ram;
	}

	@Override
	public String getHdd() {
		return this.hdd;
	}

	@Override
	public String getCpu() {
		return this.cpu;
	}
}
