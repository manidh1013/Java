package corejava;

import java.util.Iterator;
import java.util.Vector;


public class VectorList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Vector<String> v = new Vector<String>();
		v.add("ayush");
		v.add("avi");
		v.add("enu");
		v.add("alpha");
		Iterator itr = v.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());	
		
	}

}}
