package Java_codes;

public class sum_of_all_digits_number_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234, reminder, sum=0;
		System.out.print("Sum of all digits of number " + num +" is = ");
		while(num !=0)
		{
			reminder= num%10; // find last digit
			sum= sum + reminder;
			num = num/10;
		}
		System.out.print(sum);
	}

}
