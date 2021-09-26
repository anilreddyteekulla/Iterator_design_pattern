package com.iterater.pattern.week4;

class StuffedAnimalStore implements IContainer {
	public IIterator createIterator() {

		StuffedAnimalIterator result = new StuffedAnimalIterator();
		return result;

	}

}
