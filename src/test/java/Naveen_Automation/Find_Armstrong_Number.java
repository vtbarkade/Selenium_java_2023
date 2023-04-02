package Naveen_Automation;

public class Find_Armstrong_Number {

	public static void main(String[] args) {
		
		int no =153,length=0;
		int t1= no;
		
		while(t1 !=0)
		{
			length++;
			t1 =t1/10;
		}
		
		int t2=no,rem;
		int arm=0;
		while(t2 !=0)
		{
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=length;i++)
			{
			mul = mul*rem;
			
			}
			arm= arm+mul;
			t2=t2/10;
		}
		
		if(arm==no)
		{
			System.out.println(no + " is Armstrong Number");
		}
		else
		{
			System.out.println(no + " is NOT Armstrong Number");
		}
	}

}
