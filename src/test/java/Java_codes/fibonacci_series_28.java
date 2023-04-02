package Java_codes;

public class fibonacci_series_28 {
	
	public static void main(String[] args) {
		//https://www.javatpoint.com/fibonacci-series-in-java
		
		int n1=0,n2=1,n3,count=5;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
