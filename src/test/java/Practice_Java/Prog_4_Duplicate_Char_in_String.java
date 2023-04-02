package Practice_Java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Prog_4_Duplicate_Char_in_String {

	public static void main(String[] args) {
		
		String str = "this is satara";
		System.out.println("Given String is :  " +str);
		char arr[] = str.toCharArray();
		
		HashMap<Character,Integer> hmap = new HashMap<Character, Integer>();
		
		for(char c:arr)
		{
			if(hmap.containsKey(c))
			{
				hmap.put(c, hmap.get(c)+1);
			}
			else
			{
				hmap.put(c,1);
			}
		}
		
		Set<Entry<Character,Integer>> entry =  hmap.entrySet();
		
		for(Entry<Character,Integer> e:entry)
		{
			if(e.getValue()>1 && e.getKey()!=' ')
			{
				System.out.println("Duplicate character "+ e.getKey() + " with "+ e.getValue() +" times");
			} 
		}
		
	}

}
