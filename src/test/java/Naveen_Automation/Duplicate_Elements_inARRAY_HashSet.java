package Naveen_Automation;

import java.util.HashSet;

public class Duplicate_Elements_inARRAY_HashSet {

	public static void main(String[] args) {
		// Find Duplicate Elements in an Array using HashSet() method
		
		String arr[] = {"vijay","Reshma","vijay","Amit","vijay","Reshma","Reshma","Amit"};
		
		HashSet<String> hset = new HashSet<String>();
		
		for(int i=0;i<arr.length;i++)
		{
			
				if(hset.add(arr[i])==false)
				{
					System.out.println(arr[i]);
					
				}
							
		}
		
	}

}
