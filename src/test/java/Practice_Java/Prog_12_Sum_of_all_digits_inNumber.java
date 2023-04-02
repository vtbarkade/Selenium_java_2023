package Practice_Java;

public class Prog_12_Sum_of_all_digits_inNumber {

	public static void main(String[] args) {
		
		int num= 123 , sum =0;
		int rem;
		
		while(num!= 0)
		{
			rem = num%10;
			sum =sum + rem;
			num=num/10;
		}
		
		System.out.println("Sum of all digits of Number is: "+sum);
	}

}
