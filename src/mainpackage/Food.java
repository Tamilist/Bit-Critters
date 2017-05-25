package mainpackage;

import processing.core.PApplet;
//Food for the creatures to eat.
public class Food {
	
	PApplet parent;
	
	int foodcolor;
	int size;
	float xlocation;
	float ylocation;
	
	//Sets up the foods color and other properties.
	public Food(PApplet P, float Xloc, float Yloc, int Size){
		parent = P;
		foodcolor = parent.color(0, 128, 0);
		xlocation = Xloc;
		ylocation = Yloc;
		size = Size;
	}
	//Displays the food to the screen.
	public void DisplayFood(){
		parent.fill(foodcolor);
		parent.noStroke();
		parent.ellipse(xlocation, ylocation, size, size);
	}
	
	public float getXlocation() {
		return xlocation;
	}
	public void setXlocation(float xlocation) {
		this.xlocation = xlocation;
	}
	public float getYlocation() {
		return ylocation;
	}
	public void setYlocation(float ylocation) {
		this.ylocation = ylocation;
	}
	
}
