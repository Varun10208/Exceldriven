package TestPackage;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long y=6;
		byte p=(byte)(short)y;
		int k= (int)22L + p;
		System.out.println(k);
		TreeSet<String> treeSet = new TreeSet<>(); 

		treeSet.add("Geeks"); 
		treeSet.add("for"); 
		treeSet.add("Geeks"); 
		treeSet.add("AGeeksforGeeks");
//	treeSet.add(null);
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1, null);
		tm.put(2,null);
		System.out.println(tm);
		 double data = 444.324; 
	        int value = (int) data; 
	        System.out.println(value);

		for (String temp : treeSet) 
			System.out.printf(temp + " "); 

		System.out.println("\n"); 
	}

}
