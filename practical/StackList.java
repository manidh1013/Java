package corejava;

import java.util.Iterator;
import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> s = new Stack<String>();
		s.push("ab");
		s.push("cd");
		s.push("ef");
		s.push("hi");
		s.push("jk");
		
			Iterator itr = s.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
	}

}
