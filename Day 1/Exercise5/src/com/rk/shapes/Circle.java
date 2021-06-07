package com.rk.shapes;

public class Circle implements Drawable, Fillable{
	private double size, thickness;
	private String fillingColor, drawingColor;
	
	@Override
	public void fillingColor() {
		fillingColor = "Yellow";
	}

	@Override
	public void size() {
		size = 15;
	}

	@Override
	public void drawingColor() {
		drawingColor = "Black";
	}

	@Override
	public void thickness() {
		thickness = 2.1;
	}
	
	public void display() {
		System.out.println("Size: "+size);
		System.out.println("Thickness: "+thickness);
		System.out.println("Drawing Color: "+drawingColor);
		System.out.println("Filling Color: "+fillingColor);
	}
	
}
