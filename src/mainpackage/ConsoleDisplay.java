package mainpackage;

public class ConsoleDisplay {

	public void DisplayText(String string){
		System.out.println(string);
	}
	
	public void ShowCreatureLocation(Creature creature){
		System.out.println(creature.braincon.movlobe.getBodylocx());
		System.out.println(creature.braincon.movlobe.getBodylocy());
	}
}
