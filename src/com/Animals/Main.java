package com.Animals;

public class Main {
	public static void main(String[] args) {

		Dinosaur rex = new Dinosaur("TRex");
		Fish nemo = new Fish("Nemo");
		Mammal sid = new Mammal("Sid");
		Reptile rango = new Reptile("Rango");

		Fish someFish = new Fish("fish");

		Movie<Dinosaur> jurassic = new Movie<>("Jurassic park");
		jurassic.addAnimal(rex);
		// jurassic.addAnimal(fish); can't do it.

		Movie<Fish> nemoM = new Movie<>("Nemo movie");
		nemoM.addAnimal(nemo);

		Movie<Mammal> iceAge = new Movie<>("Ice Age");
		iceAge.addAnimal(sid);

		Movie<Reptile> rangoM = new Movie<>("Rango movie");
		rangoM.addAnimal(rango);

		System.out.println(jurassic.getName() + " character: " + jurassic.numAnimals());

	}

}
