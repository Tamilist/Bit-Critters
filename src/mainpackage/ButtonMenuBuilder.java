package mainpackage;

import controlP5.ControlP5;
import processing.core.PApplet;
import controlP5.*;

public class ButtonMenuBuilder {

	ControlP5 cp5;
	//All of the buttons that make up the menu for selecting an element.
	Button creaturebutton;
	Button barrierbutton;
	Button foodbutton;
	Button closemenubutton;
	Button menubutton;
	
	//Sets up the element selection buttons, but keeps them hidden until the open menu
	//button is clicked.
	public ButtonMenuBuilder(PApplet p){
		cp5 = new ControlP5(p);
		 menubutton = cp5.addButton("OpenMenu");
	     menubutton.setValue(0)
	     .setPosition(20,10)
	     .setSize(40,20)
	     ;
	     
		 creaturebutton = cp5.addButton("Creature");
	     creaturebutton.setValue(0)
	     .hide()
	     .setPosition(70,10)
	     .setSize(40, 20)
	     ;
	     
	     barrierbutton = cp5.addButton("Barrier");
	     barrierbutton.setValue(0)
	     .hide()
	     .setPosition(120,10)
	     .setSize(40, 20)
	     ;
	     
	     foodbutton = cp5.addButton("Food");
	     foodbutton.setValue(0)
	     .hide()
	     .setPosition(170,10)
	     .setSize(40, 20)
	     ;
	     
	     closemenubutton = cp5.addButton("Close");
	     closemenubutton.setValue(0)
	     .hide()
	     .setPosition(220,10)
	     .setSize(40,20)
	     ;
	}
	
	
	
	public void DeleteSelectionButtons(){
		cp5 = null;
	}
}
