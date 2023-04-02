package Practice_Java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Prog_5_Duplicate_String_in_String_Array {

	public static void main(String[] args) {
		
		String arr[] = {"vijay","reshma","vijay","kavita","amit","reshma","vijay","kavita"};
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		for(String str:arr)
		{
			if(hmap.containsKey(str))
			{
				hmap.put(str, hmap.get(str)+1);
			}
			else
			{
				hmap.put(str, 1);
			}
		}

		Set<Entry<String,Integer>> entry =hmap.entrySet();
		
		for(Entry<String,Integer> e:entry)
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey()+" is Duplicate String & repeated "+e.getValue() +" times");
			}
		}
		
	}

}
