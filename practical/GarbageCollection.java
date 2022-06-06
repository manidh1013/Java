package corejava;

public class GarbageCollection {

		public void finalize()
		{System.out.println("garbage collected object");}
			public static void main(String args[]){
				GarbageCollection s1=new GarbageCollection();
				GarbageCollection s2=new GarbageCollection();
		s1=null;
		s2=null;
		System.gc();
			}}