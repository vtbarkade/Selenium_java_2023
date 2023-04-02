package Practice_Java;

public class Prog_8_Fibonacci_series {

	public static void main(String[] args) {
		
		int num=10;
		int n1=0,n2=1,n3;
		
		System.out.print("Fibonnacci Series of size "+num+" is : "+ n1+" "+ n2);
        
		for(int i=2;i<num;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
