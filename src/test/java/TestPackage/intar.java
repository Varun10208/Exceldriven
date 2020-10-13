package TestPackage;

import java.util.Arrays;

public class intar {

	public static void main(String[] args) {
		int t=98992; int w=99982;
		String ks=Integer.toString(t);
		System.out.println(ks);
		String bs=Integer.toString(w);
		char[] kaa=ks.toCharArray();
		char[] baa=bs.toCharArray();
		System.out.println(kaa);
		Arrays.sort(kaa);
		Arrays.sort(baa);
		 
       
        if(Arrays.equals(kaa,baa)) {  
            System.out.println("Both the strings are anagram");  
        }  
		// TODO Auto-generated method stub
        String ll="heena";
        String kk="Heena";
        if(ll.equals(kk))
        {
        	System.out.println("same");
        }
		
		}

	}


