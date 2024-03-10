package Practice_Java;

public class Prog_11_Prime_Number {

	public static void main(String[] args) {
	
		int num= 83, flag =0;
		int m = num/2;
		
		for(int i=2;i<=m;i++)
		{
			if(num%i ==0)
			{
				System.out.println("Number: " +num + " is NOT Prime Number" );
				flag =1;
				break;
			}
			
		}
       if(flag ==0)
       {
    	   System.out.println("Number: " +num + " is Prime Number");
       }
	}

}
