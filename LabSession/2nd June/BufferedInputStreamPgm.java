package LabSession;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

//program to demonstrate on BufferedInputStream

public class BufferedInputStreamPgm {
	
	//main method
		public static void main(String[] args) throws Exception {
			
			//Creating object of FileInputStream 
			FileInputStream fins = new FileInputStream("C:/Users/Manish patil/Documents/myFile.txt");
			
			//Creating Object of BufferedInputStream
			BufferedInputStream bis = new BufferedInputStream(fins);
			
			//Creating variable a using int DataType
			int a=0;
			
			//Using While ForGetting values from file
			while((a=fins.read())!=-1) {
				
				//Printing Output
				System.out.print((char)a);
			}
			
			//Closing FileInputStream
			fins.close();
			
			//Closing BufferdInputStream
			bis.close();
			

		}

	}