package mainpackage;


import java.util.ArrayList;

import processing.core.PApplet;

//initializes some basic items for testing purposes, like creatures, food and barriers.
public class CreateCreatureAndElementsForTesting {

	ArrayList<Creature> creaturelist = new ArrayList<>();
	ArrayList<Barrier> barrierlist = new ArrayList<>();
	
	public Food testfood;
	
	public CreateCreatureAndElementsForTesting(PApplet p, int mouselocx, int mouselocy){
		    
		
		barrierlist.add(new Barrier(p, 50, 120, 50, 50));
		testfood = new Food(p, 50, 50, 10);
		
		
	
	}
	
	
}
