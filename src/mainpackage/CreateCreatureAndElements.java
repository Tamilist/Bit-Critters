package mainpackage;

import processing.core.PApplet;

public class CreateCreatureAndElements {

	public CreateCreatureAndElements(){
		
	}
	//Sets up some simple elements for testing purposes.
	public void MakeTestCreatureAndElements(PApplet p){
		Dot dot = new Dot(p, 50, 50, 100);
		Creature creature = new Creature(p, p);
		Food testfood = new Food(p, 50, 50, 10);
	}
}
