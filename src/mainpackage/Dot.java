package mainpackage;

import processing.core.PApplet;

/*A general purpose class for creating dots and displaying them to the main screen.*/

public class Dot {
	private float xlocation;
	private float ylocation;
	private float size;
	
	PApplet parent;
	//creates dot at a certain location but leaves its size default
	Dot(PApplet p, float x, float y){
		parent = p;
		xlocation = x;
		ylocation = y;
		size = 5;
	}
	//Sets dot location and custom size.
	Dot(PApplet p, float x, float y, float sizenum){
		parent = p;
		xlocation = x;
		ylocation = y;
		size = sizenum;
	}
    //Draw the dot to the screen.
	public void display(){
		parent.fill(255, 100);
		parent.noStroke();
		parent.ellipse(xlocation, ylocation, size, size);
	}
}
