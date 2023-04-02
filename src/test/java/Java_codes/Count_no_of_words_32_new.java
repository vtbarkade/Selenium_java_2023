package Java_codes;

public class Count_no_of_words_32_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "  Hello   this	is  	my number	satara ";
		
		String strnew = str.trim();
		System.out.println(strnew);
		char[] arr = strnew.toCharArray();
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]== ' ' || arr[i]=='\t') && (arr[i+1] != ' ' && arr[i+1] != '\t'))
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
