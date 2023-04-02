package Practice_Java;

import java.util.Scanner;

public class Prog_1_Reverse_string {

	public static void main(String[] args) {
		
		String str , reverse ="" ;
		System.out.println("Enter the string to be reversed");
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		in.close();
		char arr[]= str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			
			reverse = reverse + arr[i];
		}
	   System.out.println("Reverse String is : "+reverse);
		
	}

}
