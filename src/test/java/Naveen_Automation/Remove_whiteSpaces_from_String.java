package Naveen_Automation;

public class Remove_whiteSpaces_from_String {

	public static void main(String[] args) {
		// Remove all white spaces from string (use "\t" for Tab )
		
		String str = "  This is Vijay Barkade  		satara		";
		
		String newstr = str.replaceAll(" ", "").replace("\t", "");
		
		System.out.println(newstr);

		// Another method
		
		String finalstr = str.trim().replace(" ", "").replace("\t", "");
		System.out.println(finalstr);
	}

}
