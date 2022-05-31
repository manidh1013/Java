package corejava;

import java.io.BufferedWriter;
import java.io.FileWriter;

class BufferWriter{
	public static void main(String[] args) throws Exception {     
		//Creating FileWriter object
		FileWriter writer = new FileWriter("C:/Users/Manish patil/Documents/myFile.txt");  
		 //To read from the created file 	
		BufferedWriter buffer = new BufferedWriter(writer);  
        buffer.write("Welcome to world");  
        //Call close() Method
	         buffer.close();  
		  System.out.println("Success");  
							
	} }