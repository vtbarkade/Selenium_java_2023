package Naveen_Automation;

public class swap_without_third_variable {

	public static void main(String[] args) {
		
		int a=134, b=4656;
		
		System.out.println("Before Swapping : a = " + a +" b = "+b);
		
		a= a+b; 
		b = a-b; 
		a = a-b; 
		
		System.out.println("After Swapping : a = " + a +" b = "+b);
	}

}
