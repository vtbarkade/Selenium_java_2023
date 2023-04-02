package Practice_Java;

public class Prog_7_Alphabet_Pyramid {

	public static void main(String[] args) {
		int num=5;
		
		for(int i=0;i<num;i++)
		{
			for(int k=num;k>=i;k--)
			{	
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)((int)('A')+j) +" ");
			}
			System.out.println();
		}
		
	}

}
