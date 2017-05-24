
/*This project will be a creature made up of specific part like a brain, eyes, mouth and so on.
 * The different parts will send messages to each other similar to how a nervous system 
 * would work in a very simplistic way.*/

package mainpackage;
import controlP5.*;
import processing.core.PApplet;

public class MainClass extends PApplet {
	
	
	private int winwidth  = 600;
	private int winheight = 600;
	
	public int GetWinHeight(){
		return winheight;
	}
	
	public int GetWinWidth(){
		return winwidth;
	}
	
	//Sets up the selection buttons for placing different elements.
	
	
	
	//Sets up the class that creates some basic elements for testing purposes.
	
	CreateCreatureAndElementsForTesting creaturetesting = new CreateCreatureAndElementsForTesting(this);
	ButtonMenuBuilder bmb;
	
	public void settings(){
		size(600, 600);
	}
	
	public void mouseClicked(){
		
	}
	
	public void draw(){
		
		//sets the background color.
		background(135, 206, 250);
		
		//displays the graphics for the creatures and other elements like food and barriers.
		creaturetesting.barrier.DisplayBarrier();
		
		creaturetesting.testfood.DisplayFood();
		creaturetesting.creature.body.displaybody();
		
		//makes the creature move to a set point.
		creaturetesting.creature.braincon.pathinglobe.MoveBodyToPoint(creaturetesting.creature.body);
		creaturetesting.creature.braincon.pathinglobe.CheckIfAtDestination(creaturetesting.creature.body, GetWinHeight(), GetWinWidth());
		creaturetesting.creature.braincon.pathinglobe.CheckIfOutOfBounds(creaturetesting.creature.body, GetWinHeight(), GetWinWidth());
		
	}

	//Sets up main Processing functions.
	public void setup(){
		fill(255, 255, 255);
		//The object that handles creation of menus.
		bmb = new ButtonMenuBuilder(this);
		
	}
	//The Open Menu button will call this function when clicked. Unfortunately these methods 
	//seem to only work while inside the main class.
	public void OpenMenu(){
		
		bmb.menubutton.hide();
		bmb.creaturebutton.show();
		bmb.barrierbutton.show();
		bmb.foodbutton.show();
		bmb.closemenubutton.show();
		
		
	}
	//The close button will call this function when its clicked.
	public void Close(){
		
		bmb.menubutton.show();
		bmb.creaturebutton.hide();
		bmb.barrierbutton.hide();
		bmb.foodbutton.hide();
		bmb.closemenubutton.hide();
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		PApplet.main("mainpackage.MainClass");
		

	}

}
