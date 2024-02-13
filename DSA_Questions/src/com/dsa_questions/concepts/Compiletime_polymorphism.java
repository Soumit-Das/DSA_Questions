package com.dsa_questions.concepts;


//Overriding

class Animal{
	
	public void Sound() {
		
		System.out.println("Animal sounds");
		
	}
	
}

class Dog extends Animal{
	
	@Override
	public void Sound() {
		
		System.out.println("Dog barks");
		
	}
	
}


class Cat extends Animal{
	
	@Override
	public void Sound() {
		
		System.out.println("Cat mew");
		
	}
	
}


public class Compiletime_polymorphism {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.Sound();
		Animal c = new Cat();
		c.Sound();
		
	}
	
}
