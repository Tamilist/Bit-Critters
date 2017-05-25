package mainpackage;


import processing.core.PApplet;

/*A wrapper class that bundles the body, parts and brain together to form a creature*/
public class Creature {
	PApplet parent;
	public int redcolor;
	public int hungerlevel;
	
	
	
	//All of the different pieces that make up the creature.
	public Body body;
	
	public BrainContainer braincon;
	
	
	
	//Contructor for creating the creature with the proper body parts. The parents of both
	//the creature and body of the creature will be the main window.
	public Creature(PApplet AppletForBody, PApplet AppletForCreature, int locx, int locy ){
		
		
		//The body needs its location and parent PApplet set when its first created.
		parent = AppletForCreature;
		redcolor = parent.color(255, 0, 0);
		body = new Body(locx, locy, AppletForBody, 10, redcolor);
		braincon = new BrainContainer(body);
		hungerlevel = 500;
		
		
		}



	public int getHungerlevel() {
		return hungerlevel;
	}



	public void setHungerlevel(int hungerlevel) {
		this.hungerlevel = hungerlevel;
	}
	
	public void DecrementHunger(){
		hungerlevel = hungerlevel - 1;
		if (hungerlevel < 0){
			hungerlevel = 0;
		}
	}
	

	
}
