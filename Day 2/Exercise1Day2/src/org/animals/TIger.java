package org.animals;

public class TIger extends Animals {

	@Override
	public boolean isVegetarian() {
		return false;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	@Override
	public void printFields() {
		System.out.format("Age: %d\nColor: %s\nWeight: %d\n",getAge(),getColor(),getWeight());		
	}

	@Override
	public void sound() {
		System.out.println("Tiger Growls!!");
	}

	@Override
	public void setFields() {
		setWeight(80);
		setAge(23);
		setColor("Yellow and Black");
	}

}
