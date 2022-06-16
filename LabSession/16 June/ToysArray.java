package LabSession;

import java.util.Scanner;

public class ToysArray {
	
	//creating Multidimentional String Array
	String[][] toys = new String [5][5];

	// Constructor
    ToysArray()
    {
    toys [0][0]="1";
    toys[0][1]="Teddy";

    toys [1][0]="2";
    toys [1][1] ="Shinchan robot";

    toys [2][0]="3";
    toys [2][1]="rubber duck";

    toys [3][0]="4";
    toys [3][1]="benten watch";

    toys [4][0]="5";
    toys[4][1]=" piggy bank";

    }

    //static getToy method
    public static String getToy(int price)
    {
        String toyname;
        
        // Switch Cases
        switch(price)
        {
        	//price of toy in case
            case 120: 
                toyname = "Teddy";
                return toyname;
            
            case 500:
                toyname = "Shinchan robot";
                return toyname;
                
            case 50:
                toyname = "rubber duck";
                return toyname;
                
            case 70:
                toyname = "benten watch";
                return toyname;
                
            case 150:
                toyname = "piggy bank";
                return toyname;
                
            default:
                toyname = "No Toys Available in this Range";
                return toyname;
        }
    }

    public static void main(String[] args) {
    	
    	System.out.println("Enter the Prize of Toy : ");
    	//Creating Obj of Scanner class
        Scanner sc = new Scanner (System.in);    
        int price = sc.nextInt ();
        System.out.println(getToy(price));

      
    }
}