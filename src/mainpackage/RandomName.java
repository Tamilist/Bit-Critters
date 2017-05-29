package mainpackage;

import java.lang.reflect.Array;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RandomName {

	
	protected String[] namelist;
	
	
	
	public void ReadNamesFromFile() throws IOException{
		BufferedReader breader = new BufferedReader(new FileReader("Names.txt"));
		String fileread = breader.readLine();
		namelist = fileread.split(";");
		breader.close();
	}}
