package org.animals;

public class Giraffe extends Animals {

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
		System.out.println("Giraffe Hum!!");
	}

	@Override
	public void setFields() {
		setWeight(100);
		setAge(30);
		setColor("Yellow");
	}

	@Override
	public void printFields() {
		System.out.format("Age: %d\nColor: %s\nWeight: %d\n",getAge(),getColor(),getWeight());		
	}

}
