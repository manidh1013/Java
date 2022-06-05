package LabSession;

import java.io.FileInputStream;

//Program to Demonstrate On FileInputStream

public class FileInputStreampgm {

	public static void main(String[] args)  throws Exception {

		//Creating Object of FileInputStream
		FileInputStream f = new FileInputStream("C:/Users/Manish patil/Documents/myFile.txt"
				+ "");
		
		//Creating variable i using intDataType
		int a= 0;
		
		//Using While to Read Data
		while((a=f.read())!=-1){
			//Printing Output
			System.out.print((char)a);
			
		}
		//Closing File InputStream
		f.close();

	}

}