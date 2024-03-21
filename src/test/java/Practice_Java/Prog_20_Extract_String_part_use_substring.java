package Practice_Java;

public class Prog_20_Extract_String_part_use_substring {

	public static void main(String[] args) {
		// Extract string part using Substring method
		
		String str = "hello.this is. vijay";
		int len = str.length();
		
		String first=str.substring(0, 6);
		String middle = str.substring(6, len-6);
		String last = str.substring(len-6, len);
		
      System.out.println(first +"\n"+ middle+"\n"+last);
	}

}
