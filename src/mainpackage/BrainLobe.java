package mainpackage;
/*This is the abstract class that all types of brain lobes will inherit from. This class
 * will only have attributes that all lobes will have.*/

public class BrainLobe 
{
	protected int currentsignal;
	protected int lastrecievedsignal;
	
	//Getters and Setters
	
	
	
    public int getCurrentsignal() {
		return currentsignal;
	}

	public void setCurrentsignal(int currentsignal) {
		this.currentsignal = currentsignal;
	}

	public int getLastrecievedsignal() {
		return lastrecievedsignal;
	}

	public void setLastrecievedsignal(int lastrecievedsignal) {
		this.lastrecievedsignal = lastrecievedsignal;
	}
	
	
    //These methods will handle recieving signals from other parts of the brain
	public int SendSignal(int signal)
    {
    	return signal;
    }
    //These methods will handle sending signals to other body parts
    public void RecieveSignal(int signal)
    {
    	setCurrentsignal(signal);
    }
}
