package com.rk.shapes;

public class Line implements Drawable,Fillable{
	private double size, thickness;
	private String fillingColor, drawingColor;
	
	@Override
	public void fillingColor() {
		fillingColor = null;
	}

	@Override
	public void size() {
		size = 10;
	}

	@Override
	public void drawingColor() {
		drawingColor = "Blue";
	}

	@Override
	public void thickness() {
		thickness = 1;
	}
	
	public void display() {
		System.out.println("Size: "+size);
		System.out.println("Thickness: "+thickness);
		System.out.println("Drawing Color: "+drawingColor);
		System.out.println("Filling Color: "+fillingColor);
	}
}
