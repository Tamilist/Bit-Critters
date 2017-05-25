package mainpackage;

import java.awt.List;
import java.util.ArrayList;

import processing.core.PApplet;

public class CreateCreatureAndElements {

	ArrayList<Creature> creaturelist = new ArrayList<Creature>();
	public CreateCreatureAndElements(){
		
	}
	//Sets up some simple elements for testing purposes.
	public void MakeTestCreatureAndElements(PApplet p, int mouselocx, int mouselocy){
		
		
		
		Dot dot = new Dot(p, 50, 50, 100);
		
		Food testfood = new Food(p, 50, 50, 10);
	}
}
