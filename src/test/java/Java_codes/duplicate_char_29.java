package Java_codes;


public class duplicate_char_29 {

	public static void main(String[] args) {
		// https://www.javatpoint.com/program-to-find-the-duplicate-characters-in-a-string
		
		String str = "ghar ho to aisa";
		char[] string = str.toCharArray();
		
		System.out.print("Duplicate characters in string : "+"'"+str+"'" +" are  \n");
		
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if (string[i]==string[j] && string[i] !=' ')
				{
					count++;
					string[j]='0';
				}
			}
			if(count>1 && string[i]!='0' )
			{
				System.out.print(string[i]+" repeated "+count+" times \n");
			}
		}
	}

}
