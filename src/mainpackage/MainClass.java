
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
	
	CurrentMouseSelection curmouseselection = new CurrentMouseSelection();
	
	//Sets up the class that creates some basic elements for testing purposes.
	
	CreateCreatureAndElementsForTesting creaturetesting = new CreateCreatureAndElementsForTesting(this, mouseX, mouseY);
	ButtonMenuBuilder bmb;
	
	public void settings(){
		size(600, 600);
	}
	
	public void mouseClicked(){
		if (mouseY > 40){
		if (curmouseselection.GetCurrentSelection() == 2){
			
			creaturetesting.creaturelist.add(new Creature(this, this, mouseX, mouseY));
			
			}
		else if(curmouseselection.GetCurrentSelection() == 1) {
			creaturetesting.barrierlist.add(new Barrier(this, mouseX-10, mouseY-10, 20, 20));
			}
		}
		
		else {}
	}
	
	public void draw(){
		
		//sets the background color.
		background(135, 206, 250);
		
		//displays the graphics for the creatures and other elements like food and barriers.
		
		
		creaturetesting.testfood.DisplayFood();
		//Goes through the creaturelist and performs the display and checks for each one.
		
		
		for(int i = 0; i < creaturetesting.creaturelist.size(); i++){
			
			creaturetesting.creaturelist.get(i).body.displaybody();
			
			creaturetesting.creaturelist.get(i).braincon.pathinglobe.MoveBodyToPoint(creaturetesting.creaturelist.get(i).body);
			creaturetesting.creaturelist.get(i).braincon.pathinglobe.CheckIfAtDestination(creaturetesting.creaturelist.get(i).body, GetWinHeight(), GetWinWidth());
			creaturetesting.creaturelist.get(i).braincon.pathinglobe.CheckIfOutOfBounds(creaturetesting.creaturelist.get(i).body, GetWinHeight(), GetWinWidth());
			//Checks if the criiter is touching a barrier then moves it away in the proper direction. Not yet finished.
			creaturetesting.creaturelist.get(i).braincon.pathinglobe.CheckIfCloseToObject(this, creaturetesting.creaturelist.get(i).body, creaturetesting.barrierlist);
		}
		
         for(int i = 0; i < creaturetesting.barrierlist.size(); i++){
			
	creaturetesting.barrierlist.get(i).DisplayBarrier(creaturetesting.barrierlist.get(i).getXlocation(), creaturetesting.barrierlist.get(i).getYlocation() );
		}
		
		
		
		
		
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
	//Sets the selection value to 1 for the creature.
	public void Creature(){
		curmouseselection.SetCurrentSelection(2);
	}
	
	public void Barrier(){
		curmouseselection.SetCurrentSelection(1);
	}
	
	
	
	public static void main(String[] args) {
		
		
		PApplet.main("mainpackage.MainClass");
		

	}

}
