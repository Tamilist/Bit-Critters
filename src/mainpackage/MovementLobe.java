package mainpackage;
import java.util.Random;

/*Lobe for sending signals to the body to move. Keeps track of the body location.*/
public class MovementLobe extends BrainLobe {
	
	public MovementLobe(){
		
	}
	
	private int bodylocx;
	private int bodylocy;
	
	public int getBodylocx() {
		return bodylocx;
	}

	public void setBodylocx(int bodylocx) {
		this.bodylocx = bodylocx;
	}

	public int getBodylocy() {
		return bodylocy;
	}

	public void setBodylocy(int bodylocy) {
		this.bodylocy = bodylocy;
	}
	
	//Sets the lobes body location variables
	public void SetBodyLocRandom(){
		Random rand = new Random();
		setBodylocx(rand.nextInt(100)+1);
		setBodylocy(rand.nextInt(100)+1);
		
	}
	
	//Uses the Lobes location variables to change the bodys location so that the creature moves.
	public void SendLocationsToBody(Body body){
		body.setLocx(bodylocx);
		body.setLocy(bodylocy);
	}

}
