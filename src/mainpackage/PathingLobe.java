package mainpackage;

import java.util.ArrayList;
import java.util.Random;

import processing.core.PApplet;

public class PathingLobe {

	public float pointx;
	public float pointy;
	
	//Starts the creatures first target at its body location.
	public PathingLobe(Body body){
		pointx = body.getLocx();
		pointy = body.getLocy();
		
	}
	//Unimplemented.
	public void PerformStatusChecks(){
		
	}
	
	public void MoveBodyBack(Body body){
		pointx = body.getLocx() - 5;
	}
	
	public void MoveBodyToPoint(Body body){
	    if (pointx > body.getLocx()){
	    	body.setLocx(body.getLocx() + 1);
	    }
	    
	    if(pointx < body.getLocx()){
	    	body.setLocx(body.getLocx() - 1);
	    }
	    
	    if (pointy > body.getLocy()){
	    	body.setLocy(body.getLocy() + 1);
	    }
	    
	    if (pointy < body.getLocy()){
	    	body.setLocy(body.getLocy() - 1);
	    }
	    
	    
	}
	
	//Sets the critters destination to a peice of food.
	public void SetPointsToFood(Body body, ArrayList<Food> foodlist){
	    if (foodlist.isEmpty() == false){
	    pointx = foodlist.get(0).getXlocation();
	    pointy = foodlist.get(0).getYlocation();
	    }
	    
	}
	
	public void CheckIfAtDestination(Body body, int Height, int Width){
		Random rand = new Random();
		
		if (body.getLocx() == pointx){
			int rannum = rand.nextInt(Width) + 1;
			pointx = (float) rannum;
		}
		
		if (body.getLocy() == pointy){
			int rannum = rand.nextInt(Height) + 1;
			pointy = (float) rannum;
	}
  }
	
	//Runs several checks to make sure the creatures body hasnt gone off the screen.
	public void CheckIfOutOfBounds(Body body, int Width, int Height){
		Random rand = new Random();
		if (body.getLocx() <= 0){
			int rannumfrommap = rand.nextInt(Width) +1;
			pointx = (float) rannumfrommap;
	}
		if (body.getLocy() <= 0){
			int rannumfrommap = rand.nextInt(Height) + 1;
			pointy = (float) rannumfrommap;
		}
		

		if (body.getLocx() >= Width){
			int rannumfrommap = rand.nextInt(Width) + 1;
			pointx = (float) rannumfrommap;
		}
		

		if (body.getLocy() >= Height){
			int rannumfrommap = rand.nextInt(Height) + 1;
			pointy = (float) rannumfrommap;
		}	
	
    }
	
	//Compares the creatures body x and y to the foods x and y.
	public void CheckIfOverFood(Creature creature, ArrayList<Food> foodlist){
		for (int i = 0; i < foodlist.size(); i++){
			if (creature.body.getLocx() == foodlist.get(i).getXlocation() && creature.body.getLocy() == foodlist.get(i).getYlocation()){
				foodlist.remove(i);
				creature.setHungerlevel(500);
			}
		}
	}
	
	//The code for avoiding objects like barriers.
	public void CheckIfCloseToObject(PApplet p, Body body, ArrayList<Barrier> barrierlist){
		for (int i = 0; i < barrierlist.size(); i++){
			if (p.dist((int)body.getLocx(), (int)body.getLocy(), barrierlist.get(i).getXlocation(), barrierlist.get(i).getYlocation()) <= 35){
				if (body.getLocx() < barrierlist.get(i).getXlocation()){
					pointx = body.getLocx() - 15;
				}
			if (body.getLocx() > barrierlist.get(i).getXlocation()){
				pointx = body.getLocx() + 15;
				
					}
			
			if (body.getLocy() > barrierlist.get(i).getYlocation()){
				
				pointy = body.getLocy() - 15;
				}
			
			if (body.getLocy() < barrierlist.get(i).getYlocation()){
				pointy = body.getLocy() + 15;
			
			}
		} 
	}
}}

