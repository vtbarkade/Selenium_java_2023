package Naveen_Automation;

public class Duplicate_Characters_Maximum_using_Int_Array {

	public static void main(String[] args) {
		// Maximum duplicate character using Int array
		
		String str = "this is vijay from satara";
		char[] chararry = str.toCharArray();

		int[] arr = new int[127];
		
		for(char c:chararry)
		{
			arr[c]= arr[c]+1;			
		}
		
		int max=1;
		char s= ' ';
		
       for(char c:chararry)
        {
        	if(arr[c]>max && c!=' ')
        	{
        		max = arr[c];
        		s = c;        		
        	}        	
        }          
       System.out.println(s +" : max count is "+ max);
	}

}
