package LabSession;

import java.io.FileOutputStream;

public class FileOutputStreamProgram {

	//main method
		public static void main(String[] args) throws Exception {
			
			//Creating object of FileOutputStream 
			FileOutputStream Fout = new FileOutputStream("C:/Users/Manish patil/Documents/myFile.txt");
			
			//Creating variable using String DataType
			String s = ("HELLO MANISH");
			
			//Creating Byte Array
			byte b[]=s.getBytes();
			
			
			Fout.write(b);
			
			//Closing FileOutputStream
			Fout.close();
			
			//Printing Output
			System.out.println(" Successful");


		}

	}