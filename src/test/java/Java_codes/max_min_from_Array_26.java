package Java_codes;

import java.util.Arrays;

public class max_min_from_Array_26 {

	public static void main(String[] args) {
		// https://www.techcrashcourse.com/2016/04/java-program-find-maximum-minimum-element-array.html
		//https://www.w3resource.com/java-exercises/array/java-array-exercise-10.php
		
		int[] array= {7,2,34,78,3,467,824,3452};
		int max= array[0];
		int min = array[0];
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max= array[i];
			}
			else if(array[i]<min)
			{
				min = array[i];
			}
		}
		System.out.println("elements are :"+Arrays.toString(array));
		System.out.println("Maximum number in Array is : "+max);
		System.out.println("Minimum number in Array is : "+min);
	}

}
