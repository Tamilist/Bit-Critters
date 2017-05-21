package mainpackage;

import processing.core.PApplet;

public class CreateCreatureAndElementsForTesting {

	public Creature creature;
	public Food testfood;
	public Dot dot;
	
	public CreateCreatureAndElementsForTesting(PApplet p){
		
			 dot = new Dot(p, 50, 50, 100);
			 creature = new Creature(p, p);
			 testfood = new Food(p, 50, 50, 10);
		
	
	}
	
	
}
