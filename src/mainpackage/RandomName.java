package mainpackage;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RandomName {

	
	protected String[] namelist;
	
	
	
	public void ReadNamesFromFile() throws IOException{
		BufferedReader breader = new BufferedReader(new FileReader("Names.txt"));
		String fileread = breader.readLine();
		namelist = fileread.split(";");
		breader.close();
	}}
