package Practice_Java;

public class Prog_3_String_to_Number {

	public static void main(String[] args) {
		
		String str= "123" ;
		
		char arr[]= str.toCharArray();
		
		int num=0;
		for(char c:arr)
		{
			num = num*10+((int)c - (int)'0');
		}

		System.out.println("String to Number is : " +num);
	}

}
