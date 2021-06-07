package com.rk.shapes;

public class Square implements Drawable, Fillable{
	private double size, thickness;
	private String fillingColor, drawingColor;
	@Override
	public void fillingColor() {
		fillingColor = "Orange";		
	}
	@Override
	public void size() {
		size = 12.5;		
	}
	@Override
	public void drawingColor() {
		drawingColor = "Red";		
	}
	@Override
	public void thickness() {
		thickness = 4;		
	}
	
	public void display() {
		System.out.println("Size: "+size);
		System.out.println("Thickness: "+thickness);
		System.out.println("Drawing Color: "+drawingColor);
		System.out.println("Filling Color: "+fillingColor);
	}	
}