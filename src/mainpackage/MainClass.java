
/*This project will be a creature made up of specific part like a brain, eyes, mouth and so on.
 * The different parts will send messages to each other similar to how a nervous system 
 * would work in a very simplistic way.*/

package mainpackage;
import java.io.IOException;
import java.util.Random;

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
	Random rand = new Random();
	
	
	String[] namelist = new String[]{"Michael", "Sarah", "jennifer", "John", "Hannah", "Megan", "Charlie", 
			"harold", "Joseph", "Katie", "Bob", "Leslie", "Frasier", "Niles", "Alucard", "George", "Will", 
			"Walter", "Harry", "Seras", "Jordan", "Sally", "Sue", "Edward", "Jon", "Austin", "Rupert", 
			"Wallace", "Urist", "Doge", "Ellen", "Richard", "Monica", "Ross", "Joey", "Rachael", "Phoebe", 
			"Chandler", "Matthew", "Jack", "Gerald", "Mac", "Annabelle", "Gram", "Tarn", "Zach"};
	CurrentMouseSelection curmouseselection = new CurrentMouseSelection();
	
	//Sets up the class that creates some basic elements for testing purposes.
	
	CreateCreatureAndElementsForTesting creaturetesting = new CreateCreatureAndElementsForTesting(this, mouseX, mouseY);
	ButtonMenuBuilder bmb;
	
	
	public void settings(){
		size(600, 600);
	}
	
	//Decides what to place by checking the currentselection value.
	public void mouseClicked(){
		if (mouseY >= 70){
		if (curmouseselection.GetCurrentSelection() == 2){
			
			//Sets up the  creature when the mouse is clicked and the proper button is selected.
			creaturetesting.creaturelist.add(new Creature(this, this, mouseX, mouseY, namelist[rand.nextInt(namelist.length)]));
			
			}
		if(curmouseselection.GetCurrentSelection() == 1) {
			creaturetesting.barrierlist.add(new Barrier(this, mouseX-10, mouseY-10, 20, 20));
			}
		}
		if(curmouseselection.GetCurrentSelection() == 3) {
			if (mouseY >= 70){
			creaturetesting.foodlist.add(new Food(this, mouseX, mouseY, 5));
			}
		}
		
	}
	
	public void draw(){
		
		//sets the background color.
		background(135, 206, 250);
		
		//displays the graphics for the critters and other elements like food and barriers.
		
		
		
		//Goes through the creaturelist and performs the display and checks for each one.
		
		for(int i = 0; i < creaturetesting.creaturelist.size(); i++){
			
			creaturetesting.creaturelist.get(i).body.displaybody(creaturetesting.creaturelist.get(i), this);
			
			//If the critters hunger is low, it will move towards a peice
			if (creaturetesting.creaturelist.get(i).getHungerlevel() <= 5){
				creaturetesting.creaturelist.get(i).braincon.pathinglobe.SetPointsToFood(creaturetesting.creaturelist.get(i).body, creaturetesting.foodlist);
			}	
			//Decrements the critter hunger over time
			creaturetesting.creaturelist.get(i).DecrementHunger();
			//Check if the critter has arrived at the food.
			creaturetesting.creaturelist.get(i).braincon.pathinglobe.CheckIfOverFood(creaturetesting.creaturelist.get(i), creaturetesting.foodlist);
			
			creaturetesting.creaturelist.get(i).braincon.pathinglobe.MoveBodyToPoint(creaturetesting.creaturelist.get(i).body);
			creaturetesting.creaturelist.get(i).braincon.pathinglobe.CheckIfAtDestination(creaturetesting.creaturelist.get(i).body, GetWinHeight(), GetWinWidth());
			creaturetesting.creaturelist.get(i).braincon.pathinglobe.CheckIfOutOfBounds(creaturetesting.creaturelist.get(i).body, GetWinHeight(), GetWinWidth());
			//Checks if the critter is touching a barrier then moves it away in the proper direction. Not yet finished.
			creaturetesting.creaturelist.get(i).braincon.pathinglobe.CheckIfCloseToObject(this, creaturetesting.creaturelist.get(i).body, creaturetesting.barrierlist);
		}
		
         for(int i = 0; i < creaturetesting.barrierlist.size(); i++){
			
	creaturetesting.barrierlist.get(i).DisplayBarrier(creaturetesting.barrierlist.get(i).getXlocation(), creaturetesting.barrierlist.get(i).getYlocation() );
		}
         
         for(int i = 0; i < creaturetesting.foodlist.size(); i++){
        	 creaturetesting.foodlist.get(i).DisplayFood();
         }
		
		
		
		
		
	}

	//Sets up main Processing functions.
	public void setup(){
		fill(255, 255, 255);
		//The object that handles creation of menus.
		bmb = new ButtonMenuBuilder(this);
		surface.setTitle("Bit Critters");
		
		
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
	 public void Food(){
		 curmouseselection.SetCurrentSelection(3);
	 }
	
	
	
	public static void main(String[] args) {
		
		
		
		PApplet.main("mainpackage.MainClass");
		

	}

}
