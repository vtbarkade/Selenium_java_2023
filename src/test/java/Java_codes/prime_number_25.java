package Java_codes;

public class prime_number_25 {

	public static void main(String[] args) {
		//https://www.javatpoint.com/prime-number-program-in-java
		
		int number=83,flag =0;
		int m = number/2;
		if (number==0||number==1)
		{
			System.out.println(number + " is not Prime Number");
		}
		else
		{
			for(int i=2;i<=m ;i++)
			{
				if(number%i==0)
				{
					System.out.println(number+" is not Prime Number");
					flag =1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(number+" is Prime Number");
			}
		}
	}

}
