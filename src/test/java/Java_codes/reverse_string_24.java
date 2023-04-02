package Java_codes;

public class reverse_string_24 {

	public static void main(String[] args) {
		//https://www.javatpoint.com/java-program-to-find-reverse-of-the-string
		
		String string = "vijay", ReverseString = "";
		
		for(int i=string.length()-1;i>=0;i--)
		{
			ReverseString = ReverseString + string.charAt(i);
			
		}
		System.out.println("Original String is : "+ string);
		System.out.println("Reverse order string is : "+ ReverseString);
	}

}
