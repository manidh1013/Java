package LabSession;

import java.util.Iterator;
import java.util.LinkedList;

//java program to iterate a linked list

public class IteratingElemets {
	public static void main(String[] args) {
		
		
		 // create an object of linkedlist
	     LinkedList<String> l = new LinkedList<String>();
	     
	   // use add() method to add values in the linked list
	          l.add("manish");
	          l.add("advait");
	          l.add("shubham");
	          l.add("loopy");
	          l.add("hamza");
	          
	// set Iterator at specified index
	   Iterator i = l.listIterator(1);

	   // print list from second position
	   while (i.hasNext()) {
	   System.out.println(i.next());
	   }
	   }
			
	}


