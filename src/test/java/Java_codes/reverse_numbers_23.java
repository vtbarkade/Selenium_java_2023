package Java_codes;

public class reverse_numbers_23 {

	public static void main(String[] args) {
		// https://www.javatpoint.com/how-to-reverse-a-number-in-java
		
		int number = 754695, reverse=0,reminder;
		while(number!=0)
		{
			reminder = number%10;
			reverse = reverse*10+reminder;
			number = number/10;
				
		}
		System.out.println("The reverse order of Number is : " + reverse);
	}

}
