package Java_codes;

public class palindrome_string_27 {

	public static void main(String[] args) {
		//https://www.w3schools.in/java/examples/check-palindrome-string
		
		String string="Madam", ReverseString="";
		
		for(int i=string.length()-1;i>=0;i--)
		{
			ReverseString = ReverseString + string.charAt(i);
		}
		if(string.equalsIgnoreCase(ReverseString))
		{
			System.out.println(string + " is Pallindrome String");
		}
		else
		{
			System.out.println(string + " is NOT Pallindrome String");
		}
	}

}
