package org.animals;

public class Lion extends Animals {
	
	@Override
	public void printFields() {
		System.out.format("Age: %d\nColor: %s\nWeight: %d\n",getAge(),getColor(),getWeight());
	}

	@Override
	public boolean isVegetarian() {
		return false;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	@Override
	public void sound() {
		System.out.println("Lion Roars!!");
	}

	@Override
	public void setFields() {
		setWeight(90);
		setAge(20);
		setColor("Yellow");
		
	}

}
