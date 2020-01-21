package com.exemplo.main;

import com.exemplo.polimorfismo.Animal;
import com.exemplo.polimorfismo.Cachorro;
import com.exemplo.polimorfismo.Gato;
import com.exemplo.polimorfismo.Processar;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal cachorro = new Cachorro();

		Animal gato = new Gato();
		gato.dizerTipo();
		
		Processar proc = new Processar();	
		proc.processarAnimal(gato);

	}
}
