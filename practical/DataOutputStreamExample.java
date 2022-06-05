package corejava;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {

	public static void main(String[] args) throws IOException {  
		//creating object of FileOutputStream class
        FileOutputStream file = new FileOutputStream("C:/Users/Manish patil/Documents/myFile.txt");  
        //creating object of DataOutputStream class
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  //for writing int data in file
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  

