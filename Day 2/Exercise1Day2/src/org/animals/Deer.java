package org.animals;

public class Deer extends Animals {

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
		System.out.println("Deer Bellow!!");
	}

	@Override
	public void setFields() {
		setWeight(120);
		setAge(15);
		setColor("Yellow");
	}

	@Override
	public void printFields() {
		System.out.format("Age: %d\nColor: %s\nWeight: %d\n",getAge(),getColor(),getWeight());		
	}

}
