package com.blz.utils;

public class PracticeFDP {
public static void main(String[] args) {
	
	Computer pc = ComputerFactory.getComputer("pC", "20GB", "10GB", "25GB");
	Computer laptop = ComputerFactory.getComputer("LapTOP", "30GB", "9GB", "17GB");
	Computer server = ComputerFactory.getComputer("SeRvEr", "5GB", "7GB", "27GB");
	System.out.println("PC: "+pc);
	System.out.println("SERVER: "+server);
	System.out.println("LAPTOP: "+laptop);
}

}

abstract class Computer {
   public abstract String getRAM();
   public abstract String getHDD();
   public abstract String getCPU();
	
   public String toString() {
	   return "RAM = "+getRAM()+" HDD = "+getHDD()+" CPU ="+getCPU();
   }
   
}

class Server extends Computer {
  private String RAM;
  private String CPU;
  private String HDD;

	public Server(String rAM, String cPU, String hDD) {
	this.RAM = rAM;
	this.CPU = cPU;
	this.HDD = hDD;
}

	@Override
	public String getRAM() {
		
		return this.RAM;
	}

	@Override
	public String getHDD() {
		
		return this.HDD;
		}

	@Override
	public String getCPU() {
		
		return this.CPU;
	}
		
}

class Laptop extends Computer {
	  private String RAM;
	  private String CPU;
	  private String HDD;

		public Laptop(String rAM, String cPU, String hDD) {
		this.RAM = rAM;
		this.CPU = cPU;
		this.HDD = hDD;
	}

		@Override
		public String getRAM() {
			
			return this.RAM;
		}

		@Override
		public String getHDD() {
			
			return this.HDD;
			}

		@Override
		public String getCPU() {
			
			return this.CPU;
		}
			
	}



class Pc extends Computer {
	  private String RAM;
	  private String CPU;
	  private String HDD;

		public Pc(String rAM, String cPU, String hDD) {
		this.RAM = rAM;
		this.CPU = cPU;
		this.HDD = hDD;
	}

		@Override
		public String getRAM() {
			
			return this.RAM;
		}

		@Override
		public String getHDD() {
			
			return this.HDD;
			}

		@Override
		public String getCPU() {
			
			return this.CPU;
		}	
		
	}

class ComputerFactory {
	
	public static Computer getComputer(String type, String RAM, String CPU, String HDD) {
	if("Pc".equalsIgnoreCase(type))
		return new Pc(RAM, CPU, HDD);
	else if("Server".equalsIgnoreCase(type))
		return new Server(RAM, CPU, HDD);
	else if("Laptop".equalsIgnoreCase(type))
		return new Laptop(RAM, CPU, HDD);
		
	return null;
	}
	
}




