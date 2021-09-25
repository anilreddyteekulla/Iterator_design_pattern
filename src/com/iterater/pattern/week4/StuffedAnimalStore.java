package com.iterater.pattern.week4;

class StuffedAnimalStore implements IContainer {

	private String stuffedAnimals[] = { "Teddy Bear", "Bunny", "Panda", "Monkey" };

	public IIterator createIterator() {

		StuffedAnimalIterator result = new StuffedAnimalIterator();
		return result;

	}

	private class StuffedAnimalIterator implements IIterator {

		private int position;

		public boolean hasNext() {
			return (position < stuffedAnimals.length) ? true : false;
		}

		public Object next() {
			return (this.hasNext()) ? stuffedAnimals[position++] : null;
		}
	}

}
