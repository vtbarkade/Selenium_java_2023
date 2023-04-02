package Naveen_Automation;

public class Duplicate_Elements_InARRAY {

	public static void main(String[] args) {
		
 String[] arr = {"vijay","Reshma","vijay","Amit","vijay","Reshma","Reshma","Amit","sagar","sagar"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&& arr[i]!=null)
				{
					arr[j]=null;
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

}
