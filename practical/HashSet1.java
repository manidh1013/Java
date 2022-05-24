package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		set.add("mayur ");
		set.add("andy");
		set.add("sandy");
		set.add("billgates");
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
		}
		
		
	}

}
