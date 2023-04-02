package Java_codes;

public class No_of_lines_stringParagraph_34 {

	public static void main(String[] args) {
		// https://www.java2novice.com/java_string_examples/line-count/
		
		String str = " My name is Vijay Barkade \n I am from Satara \r I have completed MTech \n I am an Automation Tester";
		System.out.println(str);
		/*
		int count = str.split("[\n|\r]").length;
		System.out.println("No. of Lines in string paragraph is : "+count);
		*/
		
		int count =1;
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)=='\n' || str.charAt(i)=='\r')
			{
				count++;
			}
		}
		System.out.println("No. of Lines in string paragraph is : "+count);
	}

}
