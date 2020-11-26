package TestPackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;


public class TestHashmap {
	
	  public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap) 
	    { 
		  
		 ;
	        // Create a new TreeMap 
	        Map<K, V> treeMap = new TreeMap<>(); 
	  
	        // Pass the hashMap to putAll() method 
	        treeMap.putAll(hashMap);
	      //  treeMap.put(54,"You");
	  
	        // Return the TreeMap 
	        return treeMap; 
	    }
	public static void main(String... args)
	{
		Map<Integer,String> hashmap2=new HashMap<>();
		Map<Integer,String> treemap2=new TreeMap<>();
		treemap2.put(1, null);
		treemap2.put(2,null);
		System.out.println("Treemap 2 " + treemap2);
		//hashmap2.put(null, null);
		Set<String> ts=new TreeSet<String>();
		ts.add(null);
		System.out.println("Treeset is " + ts);
		hashmap2.put(33, "Raj");
		hashmap2.put(101, "Varun");
		Map map =Collections.synchronizedMap(hashmap2);
		System.out.println(hashmap2.get(null));
		System.out.println("Hashmap is "+ hashmap2);
		Set<Integer> keys=hashmap2.keySet();
		Collection<String> values=hashmap2.values();
		Set<Map.Entry<Integer,String>>  both=hashmap2.entrySet();
		System.out.println("Keys are "+ keys);
		System.out.println("Values are "+ values);
		System.out.println("both key value pairs are "+ both);
		   // construct a new TreeMap from HashMap 
        Map<Integer, String> treeMap = convertToTreeMap(hashmap2); 
  
        // Print the TreeMap 
        System.out.println("TreeMap: " + treeMap); 
		
		
		
	}

}
