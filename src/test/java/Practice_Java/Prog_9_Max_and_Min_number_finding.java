package Practice_Java;

public class Prog_9_Max_and_Min_number_finding {

	public static void main(String[] args) {
		
		int arr[] = {23,12,5,678,234,34,5789};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			if(arr[i]<min)
			{
				min = arr[i];
			}
			
		}

		System.out.println("Maximum number is : "+ max +"\n"+  "Minimum Number is : "+ min);
	}

}
