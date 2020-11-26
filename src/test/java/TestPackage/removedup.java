package TestPackage;

public class removedup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcabcaa"; 
		//bcaaabca--bcbca
		reducestring(s);
		

	}
	
	static String reducestring(String a) {
		String s4=null;
		int i=0;
		String s2=a.substring(0, a.length()/2);
		String s3=a.substring(a.length()/2, a.length());
		System.out.println("Substrin 1 --"+s2 +" " + "SUBSTRING 2--"+s3);
	while(i <3)	{
		if(s2.charAt(0)==s3.charAt(s3.length()-1)){
			 s4= s3.substring(0,(s3.length()-2))+s2.substring(1,s2.length());
			 System.out.println(s4);
		}
		else {
			 s4= s3 + s2 ;
			 System.out.println(s4);
		}
	
	i++;}
		
		return reducestring(s4);
		
	}

}
