package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeOfSumTarget 
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 4, 8, 16, 32, 64, 128};
		int target = 82;
//		int arr[] = {-1, 2, 1, -4};
//		int target = 1;
		
		System.out.println(threeSumCloset(arr, target));
	}
	
	private static int threeSumCloset(int arr[], int target)
	{
		int res = 99999, tmp = 0;
		Arrays.sort(arr);
		
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			map.put(i, arr[i]);
//		}// for
		
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
				// -4 -1 1 2
				tmp = arr[i] + arr[j] + arr[k];
				//System.out.println("i : " + i + ", j : " + j + ", k : " + k + ", tmp : " + tmp + ", res : " + res);
				
				if(k < arr.length - 1 && arr[k] == arr[k + 1])
				{
					k--;
					continue;
				}// if
				else if(tmp > target)
				{
					k--;
				}// else if
				else if(tmp < target)
				{
					j++;
				}// else if
				else
				{
					return tmp;
				}// else
				if(Math.abs(target - res) > Math.abs(target - tmp))
				{
					res = tmp;
				}// if
			}// while
		}// for
		
		return res;
	}

}
