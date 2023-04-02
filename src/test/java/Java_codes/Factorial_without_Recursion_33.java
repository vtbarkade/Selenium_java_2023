package Java_codes;

public class Factorial_without_Recursion_33 {

	public static void main(String[] args) {
		// https://www.javatpoint.com/factorial-program-in-java
		
		int num=5, fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact =fact*i;
		}
		System.out.println("Factorial of "+num+ " is : \n"+fact);
}
	
}
