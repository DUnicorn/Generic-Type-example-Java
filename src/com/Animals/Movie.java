package com.Animals;

import java.util.ArrayList;

public class Movie<T extends Animal> implements Comparable<Movie<T>> {

	private String name;

	private ArrayList<T> characters = new ArrayList<>();

	public Movie(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean addAnimal(T animal) {
		if (characters.contains(animal)) {
			System.out.println(animal.getName() + " is already in this movie");
			return false;
		} else {
			characters.add(animal);
			System.out.println(animal.getName() + " picked for movie " + this.name);
			return true;
		}
	}

	public int numAnimals() {
		return this.characters.size();
	}

	@Override
	public int compareTo(Movie<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
