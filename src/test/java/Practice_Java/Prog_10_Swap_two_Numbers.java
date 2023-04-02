package Practice_Java;

import java.util.Scanner;

public class Prog_10_Swap_two_Numbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Enter both numbers a and b");
		Scanner in = new Scanner(System.in);
		a= in.nextInt();
		b = in.nextInt();
		in.close();
		
		System.out.println("Before Swapping : a = "+a + " and  b = "+b );
		a = a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("After Swapping :  a = "+a + " and  b = "+b  );

	}

}
