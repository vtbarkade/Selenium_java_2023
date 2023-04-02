package Java_codes;

public class duplicate_char_remove_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Vijay Barkade";
		char string[] = str.toCharArray();
		System.out.print("String after Duplicate characters Removed is : ");
		
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(string[i]==string[j])
				{
					count++;
					string[j]='0';
				}
			}
			if(count==1 && string[i]!='0')
			{
				System.out.print(string[i]);
			}
		}
	}

}
