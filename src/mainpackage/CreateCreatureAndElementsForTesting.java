package mainpackage;


import java.util.ArrayList;

import processing.core.PApplet;

//initializes some basic items for testing purposes, like creatures, food and barriers.
public class CreateCreatureAndElementsForTesting {

	ArrayList<Creature> creaturelist = new ArrayList<>();
	ArrayList<Barrier> barrierlist = new ArrayList<>();
	ArrayList<Food> foodlist = new ArrayList<>();
	
	
	
	public CreateCreatureAndElementsForTesting(PApplet p, int mouselocx, int mouselocy){
		    
		
		barrierlist.add(new Barrier(p, 50, 120, 50, 50));
		
		
		
	
	}
	
	
}
