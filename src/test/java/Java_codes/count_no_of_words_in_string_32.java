package Java_codes;

public class count_no_of_words_in_string_32 {

	public static void main(String[] args) {  
		//https://www.javatpoint.com/java-program-to-count-the-number-of-words-in-a-string
		
        String string =" This is Vijay Barkade  from   satara  ";  
        System.out.println(wordcount(string) + " words.");   
  }  
	  static int wordcount(String string)  
      {  
        int count=0;  
    
          char ch[]= new char[string.length()];     
          for(int i=0;i<string.length();i++)  
          {  
              ch[i]= string.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
          }  
          return count;  
      }  
}
