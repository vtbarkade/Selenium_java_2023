package Practice_Java;

import java.util.HashMap;

public class Prog_14_Number_of_words_HashMap {

	public static void main(String[] args) {
		
		 String str = "This this is is done by vijay vijay";
	     String[] split = str.split(" ");
	         
	     HashMap<String,Integer> hmap = new HashMap<String,Integer>();
	     
	        for (int i=0; i<split.length; i++)
	        {
	            if (hmap.containsKey(split[i])) 
	            {
	                int count = hmap.get(split[i]);
	                
	                hmap.put(split[i], count+1);
	            }
	            else
	            {
	            	 hmap.put(split[i], 1);
	            }
	        }
	        System.out.println(hmap);
	}

}
