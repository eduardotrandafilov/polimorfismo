package com.exemplo.polimorfismo;

public class Gato extends Animal {
	public void dizerTipo() {
		System.out.println("Gato");
		tipoAnimal();
		
	}
	
	public void tipoAnimal() {
		System.out.println("Felino");
	}
	
}