package com.iterater.pattern.week4;

public class StuffedAnimalTestDrive {

	public static void main(String[] args) {

		System.out.println("Get Stuffed Animal Toys by Iterator");
		IContainer iContainer = new StuffedAnimalStore();
		IIterator iIterator = iContainer.createIterator();
		while (iIterator.hasNext()) {
			Object stuffedAnimal = iIterator.next();
			System.out.println(stuffedAnimal);
		}

	}

}
