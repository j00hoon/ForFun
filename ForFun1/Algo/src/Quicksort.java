import java.util.Arrays;

public class Quicksort 
{
	public static void main(String[] args) 
	{
		int arr[] = {12, 81, 74, 1098, 0, 8, 9, 17, 754, 912, 0, 6, 4};
		quickSort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static void quickSort(int arr[], int start, int end)
	{
		if(start < end)
		{
			int pivot = Partition(arr, start, end);
			quickSort(arr, start, pivot - 1);
			quickSort(arr, pivot + 1, end);
		}//if
	}
	
	private static int Partition(int arr[], int start, int end)
	{
		int i = start - 1;
		
		for(int j = start; j < end; j++)
		{
			if(arr[j] < arr[end])
			{
				i++;
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}//if
		}//for
		
		i++;
		int tmp = arr[end];
		arr[end] = arr[i];
		arr[i] = tmp;
		
		return i;
	}
}
