package org.animals;

public class Monkey extends Animals {

	@Override
	public boolean isVegetarian() {
		return true;
	}

	@Override
	public boolean canClimb() {
		return true;
	}

	@Override
	public void sound() {
		System.out.println("Monkey Screech!!");
	}

	@Override
	public void setFields() {
		setWeight(40);
		setAge(10);
		setColor("Brown");
	}

	@Override
	public void printFields() {
		System.out.format("Age: %d\nColor: %s\nWeight: %d\n",getAge(),getColor(),getWeight());		
	}
}