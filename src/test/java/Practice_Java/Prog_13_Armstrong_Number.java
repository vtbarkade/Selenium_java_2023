package Practice_Java;

public class Prog_13_Armstrong_Number {

	public static void main(String[] args) {
		
		int num= 153, length=0;
		int t1= num, arm_num =0;
		
		while(t1!=0)
		{
			length++;
	        t1 = t1/10; 
		}
				
		int t2= num , rem;
		
		while(t2!=0)
		{
			rem = t2%10;
			int mul=1;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
			}
		  
			arm_num= arm_num+mul;
			t2= t2/10;
		}
		
		if(num==arm_num)
		{
			System.out.println( num + " : is Armstrong Number ");
		}
		else
		{
			System.out.println( num + " : is NOT Armstrong Number ");
		}
			
	}

}
