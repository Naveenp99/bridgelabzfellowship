package com.bridgelabz.patternprograms;

public class FactoryPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "2.9 GHz");
		Computer laptop = ComputerFactory.getComputer("laptop", "256 GB", "3.4 GHz");
		System.out.println("Factory PC Config::  " + pc);
		System.out.println("Factory Server Config::  " + server);
		System.out.println("Factory Laptop Config::  " + laptop);
	}

}

abstract class Computer {

	public abstract String getRAM();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", CPU=" + this.getCPU();
	}
}

class PC extends Computer {

	private String ram;
	
	private String cpu;

	public PC(String ram, String cpu) {
		this.ram = ram;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
}

class Server extends Computer {

	private String ram;
	
	private String cpu;

	public Server(String ram, String cpu) {
		this.ram = ram;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
}

class Laptop extends Computer{
	
    private String ram;
	
	private String cpu;
	
	public Laptop(String ram, String cpu) {
		this.ram = ram;
		this.cpu = cpu;
	}

	public String getRAM() {
		return ram;
	}

	
	public String getCPU() {
		return cpu;
	}
	
}

class ComputerFactory {

	public static Computer getComputer(String type, String ram, String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, cpu);
		else if ("Laptop".equalsIgnoreCase(type))
			return new Laptop(ram, cpu);
		return null;
	}
}
