package Java_codes;

public class Practice {

	public static void main(String[] args) {
		
		int num =153;
		int n1=num;
		int len=0;
		while(n1!=0)
		{
			n1 =n1/10;
			len++;
		}
		
		int n2=num;
		int rem, sum=0;
		while(n2 !=0)
		{
			int mul=1;
			rem=n2%10;
			for(int i=1;i<=len;i++)
			{
			mul = mul*rem;
			}
			sum = sum+mul;
			n2=n2/10;
		}
		System.out.println(sum);
	}
}
