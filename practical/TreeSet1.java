package corejava;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
		set.add("krishna" );
		set.add("parmar");
		set.add("abc");
		set.add("patil");
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
		}
		
		
	}

}
