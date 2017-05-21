package mainpackage;

/*Sends and recieves signals to different parts of the body and brain.*/
public class SignalTransferLobe extends BrainLobe {
	
	//These variables will hold the signals from different parts of the body.
	private int signaslot1l;
	private int signalslot2;
	private int signalslot3;
	private int signalslot4;
	private int signalslot5;
	private int signalslot6;
	private int signalslot7;
	
	//All the getters and setters for the signal variables. theres probably a better
	//way to do this, but I'm not sure.
	public int getSignaslot1l() {
		return signaslot1l;
	}

	public void setSignaslot1l(int signaslot1l) {
		this.signaslot1l = signaslot1l;
	}

	public int getSignalslot2() {
		return signalslot2;
	}

	public void setSignalslot2(int signalslot2) {
		this.signalslot2 = signalslot2;
	}

	public int getSignalslot3() {
		return signalslot3;
	}

	public void setSignalslot3(int signalslot3) {
		this.signalslot3 = signalslot3;
	}

	public int getSignalslot4() {
		return signalslot4;
	}

	public void setSignalslot4(int signalslot4) {
		this.signalslot4 = signalslot4;
	}

	public int getSignalslot5() {
		return signalslot5;
	}

	public void setSignalslot5(int signalslot5) {
		this.signalslot5 = signalslot5;
	}

	public int getSignalslot6() {
		return signalslot6;
	}

	public void setSignalslot6(int signalslot6) {
		this.signalslot6 = signalslot6;
	}

	public int getSignalslot7() {
		return signalslot7;
	}

	public void setSignalslot7(int signalslot7) {
		this.signalslot7 = signalslot7;
	}

	public void SendSignal(){
		
	}
	
	public void SimpleTextMethod(){
		System.out.println("Hey, this object can be used inside another object!");
	}

}
