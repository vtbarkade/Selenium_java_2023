package Java_codes;

import java.util.ArrayList;

public class Mock_Ravi {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("vijay");
		list.add("Sagar");
		list.add("vijay");
		list.add("vijay");
		
		
		System.out.println(list);
		
		for(int i=0;i<list.size()-1;i++)
		{
		  if(list.get(i)==list.get(i+1))
		  {
			  System.out.println(list.get(i));
		  }
			
		}
		
	}

}
