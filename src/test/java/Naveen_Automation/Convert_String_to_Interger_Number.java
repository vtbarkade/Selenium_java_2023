package Naveen_Automation;

public class Convert_String_to_Interger_Number {

	public static void main(String[] args) {
		// Convert String to an Integer Number 
		
		String str= "8746";
		char[] arr=str.toCharArray();
		int zero=(int)'0';
		
		int sum=0;
		for(char c:arr)
		{
			int asci =(int)c;
			sum = sum*10 + (asci -zero);
		}
		
		System.out.println("String converted number is :"+sum);
	}

}
