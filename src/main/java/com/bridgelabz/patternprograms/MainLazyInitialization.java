package com.bridgelabz.patternprograms;

public class MainLazyInitialization {
	
	 public static void main(String[] args) {
		 LazyInitialization s1;
		 s1 = LazyInitialization.getInstance();
         s1.name();
}
}

class LazyInitialization{
	
	private static LazyInitialization instance;
	private LazyInitialization(){ 
	}
	
	public static LazyInitialization getInstance() {
		if(instance == null)
			instance = new LazyInitialization();
	return instance;
	}
	protected void name() {
		System.out.println("Hello I am a string part of Singleton class");
	}
	
}

