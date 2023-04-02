package Naveen_Automation;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_Elements_inArray_HashMap {

	public static void main(String[] args) {
		// Duplicate Elements in Array using HashMap() class

		String arr[] = {"vijay","Reshma","vijay","Amit","vijay","Reshma","Reshma","Amit"};
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		for(String c:arr)
		{
			
			if(hmap.containsKey(c))
			{   				
				hmap.put(c, hmap.get(c)+1);
			}
			else
			{
				hmap.put(c, 1);
			}
		}
		Set<Entry<String,Integer>> entry = hmap.entrySet();
		
		for(Entry<String,Integer> e:entry)
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey()+" is repeated " +e.getValue() + " times");
			}
		}
		
	}

}
