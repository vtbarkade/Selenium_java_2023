package Naveen_Automation;

public class Alphabet_Traingle {

	public static void main(String[] args) {
		
		int ascii=65;
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
						
				//System.out.print((char)(ascii+j) +" ");
				System.out.print((char)(ascii + i) +" ");
								
			}
			System.out.println();
		}
		
	}

}
