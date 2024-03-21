package Practice_Java;

public class Prog_21_String_to_Num_and_num_to_string {

	public static void main(String[] args) {
		// String to Number and  any value to String conversion
		
		String Str = "1234";
		String bool = "true";
		int num;
		
		num =Integer.parseInt(Str);  // String to integer conversion
		System.out.println(num+1);
		
		// String to boolean conversion
		
		boolean b = Boolean.valueOf(bool);
		System.out.println(b);
		
		// Integer to string 
		
		int a = 2356;
		String s = String.valueOf(a);
		System.out.println(s+1);
				

	}

}
