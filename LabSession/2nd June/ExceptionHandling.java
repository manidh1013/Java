package LabSession;

import java.io.FileInputStream;

//Program for Creating a file Using ExceptionHandling  

public class ExceptionHandling {

	public static void main(String[] args) {
		//Using try block
				try{
					
				//Creating object of  an FileInputStream	
				FileInputStream f = new FileInputStream("C:/Users/Manish patil/Documents/myFile.txt");
				
				//Creating variable i using  intDataType
				int i=0;
				
				//Using While loop reading value from file
				while((i=f.read())!=-1) {
					
					//Printing value of file
					System.out.print((char)i);
				}
				
				//Closing FileInputStream
				f.close();
				}
				//Using Catch block
				catch(Exception e){
					System.out.println(e);
				}
			}

		}