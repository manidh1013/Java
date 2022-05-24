package corejava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create ArrayList
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("manish");
	    list.add("patil");
	    list.add("shubham");
	    list.add("omkar");
	    Iterator itr = list.iterator();
	    while(itr.hasNext()){
	    	System.out.println(itr.next());
	    	
	    }
}}