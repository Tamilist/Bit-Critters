package mainpackage;
/*This object will hold all the different brain lobes when it is instantiated*/
public class BrainContainer {
	
	public SignalTransferLobe siglobe;
	public MovementLobe movlobe;
	public PathingLobe pathinglobe;
	
	public BrainContainer(Body body){
		 siglobe = new SignalTransferLobe();
		 movlobe = new MovementLobe();
		 pathinglobe = new PathingLobe(body);
	}

}
