package mainpackage;

import processing.core.PApplet;

public class Barrier {

	
	private int xlocation;
	private int ylocation;
	private int width;
	private int height;
	private int bluecolor;
	PApplet parent;
	
	public Barrier(PApplet p, int Xloc, int Yloc, int Width, int Height){
		parent = p;
		width = Width;
		height = Height;
		xlocation = Xloc;
		ylocation = Yloc;
		bluecolor = parent.color(0,0,230);
	}
	
	public void DisplayBarrier(int xloc, int yloc){
		parent.fill(bluecolor);
		parent.noStroke();
		parent.rect(xloc, yloc, width, height, 7);
	}
	
	public int getXlocation() {
		return xlocation;
	}

	public void setXlocation(int xlocation) {
		this.xlocation = xlocation;
	}

	public int getYlocation() {
		return ylocation;
	}

	public void setYlocation(int ylocation) {
		this.ylocation = ylocation;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
