package org.animals;

public abstract class Animals {
	public int weight, age;
	public String color;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	abstract public boolean isVegetarian();
	abstract public boolean canClimb();
	abstract public void sound();	
	abstract public void setFields();
	abstract public void printFields();
}
