package mainpackage;

import java.util.Random;

public class PathingLobe {

	public float pointx;
	public float pointy;
	
	public void MoveBodyToPoint(Body body){
	    if (pointx > body.getLocx()){
	    	body.setLocx(body.getLocx() + 1);
	    }
	    
	    if(pointx < body.getLocx()){
	    	body.setLocx(body.getLocx() - 1);
	    }
	    
	    if (pointy > body.getLocx()){
	    	body.setLocy(body.getLocy() + 1);
	    }
	    
	    if (pointy < body.getLocx()){
	    	body.setLocy(body.getLocy() - 1);
	    }
	    //Checks if the creature  reached its target destination.
	    
	}
	
	public void CheckIfAtDestination(Body body, float Height, float Width){
		Random rand = new Random();
		
		if (body.getLocx() == pointx){
			pointx = rand.nextFloat() * (Height - 0);
		}
		
		if (body.getLocy() == pointy){
			pointy = rand.nextFloat() * (Width - 0) ;
	}
  }
	
	//Runs several checks to make sure the creatures body hasnt gone off the screen.
	public void CheckIfOutOfBounds(Body body, float Width, float Height){
		Random rand = new Random();
		if (body.getLocx() <= 0){
			body.setLocx(body.getLocx() + 1);
			pointx = rand.nextFloat()*Height;
		}
		}
	}

