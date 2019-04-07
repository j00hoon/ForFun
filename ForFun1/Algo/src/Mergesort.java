import java.util.Arrays;

public class Mergesort 
{
	public static void main(String[] args) 
	{
		int arr[] = {44, 41, 54, 12, 81, 74, 1098, 0, 8, 9, 17, 754, 912, 0, 6, 4};
		
		MergeSort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static void MergeSort(int arr[], int start, int end)
	{
		if(start >= end)
		{
			return;
		}
		
		int mid = (end + start) / 2;
		MergeSort(arr, start, mid);
		MergeSort(arr, mid + 1, end);
		Merge(arr, start, mid, end);
	}
	
	private static void Merge(int arr[], int start, int mid, int end)
	{
		int tmp[] = new int[end - start + 1];
		int i = 0;
		int left = start;
		int right = mid + 1;
		
		while(left <= mid && right <= end)
		{
			if(arr[left] < arr[right])
			{
				tmp[i] = arr[left];
				left++;
			}//if
			else
			{
				tmp[i] = arr[right];
				right++;
			}//else
			i++;
		}//while
		
		if(left <= mid)
		{
			while(left <= mid)
			{
				tmp[i] = arr[left];
				left++;
				i++;
			}//while
		}//if
		if(right <= end)
		{
			while(right <= end)
			{
				tmp[i] = arr[right];
				right++;
				i++;
			}//while
		}//if
		
		for(int j = 0; j < tmp.length; j++)
		{
			arr[start + j] = tmp[j];
		}//for
	}
}
