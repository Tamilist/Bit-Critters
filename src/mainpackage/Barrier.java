package mainpackage;

import processing.core.PApplet;

public class Barrier {

	private float xlocation;
	private float ylocation;
	private int width;
	private int height;
	private int bluecolor;
	PApplet parent;
	
	public Barrier(PApplet p, float Xloc, float Yloc, int Width, int Height){
		parent = p;
		width = Width;
		height = Height;
		xlocation = Xloc;
		ylocation = Yloc;
		bluecolor = parent.color(0,0,230);
	}
	
	public void DisplayBarrier(){
		parent.fill(bluecolor);
		parent.noStroke();
		parent.rect(width, height, xlocation, ylocation, 7);
	}
}
