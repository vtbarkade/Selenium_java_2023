package Practice_Java;

public class Prog_15_Find_vovels_fromString {

	public static void main(String[] args) {
		
		String str = "Pune Mumbai";
		String upp = str.toLowerCase();
		int cnt=0;
		System.out.print("Vovels in Strings are : " );
		for(int i=0;i<str.length();i++)
		{
			if(upp.charAt(i)=='a' || upp.charAt(i)=='e'|| upp.charAt(i)=='i'
					|| upp.charAt(i)=='o' || upp.charAt(i)=='u')
			{
				System.out.print(upp.charAt(i));
				cnt++;
			}
			
		}
		System.out.println("\nVovels count is : "+cnt);
	}

}
