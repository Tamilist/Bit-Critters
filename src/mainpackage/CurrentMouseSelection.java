package mainpackage;

public class CurrentMouseSelection {
	private int currentselection;
	
	public CurrentMouseSelection(){
		currentselection = 0;
	}
	public void SetCurrentSelection(int curse){
		currentselection = curse;
	}
	
	public int GetCurrentSelection(){
		return currentselection;
	}

}
