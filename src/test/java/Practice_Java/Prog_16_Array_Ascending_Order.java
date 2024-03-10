package Practice_Java;

import java.util.Arrays;

public class Prog_16_Array_Ascending_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,23,5,68,12,83,2};
		int temp = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
							
			}
		}
		
		System.out.println("Array in Ascending Order: "+Arrays.toString(arr));
	}
		
}
