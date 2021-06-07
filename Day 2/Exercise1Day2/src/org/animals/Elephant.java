package org.animals;

public class Elephant extends Animals {

	@Override
	public boolean isVegetarian() {
		return true;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	@Override
	public void sound() {
		System.out.println("Elephant Trumpet!!");
	}

	@Override
	public void setFields() {
		setWeight(250);
		setAge(40);
		setColor("Grey");
	}

	@Override
	public void printFields() {
		System.out.format("Age: %d\nColor: %s\nWeight: %d\n",getAge(),getColor(),getWeight());
	}

}
