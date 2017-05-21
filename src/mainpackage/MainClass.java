
/*This project will be a creature made up of specific part like a brain, eyes, mouth and so on.
 * The different parts will send messages to each other similar to how a nervous system 
 * would work in a very simplistic way.*/

package mainpackage;

import processing.core.PApplet;

public class MainClass extends PApplet {
	
	private int winwidth  = 290;
	private int winheight = 290;
	
	public int GetWinHeight(){
		return winheight;
	}
	
	public int GetWinWidth(){
		return winwidth;
	}
	//Sets up the class that creates some basic elements for testing purposes.
	CreateCreatureAndElementsForTesting creaturetesting = new CreateCreatureAndElementsForTesting(this);
	
	public void settings(){
		size(300, 300);
	}
	
	public void draw(){
		//sets the background color.
		background(100);
		
		//displays the graphics for the creatures and other elements like food and barriers.
		creaturetesting.dot.display();
		creaturetesting.testfood.DisplayFood();
		creaturetesting.creature.body.displaybody();
		
		//makes the creature move to a set point.
		creaturetesting.creature.braincon.pathinglobe.MoveBodyToPoint(creaturetesting.creature.body);
		creaturetesting.creature.braincon.pathinglobe.CheckIfAtDestination(creaturetesting.creature.body, GetWinHeight(), GetWinWidth());
		creaturetesting.creature.braincon.pathinglobe.CheckIfOutOfBounds(creaturetesting.creature.body, GetWinHeight(), GetWinWidth());
		
	}

	public void setup(){
		fill(255, 255, 255);
	}
	
	public static void main(String[] args) {
		
		
		PApplet.main("mainpackage.MainClass");
		

	}

}
