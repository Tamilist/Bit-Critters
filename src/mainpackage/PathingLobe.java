package mainpackage;

import java.util.Random;

public class PathingLobe {

	public float pointx;
	public float pointy;
	
	
	public PathingLobe(){
		
		
	}
	
	public void PerformStatusChecks(){
		
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
	    //Checks if the creature  reached its target destination.
	    
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
	}

