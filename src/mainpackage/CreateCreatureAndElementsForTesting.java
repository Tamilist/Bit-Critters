package mainpackage;


import java.util.ArrayList;

import processing.core.PApplet;

//initializes some basic items for testing purposes, like creatures, food and barriers.
public class CreateCreatureAndElementsForTesting {

	ArrayList<Creature> creaturelist = new ArrayList<>();
	
	public Food testfood;
	public Barrier barrier;
	public CreateCreatureAndElementsForTesting(PApplet p, int mouselocx, int mouselocy){
		    
		creaturelist.add(new Creature(p, p, mouselocx, mouselocy));
		
		testfood = new Food(p, 50, 50, 10);
		barrier = new Barrier(p, 20, 20, 50, 50);
		
	
	}
	
	
}
