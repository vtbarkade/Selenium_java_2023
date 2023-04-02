package Naveen_Automation;

public class Uppercase_lowercase_char_count_inString {

	public static void main(String[] args) {
		//Count uppercase and lowercase letters in a string
		
		String str = "i  LOVE Satara";
		char[] arr =str.toCharArray();
		int uppercase=0,lowercase=0;
		for(char c:arr)
		{
		   if(Character.isUpperCase(c))
			{				
				uppercase++;
			}
			else if(Character.isLowerCase(c))
			{
				lowercase++;
			}
			
			// Another method 
			
			/*if(c>='A' & c<='Z')
			{
				uppercase++;
			}
			else if(c>='a' & c<='z')
			{
				lowercase++;
			}
			*/
		}
		System.out.println("Uppercase Letters are :" + uppercase);
		System.out.println("Lowercase Letters are :" + lowercase);
	}

}
