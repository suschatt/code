package File_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest{

	public static void main(String[] args) throws IOException{
		try{
		File file = new File("C:\\Users\\SayaniB\\Documents\\Java_Projects\\test_data\\input.txt.txt");
		FileInputStream fis= new FileInputStream(file);
		int input;
		while ((input=fis.read()) != -1)
			System.out.println((char) input);
		
			
		}catch (FileNotFoundException e){
			System.out.println("Exception");
		}
	}//end main

}
