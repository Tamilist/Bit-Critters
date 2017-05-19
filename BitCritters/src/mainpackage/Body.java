package mainpackage;

import processing.core.PApplet;

/*Holds all the various parts that make up the creature.*/
public class Body {
	//These variables will be used to display the creatures body to the screen.
	private float locx;
	private float locy;
	private float bodysize;
	private PApplet parent;
	
	
	
	private int bodycolor;
	
	//Creates the body with custom coordinates buts sets the color to a default value.
	public Body(int x, int y, PApplet p, float size){
		locx = x;
		locy = y;
		parent = p;
		bodysize = size;
		
	}
	
	//Used for creating a body with a user defined color, coordinates, and parent.
	public Body(int x, int y, PApplet p, float size, int Bodycolor){
		locx = x;
		locy = y;
		parent = p;
		bodysize = size;
		bodycolor = Bodycolor;
	}
	//Prints the body to the screen
	public void displaybody(){
		parent.fill(bodycolor);
		parent.noStroke();
		parent.ellipse(getLocx(), getLocy(), bodysize, bodysize);
	}

	public float getLocx() {
		return locx;
	}

	public void setLocx(float locx) {
		this.locx = locx;
	}

	public float getLocy() {
		return locy;
	}

	public void setLocy(float locy) {
		this.locy = locy;
	}
	
	public int GetColor(){
		return bodycolor;
	}
	
	
	

}
