package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FourSum 
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 0, -1, 0, -2, 2};
		int target = 0;
		
		List<List<Integer>> list = new ArrayList<>();
		list = fourSum(arr, target);
		System.out.println(list);
	}
	
	private static List<List<Integer>> fourSum(int arr[], int target)
	{
		Set<List<Integer>> set = new HashSet<>();
		
		if(arr.length < 4)
		{
			return new ArrayList(set);
		}// if
		
		Arrays.sort(arr);
		// -2 -1 0 0 1 2
		
		//List<Integer> list = new ArrayList<>();
		
		
		for(int i = 0; i < arr.length - 3; i++)
		{
			for(int j = i + 1; j < arr.length - 2; j++)
			{
				int k = j + 1;
				int l = arr.length - 1;
				
				while(k < l)
				{
					int tmpSum = arr[i] + arr[j] + arr[k] + arr[l];
					
					if(tmpSum == target)
					{
						set.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
						k++;
						l--;
					}// if
					else if(tmpSum < target)
					{
						k++;
					}// else if
					else
					{
						l--;
					}// else
				}// while
			}// for
		}// for
		
		return new ArrayList(set);
	}

}
