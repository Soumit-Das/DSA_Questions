package com.dsa_questions.concepts;

import java.util.*;

class Car{
	
	public void Engine() {
		
		System.out.println("Engine not specified");
		
	}
	
}

class Ferrari extends Car{
	
	@Override
	public void Engine() {
		
		System.out.println("3.9L V8");
		
	}
	
}

class Porsche extends Car{
	
	@Override
	public void Engine() {
		super.Engine();
		System.out.println("4.0L Flat 6");
		
	}
	
}


public class Runtime_polymorphism {

	public static void main(String[] args) {
		
		Car f = new Ferrari();
		f.Engine();
		System.out.println();
		Car p = new Porsche();
		p.Engine();
		
	}
	
}
