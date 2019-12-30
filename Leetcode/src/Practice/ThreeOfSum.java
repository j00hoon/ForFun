package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeOfSum 
{
	public static void main(String[] args) 
	{
		int arr[] = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res = threeSum(arr);
		
		System.out.println(res);
	}
	
	private static List<List<Integer>> threeSum(int arr[])
	{
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(arr);
		//-4 -1 -1 0 1 2
		for(int i = 0; i < arr.length; i++)
		{
			int j = i + 1;
			int k = arr.length - 1;
			
			if(i > 0 && arr[i] == arr[i - 1])
			{
				continue;
			}// if
			
			while(j < k)
			{
				if(k < arr.length - 1 && arr[k] == arr[k + 1])
				{
					k--;
					continue;
				}// if
				else if(arr[i] + arr[j] + arr[k] > 0)
				{
					k--;
				}// if
				else if(arr[i] + arr[j] + arr[k] < 0)
				{
					j++;
				}// else if
				else
				{
					List<Integer> list = new ArrayList<>();
					list.add(arr[i]);
					list.add(arr[j]);
					list.add(arr[k]);
					res.add(list);
					j++;
					k--;
				}// else
			}// while
		}// for
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static List<List<Integer>> threeSum2(int arr[])
	{	
		List<List<Integer>> resList = new ArrayList<>();
		Arrays.sort(arr); // Sorting first! 
		
		for(int i = 0; i < arr.length; i++)
		{
			int j = i + 1;
			int k = arr.length - 1;
			
			if(i > 0 && arr[i] == arr[i - 1])
			{
				continue;
			}// if
			
			while(j < k)
			{
				if(k < arr.length - 1 && arr[k] == arr[k + 1])
				{
					k--;
					continue;
				}// if
				
				if(arr[i] + arr[j] + arr[k] > 0)
				{
					k--;
				}// if
				else if(arr[i] + arr[j] + arr[k] < 0)
				{
					j++;
				}// else if
				else
				{
					ArrayList<Integer> list = new ArrayList<>();
					list.add(arr[i]);
					list.add(arr[j]);
					list.add(arr[k]);
					resList.add(list);
					j++;
					k--;
				}// else
				
			}// while
		}// for

		
		return resList;
	}

}
