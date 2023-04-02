package Java_codes;

public class Factorial_with_Recursion_33 {

	public static void main(String[] args) {
		// https://www.javatpoint.com/factorial-program-in-java
		
		int num=5,fact;
		fact=factorial(num);
		System.out.println("Factorial of number "+ num + " is : \n"+fact);
	}
   public static int factorial(int n)
   {
	   if(n==0)
	   {
		  return 1; 
	   }
	   else
	   {
		   return(n*factorial(n-1));
	   }
   }
}
