package com.iterater.pattern.week4;

public class StuffedAnimalIterator implements IIterator {
	private String stuffedAnimals[] = { "Teddy Bear", "Bunny", "Panda", "Monkey" };

	int position = 0;

	public boolean hasNext() {
		return (position < stuffedAnimals.length) ? true : false;
	}

	public Object next() {
		return (this.hasNext()) ? stuffedAnimals[position++] : null;
	}
}
