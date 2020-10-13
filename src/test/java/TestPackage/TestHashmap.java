package TestPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;


public class TestHashmap {
	
	  public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap) 
	    { 
	        // Create a new TreeMap 
	        Map<K, V> treeMap = new TreeMap<>(); 
	  
	        // Pass the hashMap to putAll() method 
	        treeMap.putAll(hashMap); 
	  
	        // Return the TreeMap 
	        return treeMap; 
	    }
	public static void main(String... args)
	{
		Map<Integer,String> hashmap2=new HashMap<>();
		hashmap2.put(33, "Akshay");
		hashmap2.put(33, "Raj");
		hashmap2.put(101, "Varun");
		System.out.println(hashmap2.get(2));
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
