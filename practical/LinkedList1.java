package corejava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> al = new LinkedList<String>();
		al.add("ravi");
		al.add("avi");
		al.add("ring");
		al.add("ram");
		Iterator itr = al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());	
		
		}
	}

}
