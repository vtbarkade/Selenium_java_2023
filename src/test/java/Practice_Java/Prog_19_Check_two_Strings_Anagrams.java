package Practice_Java;

import java.util.Arrays;

public class Prog_19_Check_two_Strings_Anagrams {

	public static void main(String[] args) {
		
		// check both Strings are Anagram or Not
		
		String str1 = "mary"; //stop
		String str2= "Army";  //pots
		
		char[] str1_arr = str1.toLowerCase().toCharArray();
		char[] str2_arr =str2.toLowerCase().toCharArray();
		
		Arrays.sort(str1_arr);
		Arrays.sort(str2_arr);
		
		if(Arrays.equals(str1_arr, str2_arr))
		{
			System.out.println("Both Strings are ANAGRAM");
		}
		else
		{
			System.out.println("Both strings are NOT Anagram");
		}
		
		
	}

}
