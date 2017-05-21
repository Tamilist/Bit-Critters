
/*This project will be a creature made up of specific part like a brain, eyes, mouth and so on.
 * The different parts will send messages to each other similar to how a nervous system 
 * would work in a very simplistic way.*/

package mainpackage;

import processing.core.PApplet;

public class MainClass extends PApplet {
	
	private float winwidth  = 600;
	private float winheight = 600;
	
	public float GetWinHeight(){
		return winheight;
	}
	
	public float GetWinWidth(){
		return winwidth;
	}
	
	//Generic dots
	Dot dot = new Dot(this, 50, 50, 100);
	Creature creature = new Creature(this, this);
	
	public void settings(){
		size(600, 600);
	}
	
	public void draw(){
		
		background(100);
		dot.display();
		creature.body.displaybody();
		//makes the creature move around to a set point
		creature.braincon.pathinglobe.MoveBodyToPoint(creature.body);
		creature.braincon.pathinglobe.CheckIfAtDestination(creature.body, GetWinHeight(), GetWinWidth());
		creature.braincon.pathinglobe.CheckIfOutOfBounds(creature.body, GetWinHeight(), GetWinWidth());
	}

	public void setup(){
		fill(255, 255, 255);
	}
	
	public static void main(String[] args) {
		
		
		PApplet.main("mainpackage.MainClass");
		

	}

}
