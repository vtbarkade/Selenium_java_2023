package Java_codes;

public class string_length_31 {

	public static void main(String[] args) {
		// https://www.tutorialspoint.com/Java-string-length-without-using-length-method
		
		String str = "Vijay Barkade satara";
		
		int i=0;
		for(char c:str.toCharArray())
		{
			System.out.print(c);
			i++;
		}
		System.out.print(" Length of String is = "+i);
	}

}
