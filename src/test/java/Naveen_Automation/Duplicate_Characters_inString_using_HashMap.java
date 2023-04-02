package Naveen_Automation;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_Characters_inString_using_HashMap {

	public static void main(String[] args) {
		// Find Duplicate Characters in String using HashMap
		
		String str ="this is Vijay Barkade satara";
		
		HashMap<Character,Integer> hmap = new HashMap<>();
		
		char arr[] =str.toCharArray();
		
		for(char c:arr)
		{
			if(hmap.containsKey(c)&& c !=' ' )
			{
				hmap.put(c, hmap.get(c)+1);
			}
			else
			{
				hmap.put(c, 1);
			}
		}

		Set<Entry<Character,Integer>> entry = hmap.entrySet();
		
		for(Entry<Character,Integer> e:entry)
		{
			if (e.getValue()>1)
			{
				System.out.println(e.getKey()+" is repeated " + e.getValue() + " times ");
			}
		}
	}

}
