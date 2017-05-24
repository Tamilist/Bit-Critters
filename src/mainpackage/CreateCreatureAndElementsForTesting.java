package mainpackage;


import processing.core.PApplet;

//initializes some basic items for testing purposes, like creatures, food and barriers.
public class CreateCreatureAndElementsForTesting {

	public Creature creature;
	public Food testfood;
	public Barrier barrier;
	public CreateCreatureAndElementsForTesting(PApplet p){
		    
		
		creature = new Creature(p, p);
		testfood = new Food(p, 50, 50, 10);
		barrier = new Barrier(p, 20, 20, 50, 50);
		
	
	}
	
	
}
